package cn.com.sdcsoft.devices;

import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Device_PLC_RanYouReShui extends Device_PLC {
    public Device_PLC_RanYouReShui() {
        BYTE_ARRAY_LENGTH = 490;
    }

    @Override
    public List<DeviceFieldForUI> getDeviceFocusFields() {
        HashMap<String, DeviceFieldForUI> map = this.getBaseInfoFields();
        ArrayList<DeviceFieldForUI> list = new MyArrayList<DeviceFieldForUI>();

        list.add(this.getBaseInfoFields().get("ba_yunxingtianshu"));
        list.add(this.getBaseInfoFields().get("ba_yunxingxiaoshishu"));

        list.add(this.getMockFields().get("mo_paiyanwendu"));
        list.add(this.getMockFields().get("mo_chushuiwendu"));
        list.add(this.getMockFields().get("mo_huishuiwendu"));
        list.add(this.getBaseInfoFields().get("ba_shuiweizhuangtai"));

        return list;
    }

}
