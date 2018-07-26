package cn.com.sdcsoft.devices;

import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

import java.math.BigInteger;
import java.util.List;

public abstract class Device_PLC extends SdcSoftDevice {
    @Override
    public void handleByteField(ByteField field, byte[] bytes) {
        if(field.getBytesLength()==2){
            if (field.haveValue(bytes[field.getStartIndex()], bytes[field.getStartIndex()+1])) {
                this.AddField(field.getDeviceFieldForUI());
            }
        }else if(field.getBytesLength()==4){
            if (field.haveValue(bytes[field.getStartIndex()], bytes[field.getStartIndex()+1], bytes[field.getStartIndex()+2], bytes[field.getStartIndex()+3])) {
                this.AddField(field.getDeviceFieldForUI());
            }
        }
    }

    @Override
    public String handleDeviceNo(byte[] bytes) {
        String deviceNo=String.format("%1$010d",new BigInteger(new byte[]{bytes[5],bytes[6],bytes[7],bytes[8]}).intValue());
        setDeviceNo(deviceNo);
        return deviceNo;
    }

    @Override
    public int getMode() {
        return 0;
    }
}
