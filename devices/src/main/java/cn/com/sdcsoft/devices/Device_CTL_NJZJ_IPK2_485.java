package cn.com.sdcsoft.devices;

import cn.com.sdcsoft.devices.meta.ByteField;

public class Device_CTL_NJZJ_IPK2_485 extends Device_CTL_NJZJ_IPK2 {

    public Device_CTL_NJZJ_IPK2_485(){
        BYTE_ARRAY_LENGTH = 765;
    }

    /**
     * IPK2控制器 bytes数据 Java 中数据处理统一按照高位在前，低位在后的模式进行传递
     * @param field
     * @param bytes
     */
    @Override
    public void handleByteField(ByteField field, byte[] bytes) {

        if (field.haveValue(bytes[field.getStartIndex()], bytes[field.getStartIndex()+1])) {
            this.AddField(field.getDeviceFieldForUI());
        }
    }
    @Override
    public String handleDeviceNo(byte[] bytes) {
        return "";
    }

    @Override
    public int getMode() {
        return -1;
    }
}
