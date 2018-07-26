package cn.com.sdcsoft.devices;

import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by jialiang on 2018/4/19.
 */

public abstract class SdcSoftDevice implements Serializable {
    public static final String KEY_BASE = "baseInfo";
    public static final String KEY_RUN = "runInfo";
    public static final String KEY_EXCEPTION = "exceptionInfo";
    public static final String KEY_MOCK = "mockInfo";
    public static final String KEY_SETTING = "settingInfo";
    public static final String KEY_START_STOP = "startStopInfo";
    public static final String KEY_DEVICE = "deviceInfo";

    protected HashMap<String, ArrayList<DeviceFieldForUI>> fieldMap = new HashMap();

    public SdcSoftDevice() {
        fieldMap.put(KEY_BASE, new ArrayList<DeviceFieldForUI>());
        fieldMap.put(KEY_EXCEPTION, new ArrayList<DeviceFieldForUI>());
        fieldMap.put(KEY_MOCK, new ArrayList<DeviceFieldForUI>());
        fieldMap.put(KEY_SETTING, new ArrayList<DeviceFieldForUI>());
        fieldMap.put(KEY_DEVICE, new ArrayList<DeviceFieldForUI>());
        fieldMap.put(KEY_START_STOP, new ArrayList<DeviceFieldForUI>());
    }

    private String deviceNo;
    private String nickName;
    private String deviceType;
    /**
     * 设备字节长度
     */
    protected int BYTE_ARRAY_LENGTH;

    public int getDeviceBytesLength() {
        return BYTE_ARRAY_LENGTH;
    }

    public HashMap<String, ArrayList<DeviceFieldForUI>> getFieldMap() {
        return fieldMap;
    }

    public void setFieldMap(HashMap<String, ArrayList<DeviceFieldForUI>> fieldMap) {
        this.fieldMap = fieldMap;
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public void AddField(DeviceFieldForUI field) {
        if (fieldMap.containsKey(field.getKey()))
            fieldMap.get(field.getKey()).add(field);
    }

    public List<DeviceFieldForUI> getFieldsByGroupKey(String key) {
        if (fieldMap.containsKey(key))
            return fieldMap.get(key);
        return null;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public HashMap<String, DeviceFieldForUI> getBaseInfoFields() {
        return getFieldsMap((KEY_BASE));
    }

    public HashMap<String, DeviceFieldForUI> getDeviceFields() {
        return getFieldsMap((KEY_DEVICE));
    }

    public HashMap<String, DeviceFieldForUI> getExceptionFields() {
        return getFieldsMap((KEY_EXCEPTION));
    }

    public HashMap<String, DeviceFieldForUI> getMockFields() {
        return getFieldsMap((KEY_MOCK));
    }

    public HashMap<String, DeviceFieldForUI> getSettingFields() {
        return getFieldsMap((KEY_SETTING));
    }

    public HashMap<String, DeviceFieldForUI> getStartStopFields() {
        return getFieldsMap((KEY_START_STOP));
    }

    public int getExceptionCount() {
        return fieldMap.get(KEY_EXCEPTION).size();
    }

    private HashMap<String, DeviceFieldForUI> getFieldsMap(String fieldsGroupKey) {
        HashMap<String, DeviceFieldForUI> map = new HashMap();
        List<DeviceFieldForUI> list = fieldMap.get(fieldsGroupKey);
        for (DeviceFieldForUI deviceFieldForUI : list) {
            map.put(deviceFieldForUI.getName(), deviceFieldForUI);
        }
        return map;
    }

    public void setValue(SdcSoftDevice item1, SdcSoftDevice item2) {
        HashMap<String, ArrayList<DeviceFieldForUI>> map2 = item2.getFieldMap();
        item1.setFieldMap(map2);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof SdcSoftDevice)) return false;
        SdcSoftDevice tree = (SdcSoftDevice) obj;
        if (this.getDeviceNo().equals(tree.getDeviceNo())) return true;
        return false;
    }

    public abstract void handleByteField(ByteField field, byte[] bytes);

    public abstract String handleDeviceNo(byte[] bytes);

    public abstract List<DeviceFieldForUI> getDeviceFocusFields();

    /**
     * 获取设备系统状态
     * @return
     */
    public DeviceFieldForUI getDeviceStatus(){
        return getBaseInfoFields().get("ba_xitongzhuangtai");
    }
    /**
     * 获取设备模式，可用于确定设备类型
     * @return
     */
    public abstract int getMode();

    public boolean validateFalse(int bytesLength) {
        return BYTE_ARRAY_LENGTH > bytesLength;
    }

    protected class MyArrayList<E> extends ArrayList<E> {
        @Override
        public boolean add(E e) {
            return null == e || super.add(e);
        }
    }

    protected interface Media {
        String ReShui = "热水";
        String ZhengQi = "蒸汽";
        String DaoReYou = "导热油";
        String ReFeng = "热风";
        String ZhenKong = "真空";
    }

    protected interface Power {
        String YouQi = "油气";
        String Dian = "电";
        String Mei = "煤";
        String ShengWuZhi = "生物质";
    }
}
