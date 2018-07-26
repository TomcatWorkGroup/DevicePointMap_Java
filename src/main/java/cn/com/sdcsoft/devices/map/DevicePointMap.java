package cn.com.sdcsoft.devices.map;


import cn.com.sdcsoft.devices.meta.ByteField;

import java.util.LinkedHashMap;


/**
 * Created by jialiang on 2018/4/20.
 */

public abstract class DevicePointMap {
    protected LinkedHashMap<String,ByteField> map = new LinkedHashMap();
    public LinkedHashMap<String, ByteField> getPointMap() {
        return map;
    }
}
