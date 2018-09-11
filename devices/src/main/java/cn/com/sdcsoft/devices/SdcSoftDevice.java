package cn.com.sdcsoft.devices;

import cn.com.sdcsoft.devices.entity.Element;
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
    public static final String KEY_POINT_SYSTEM_STATUS = "o_system_status";
    public static final String KEY_POINT_POWER = "o_power";
    public static final String KEY_POINT_MEDIA = "o_media";
    public static final String KEY_POINT_RUN_LIFE = "ba_yunxingshijian";
    public static final String KEY_POINT_RUN_DAYS = "ba_yunxingtianshu";
    public static final String KEY_POINT_RUN_HOURS = "ba_yunxingxiaoshishu";


    public static final String KEY_BASE = "baseInfo";
    public static final String KEY_RUN = "runInfo";
    public static final String KEY_EXCEPTION = "exceptionInfo";
    public static final String KEY_MOCK = "mockInfo";
    public static final String KEY_SETTING = "settingInfo";
    public static final String KEY_START_STOP = "startStopInfo";
    public static final String KEY_DEVICE = "deviceInfo";
    public static final String KEY_OPEN_CLOSE = "openclose";
    /**
     * 计算属性的KEY
     */
    public static final String KEY_Count_Fields = "countfields";

    public static final int Style_Horizontal = 0;
    public static final int Style_Vertical = 1;

    protected HashMap<String, ArrayList<DeviceFieldForUI>> fieldMap = new HashMap();

    public SdcSoftDevice() {
        fieldMap.put(KEY_BASE, new ArrayList<DeviceFieldForUI>());
        fieldMap.put(KEY_EXCEPTION, new ArrayList<DeviceFieldForUI>());
        fieldMap.put(KEY_MOCK, new ArrayList<DeviceFieldForUI>());
        fieldMap.put(KEY_SETTING, new ArrayList<DeviceFieldForUI>());
        fieldMap.put(KEY_DEVICE, new ArrayList<DeviceFieldForUI>());
        fieldMap.put(KEY_START_STOP, new ArrayList<DeviceFieldForUI>());
        fieldMap.put(KEY_OPEN_CLOSE, new ArrayList<DeviceFieldForUI>());
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

    public HashMap<String, DeviceFieldForUI> getOpenCloseFields() {
        return getFieldsMap((KEY_OPEN_CLOSE));
    }
    HashMap<String, DeviceFieldForUI> getCountFields()
    {
        return getFieldsMap(KEY_Count_Fields);
    }

    protected DeviceFieldForUI getUiItem(HashMap<String, DeviceFieldForUI> map, String key){
        if (map.containsKey(key))
        {
            return map.get(key);
        }
        return null;
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

    public abstract void handleByteField(ByteField field, byte[] bytes);

    public abstract String handleDeviceNo(byte[] bytes);

    public abstract List<DeviceFieldForUI> getDeviceFocusFields();

    /**
     * 获取设备系统状态
     * @return
     */
    public DeviceFieldForUI getDeviceStatus(){
        return getBaseInfoFields().get(KEY_POINT_SYSTEM_STATUS);
    }

    /**
     * 获取设备燃料
     * @return
     */
    public DeviceFieldForUI getPower(){
        return getBaseInfoFields().get(KEY_POINT_POWER);
    }

    /**
     * 获取设备介质
     * @return
     */
    public DeviceFieldForUI getMedia(){
        return getBaseInfoFields().get(KEY_POINT_MEDIA);
    }
    /**
     * 获取设备模式，可用于确定设备类型
     * @return
     */
    public abstract int getMode();


    protected abstract DeviceFieldForUI getPowerInfo();


    /**
     * 获取炉子元素信息
     * @return
     */
    public Element getStoveElement()
    {
        Element element = new Element();
        element.setPrefix(Element.Prefix_Stove);
        element.setTitle("锅炉");
        element.SetValues(Element.Index_A_Power, (Integer)getPower().getValue(), (Integer)getMedia().getValue(), Style_Horizontal, (Integer)getPowerInfo().getValue());
        return element;
    }

    /**
     * 获取泵元素集合
     * @return
     */
    public abstract List<Element> getBeng();

    /**
     * 获取风扇元素集合
     * @return
     */
    public abstract List<Element> getFan();

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
        int ReShui = 0;
        int ZhengQi = 1;
        int DaoReYou = 2;
        int ReFeng = 3;
        int ZhenKong = 4;
    }

    protected interface Power {
        int YouQi = 0;
        int Dian = 1;
        int Mei = 2;
        int ShengWuZhi = 3;
    }
}
