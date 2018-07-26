package cn.com.sdcsoft.devices.meta;

import java.util.HashMap;

/**
 * Created by jialiang on 2018/4/19.
 */

public abstract class ByteField {
    protected String name;
    private String unit;
    private String title;
    private int startIndex, bytesLength, baseNumber;
    protected int bit;
    protected HashMap<Integer, String> valueMap;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return null == unit ? "" : unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public int getBytesLength() {
        return bytesLength;
    }

    public void setBytesLength(Integer bytesLength) {
        this.bytesLength = bytesLength;
    }

    public int getBaseNumber() {
        return baseNumber;
    }

    public void setBaseNumber(int baseNumber) {
        this.baseNumber = baseNumber;
    }

    public void setBit(int bit) {
        this.bit = bit;
    }

    public void setValueMap(HashMap<Integer, String> valueMap) {
        this.valueMap = valueMap;
    }

    public abstract void setDeviceFieldForUIKey(DeviceFieldForUI fieldForUI);

    public abstract Object getValue();

    public abstract boolean haveValue(byte... bytes);

    public String getValueString() {
        return String.format("%s%s", getValue().toString(), getUnit());
    }

    public DeviceFieldForUI getDeviceFieldForUI() {
        DeviceFieldForUI fieldForUI = new DeviceFieldForUI();
        setDeviceFieldForUIKey(fieldForUI);
        fieldForUI.setName(getName());
        fieldForUI.setTitle(getTitle());
        fieldForUI.setValue(getValue());
        fieldForUI.setValueString(getValueString());
        return fieldForUI;
    }

    public static ByteField Init(ByteField field, String name, int startIndex, int bytesLength, String title) {
        field.setName(name);
        field.setStartIndex(startIndex);
        field.setBytesLength(bytesLength);
        field.setTitle(title);
        return field;
    }

    public static ByteField Init(ByteField field, String name, int startIndex, int bytesLength, String title, HashMap<Integer, String> valueMap) {
        Init(field, name, startIndex, bytesLength, title);
        field.setValueMap(valueMap);
        return field;
    }

    public static ByteField Init(ByteField field, String name, int startIndex, int bytesLength, String title, String unit) {
        Init(field, name, startIndex, bytesLength, title);
        field.setUnit(unit);
        return field;
    }

    public static ByteField Init(ByteField field, String name, int startIndex, int bytesLength, String title, int bit) {
        Init(field, name, startIndex, bytesLength, title);
        field.setBit(bit);
        return field;
    }

    public static ByteField Init(ByteField field, String name, int startIndex, int bytesLength, String title, String unit, int baseNumber) {
        Init(field, name, startIndex, bytesLength, title, unit);
        field.setBaseNumber(baseNumber);
        return field;
    }

}
