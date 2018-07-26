package cn.com.sdcsoft.devices.meta;


import cn.com.sdcsoft.devices.SdcSoftDevice;

import java.util.Locale;

/**
 * Created by jialiang on 2018/4/19.
 */

public abstract class BaseInfoField extends ByteField {
    protected int value;
    protected StringBuilder sb = new StringBuilder();

    @Override
    public Object getValue() {
//        if (value != null && 0 > value)
//            value &= 0xFF;
//        return String.format(Locale.CHINA, "%d %s", value, sb.toString());
        return value;
    }


    @Override
    public void setDeviceFieldForUIKey(DeviceFieldForUI fieldForUI) {
        fieldForUI.setKey(SdcSoftDevice.KEY_BASE);
    }
}
