package cn.com.sdcsoft.devices.meta;


import cn.com.sdcsoft.devices.SdcSoftDevice;

import java.util.Locale;


/**
 * Created by jialiang on 2018/4/19.
 */
@Deprecated
public abstract class RunDaysField extends ByteField {
    protected Integer days;
    protected StringBuilder sb = new StringBuilder();

    @Override
    public Object getValue() {
        return String.format(Locale.CHINA,"%d %s",days,sb.toString());
    }

    @Override
    public void setDeviceFieldForUIKey(DeviceFieldForUI fieldForUI) {
        fieldForUI.setKey(SdcSoftDevice.KEY_RUN);
    }

}
