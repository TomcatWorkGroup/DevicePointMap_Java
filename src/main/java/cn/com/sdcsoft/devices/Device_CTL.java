package cn.com.sdcsoft.devices;

import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

import java.util.List;

public abstract class Device_CTL extends SdcSoftDevice {

    public Device_CTL(){
        BYTE_ARRAY_LENGTH = 1024;
    }

    /**
     * IPK2控制器 bytes数据 Java 中数据处理统一按照高位在前，低位在后的模式进行传递
     * @param field
     * @param bytes
     */
    @Override
    public void handleByteField(ByteField field, byte[] bytes) {

        if (field.haveValue(bytes[field.getStartIndex()+1], bytes[field.getStartIndex()])) {
            this.AddField(field.getDeviceFieldForUI());
        }
    }
}
