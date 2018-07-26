package cn.com.sdcsoft.devices.meta;

import java.io.Serializable;

/**
 * Created by jialiang on 2018/4/20.
 */

public class DeviceFieldForUI implements Serializable{
    private String name;
    private Object value;
    private String key;
    private String title;
    private String valueString;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValueString() {
        return valueString;
    }

    public void setValueString(String valueString) {
        this.valueString = valueString;
    }
}
