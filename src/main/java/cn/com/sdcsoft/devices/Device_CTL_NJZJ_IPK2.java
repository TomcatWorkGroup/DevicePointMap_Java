package cn.com.sdcsoft.devices;

import cn.com.sdcsoft.devices.map.DevicePointMap_CTL_NJZJ_IPK2;
import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Device_CTL_NJZJ_IPK2 extends Device_CTL {
    @Override
    public String handleDeviceNo(byte[] bytes) {
        String deviceNo = new String(bytes, 0, 20);
        String de = deviceNo.substring(deviceNo.length() - 10, deviceNo.length());
        setDeviceNo(de);
        return de;
    }

    @Override
    public List<DeviceFieldForUI> getDeviceFocusFields() {
        HashMap<String, DeviceFieldForUI> map = this.getBaseInfoFields();
        ArrayList<DeviceFieldForUI> list = new MyArrayList<DeviceFieldForUI>();

        list.add(this.getBaseInfoFields().get("ba_yunxingtianshu"));
        list.add(this.getBaseInfoFields().get("ba_yunxingxiaoshishu"));

        if (map.get(DevicePointMap_CTL_NJZJ_IPK2.Power).getValueString().equals(Power.Dian)) {
            if (map.get(DevicePointMap_CTL_NJZJ_IPK2.Media).getValueString().equals(Media.ReShui)) {
                list.add(this.getDeviceFields().get("de_jiarezu"));
                list.add(this.getMockFields().get("mo_chukouwendu"));
                list.add(this.getMockFields().get("mo_rukouwendu"));
                list.add(this.getBaseInfoFields().get("ba_shuixiangshuiweizhuangtai"));
                list.add(this.getBaseInfoFields().get("ba_guolushuiweizhuangtai"));
            } else if (map.get(DevicePointMap_CTL_NJZJ_IPK2.Media).getValueString().equals(Media.DaoReYou)) {

            } else if (map.get(DevicePointMap_CTL_NJZJ_IPK2.Media).getValueString().equals(Media.ReFeng)) {

            } else if (map.get(DevicePointMap_CTL_NJZJ_IPK2.Media).getValueString().equals(Media.ZhengQi)) {
                list.add(this.getDeviceFields().get("de_jiarezu"));
                list.add(this.getBaseInfoFields().get("ba_guolushuiweizhuangtai"));
                if (this.getBaseInfoFields().containsKey("ba_guoluyalizhuangtai")) {
                    list.add(this.getBaseInfoFields().get("ba_guoluyalizhuangtai"));
                } else {
                    list.add(this.getMockFields().get("mo_zhengqiyali"));
                }
            } else if (map.get(DevicePointMap_CTL_NJZJ_IPK2.Media).getValueString().equals(Media.ZhenKong)) {

            }
        } else if (map.get(DevicePointMap_CTL_NJZJ_IPK2.Power).getValueString().equals(Power.Mei)) {
            if (map.get(DevicePointMap_CTL_NJZJ_IPK2.Media).getValueString().equals(Media.ReShui)) {
                list.add(this.getMockFields().get("mo_paiyanwendu"));
                list.add(this.getMockFields().get("mo_chukouwendu"));
                list.add(this.getMockFields().get("mo_rukouwendu"));
                if (this.getBaseInfoFields().containsKey("ba_guoluyalizhuangtai")) {
                    list.add(this.getBaseInfoFields().get("ba_guoluyalizhuangtai"));
                } else {
                    list.add(this.getMockFields().get("mo_zhengqiyali"));
                }

            } else if (map.get(DevicePointMap_CTL_NJZJ_IPK2.Media).getValueString().equals(Media.DaoReYou)) {
                list.add(this.getMockFields().get("mo_paiyanwendu"));
                list.add(this.getMockFields().get("mo_chukouwendu"));
                list.add(this.getMockFields().get("mo_rukouwendu"));
                if (this.getBaseInfoFields().containsKey("ba_guoluyalizhuangtai")) {
                    list.add(this.getBaseInfoFields().get("ba_guoluyalizhuangtai"));
                } else {
                    list.add(this.getMockFields().get("mo_zhengqiyali"));
                }
            } else if (map.get(DevicePointMap_CTL_NJZJ_IPK2.Media).getValueString().equals(Media.ReFeng)) {

            } else if (map.get(DevicePointMap_CTL_NJZJ_IPK2.Media).getValueString().equals(Media.ZhengQi)) {
                if (this.getBaseInfoFields().containsKey("ba_guoluyalizhuangtai")) {
                    list.add(this.getBaseInfoFields().get("ba_guoluyalizhuangtai"));
                } else {
                    list.add(this.getMockFields().get("mo_zhengqiyali"));
                }
                list.add(this.getMockFields().get("mo_paiyanwendu"));
                list.add(this.getBaseInfoFields().get("ba_guolushuiweizhuangtai"));

            } else if (map.get(DevicePointMap_CTL_NJZJ_IPK2.Media).getValueString().equals(Media.ZhenKong)) {

            }
        } else if (map.get(DevicePointMap_CTL_NJZJ_IPK2.Power).getValueString().equals(Power.ShengWuZhi)) {
            if (map.get(DevicePointMap_CTL_NJZJ_IPK2.Media).getValueString().equals(Media.ReShui)) {

            } else if (map.get(DevicePointMap_CTL_NJZJ_IPK2.Media).getValueString().equals(Media.DaoReYou)) {

            } else if (map.get(DevicePointMap_CTL_NJZJ_IPK2.Media).getValueString().equals(Media.ReFeng)) {

            } else if (map.get(DevicePointMap_CTL_NJZJ_IPK2.Media).getValueString().equals(Media.ZhengQi)) {

            } else if (map.get(DevicePointMap_CTL_NJZJ_IPK2.Media).getValueString().equals(Media.ZhenKong)) {

            }
        } else if (map.get(DevicePointMap_CTL_NJZJ_IPK2.Power).getValueString().equals(Power.YouQi)) {
            if (map.get(DevicePointMap_CTL_NJZJ_IPK2.Media).getValueString().equals(Media.ReShui)) {
                list.add(this.getMockFields().get("mo_paiyanwendu"));
                list.add(this.getMockFields().get("mo_chukouwendu"));
                list.add(this.getMockFields().get("mo_rukouwendu"));
                list.add(this.getBaseInfoFields().get("ba_guolushuiweizhuangtai"));
                list.add(this.getBaseInfoFields().get("ba_shuixiangshuiweizhuangtai"));
            } else if (map.get(DevicePointMap_CTL_NJZJ_IPK2.Media).getValueString().equals(Media.DaoReYou)) {
                list.add(this.getMockFields().get("mo_paiyanwendu"));
                list.add(this.getMockFields().get("mo_chukouwendu"));
                list.add(this.getMockFields().get("mo_rukouwendu"));
            } else if (map.get(DevicePointMap_CTL_NJZJ_IPK2.Media).getValueString().equals(Media.ReFeng)) {
                list.add(this.getMockFields().get("mo_chukouwendu"));
                list.add(this.getDeviceFields().get("de_ranshaoqi"));
                list.add(this.getDeviceFields().get("de_yinfengji"));
            } else if (map.get(DevicePointMap_CTL_NJZJ_IPK2.Media).getValueString().equals(Media.ZhengQi)) {
                list.add(this.getBaseInfoFields().get("ba_guolushuiweizhuangtai"));
                list.add(this.getMockFields().get("mo_paiyanwendu"));

                if (this.getBaseInfoFields().containsKey("ba_guoluyalizhuangtai")) {
                    list.add(this.getBaseInfoFields().get("ba_guoluyalizhuangtai"));
                } else {
                    list.add(this.getMockFields().get("mo_zhengqiyali"));
                }

            } else if (map.get(DevicePointMap_CTL_NJZJ_IPK2.Media).getValueString().equals(Media.ZhenKong)) {
                list.add(this.getMockFields().get("mo_paiyanwendu"));
                list.add(this.getMockFields().get("mo_chukouwendu"));
                list.add(this.getMockFields().get("mo_meishuiwendu"));
                list.add(this.getBaseInfoFields().get("ba_guolushuiweizhuangtai"));
                if (this.getBaseInfoFields().containsKey("ba_guoluyalizhuangtai")) {
                    list.add(this.getBaseInfoFields().get("ba_guoluyalizhuangtai"));
                } else {
                    list.add(this.getMockFields().get("mo_zhengqiyali"));
                }

            }
        }
        return list;
    }

    public int getMode() {
        return (Integer) this.getBaseInfoFields().get("ba_moshibianhao").getValue();
    }
}
