package cn.com.sdcsoft.devices;

import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Device_PLC_RanYouDaoReYou extends Device_PLC {

    public Device_PLC_RanYouDaoReYou() {
        this.BYTE_ARRAY_LENGTH = 245;
    }

    @Override
    public List<DeviceFieldForUI> getDeviceFocusFields() {
        HashMap<String, DeviceFieldForUI> map = this.getBaseInfoFields();
        ArrayList<DeviceFieldForUI> list = new MyArrayList<DeviceFieldForUI>();
        list.add(this.getBaseInfoFields().get("ba_yunxingtianshu"));
        list.add(this.getBaseInfoFields().get("ba_yunxingxiaoshishu"));
        return list;
    }
}