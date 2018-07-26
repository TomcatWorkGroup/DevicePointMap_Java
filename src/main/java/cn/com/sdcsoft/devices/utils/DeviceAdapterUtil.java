package cn.com.sdcsoft.devices.utils;

import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.map.DevicePointMap;
import cn.com.sdcsoft.devices.meta.ByteField;

import java.util.*;

/**
 * Created by jialiang on 2018/4/20.
 */

public class DeviceAdapterUtil {
    private static final String STRING_FORMAT_DEVICE_MAP_PACKAGE_PATH="cn.com.sdcsoft.devices.map.DevicePointMap_%s";
    private static final String STRING_FORMAT_DEVICE_PACKAGE_PATH="cn.com.sdcsoft.devices.Device_%s";
    private static  ArrayList<SdcSoftDevice> devices ;
    private static HashMap<String,DevicePointMap> maps ;
    static {
        devices = new ArrayList(10);
        maps = new HashMap(5);
    }
    public static void  putDeviceType(String typeName) throws Exception{
        Class deviceClazz = Class.forName(String.format(Locale.CHINA, STRING_FORMAT_DEVICE_PACKAGE_PATH, typeName));
        if(!maps.containsKey(typeName)){
            Class mapClazz  = Class.forName(String.format(Locale.CHINA, STRING_FORMAT_DEVICE_MAP_PACKAGE_PATH, typeName));
            DevicePointMap devicePointMap = (DevicePointMap) mapClazz.newInstance();
            maps.put(typeName,devicePointMap);
        }
        SdcSoftDevice device = (SdcSoftDevice) deviceClazz.newInstance();
        device.setDeviceType(typeName);
        devices.add(device);
    }

    public static void clearDevicesType(){
        devices.clear();
        maps.clear();
    }
    /**
     * 获得plc数据列表信息
     *
     * @param bytes
     * @return
     */
    public static List<SdcSoftDevice> getDevicesByByte(byte[] bytes) throws Exception {
        if (devices.size() < 1) {
            throw new Exception("请先执行DeviceAdapterUtil.putDeviceType方法，放入准备用于解析的设备的类型。");
        }
        List<SdcSoftDevice> list = null;
        int byteStartIndex = 0;
        for (SdcSoftDevice device : devices) {
            initDevice(device, bytes,byteStartIndex);
            byteStartIndex+= device.getDeviceBytesLength();
        }
        return  devices;
    }

    /**
     * 获得plc数据信息
     *
     * @param bytes
     * @return
     */
    public static SdcSoftDevice getDeviceByByte(byte[] bytes, String typeName) {
        SdcSoftDevice device = null;
        try {
            Class clazz = Class.forName(String.format(Locale.CHINA, STRING_FORMAT_DEVICE_PACKAGE_PATH, typeName));
            device = (SdcSoftDevice) clazz.newInstance();
            if (device.validateFalse(bytes.length))
            {
                return null;
            }
            device.handleDeviceNo(bytes);
            clazz = Class.forName(String.format(Locale.CHINA, STRING_FORMAT_DEVICE_MAP_PACKAGE_PATH, typeName));
            DevicePointMap devicePointMap = (DevicePointMap) clazz.newInstance();

            if (devicePointMap == null)
                return null;
            for (String key : devicePointMap.getPointMap().keySet()) {
                ByteField f = devicePointMap.getPointMap().get(key);
                device.handleByteField(f, bytes);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return device;
    }

    public static  void initDevice(SdcSoftDevice device, byte[] bytes,int byteStartIndex) {
        int endIndex = byteStartIndex+device.getDeviceBytesLength();
        /**
         * 校验数据长度有效性
         */
        if(bytes.length < endIndex)
            return;
        /**
         * byte 数组裁剪
         */
        byte[] current = new byte[device.getDeviceBytesLength()];

        for (int i = 0,j = byteStartIndex; j < endIndex; i++,j++) {
            current[i] = bytes[j];
        }

        /**
         * 填充设备信息
         */
        DevicePointMap devicePointMap = maps.get(device.getDeviceType());
        device.handleDeviceNo(current);
        for (String key : devicePointMap.getPointMap().keySet()) {
            ByteField f = devicePointMap.getPointMap().get(key);
            device.handleByteField(f, current);
        }
    }
}
