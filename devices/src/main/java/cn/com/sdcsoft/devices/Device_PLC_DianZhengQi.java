package cn.com.sdcsoft.devices;

import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Device_PLC_DianZhengQi extends Device_PLC {
    private  static  final  String KEY_POINT_JIA_RE_ZU = "mo_qidongjiarezushu";
    public Device_PLC_DianZhengQi() {
        this.BYTE_ARRAY_LENGTH = 245;
    }

    @Override
    public List<DeviceFieldForUI> getDeviceFocusFields() {
        HashMap<String, DeviceFieldForUI> map = this.getBaseInfoFields();
        ArrayList<DeviceFieldForUI> list = new MyArrayList<DeviceFieldForUI>();
        list.add(this.getBaseInfoFields().get(SdcSoftDevice.KEY_POINT_RUN_DAYS));
        list.add(this.getBaseInfoFields().get(SdcSoftDevice.KEY_POINT_RUN_HOURS));

        list.add(getUiItem(this.getMockFields(),"mo_qidongjiarezushu"));
        list.add(getUiItem(this.getBaseInfoFields(),"ba_shuiweizhuangtai"));
        if (this.getBaseInfoFields().containsKey("mo_zhengqiyali")) {
            list.add(this.getBaseInfoFields().get("mo_zhengqiyali"));
        } else {
            list.add(getUiItem(this.getMockFields(),"ba_guoluyalizhuangtai"));
        }

        return list;
    }

    @Override
    protected DeviceFieldForUI getPowerInfo() {
        return getMockFields().get(KEY_POINT_JIA_RE_ZU);
    }

}
