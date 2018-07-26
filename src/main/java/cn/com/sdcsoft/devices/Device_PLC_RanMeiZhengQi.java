package cn.com.sdcsoft.devices;

import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Device_PLC_RanMeiZhengQi extends Device_PLC {
    public Device_PLC_RanMeiZhengQi() {
        BYTE_ARRAY_LENGTH = 490;
    }

    @Override
    public List<DeviceFieldForUI> getDeviceFocusFields() {
        HashMap<String, DeviceFieldForUI> map = this.getBaseInfoFields();
        ArrayList<DeviceFieldForUI> list = new MyArrayList<DeviceFieldForUI>();

        list.add(this.getBaseInfoFields().get("ba_yunxingtianshu"));
        list.add(this.getBaseInfoFields().get("ba_yunxingxiaoshishu"));

        if (this.getBaseInfoFields().containsKey("ba_guoluyalizhuangtai")) {
            list.add(this.getBaseInfoFields().get("ba_guoluyalizhuangtai"));
        } else {
            list.add(this.getMockFields().get("mo_zhengqiyali"));
        }
        list.add(this.getMockFields().get("mo_zuizhongpaiyanwendu"));
        list.add(this.getBaseInfoFields().get("ba_shuiweizhuangtai"));

        return list;
    }
}
