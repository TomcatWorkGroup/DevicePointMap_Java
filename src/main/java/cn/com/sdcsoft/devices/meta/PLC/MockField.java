package cn.com.sdcsoft.devices.meta.PLC;

import java.math.BigInteger;

/**
 * @author doudou
 * 模拟信息类
 */
public class MockField extends cn.com.sdcsoft.devices.meta.MockField {

    @Override
    public boolean haveValue(byte... bytes) {
        if(this.getTitle().equals("目标温度设定")){
            System.out.println("");
        }
        int i = new BigInteger(bytes).intValue();
        if (0x7FFFFFFF == i)
            return false;

        value = Float.intBitsToFloat(i);
        return true;
    }


}
