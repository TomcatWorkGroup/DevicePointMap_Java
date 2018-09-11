package cn.com.sdcsoft.devices;

import cn.com.sdcsoft.devices.entity.Element;
import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Device_CTL_NJZJ_IPK2 extends Device_CTL {
    private  static final String Device_Suffix_Beng = "_beng";
    private  static final String Device_Suffix_Fan = "_fan";

    private  static final String KEY_POINT_RAN_SHAO_QI = "de_ranshaoqi";
    private  static final String KEY_POINT_JIA_RE_ZU = "se_jiarezushu";
    private  static final String KEY_POINT_YIN_FENG_JI = "de_yinfengji_fan";

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

        list.add(this.getBaseInfoFields().get(SdcSoftDevice.KEY_POINT_RUN_DAYS));
        list.add(this.getBaseInfoFields().get(SdcSoftDevice.KEY_POINT_RUN_HOURS));

        if (map.get(SdcSoftDevice.KEY_POINT_POWER).getValue().equals(Power.Dian)) {
            if (map.get(SdcSoftDevice.KEY_POINT_MEDIA).getValue().equals(Media.ReShui)) {
                list.add(getUiItem(this.getDeviceFields(),"de_jiarezu"));
                list.add(getUiItem(this.getMockFields(),"mo_chukouwendu"));
                list.add(getUiItem(this.getMockFields(),"mo_rukouwendu"));
                list.add(getUiItem(this.getBaseInfoFields(),"ba_shuixiangshuiweizhuangtai"));
                list.add(getUiItem(this.getBaseInfoFields(),"ba_guolushuiweizhuangtai"));
            } else if (map.get(SdcSoftDevice.KEY_POINT_MEDIA).getValue().equals(Media.DaoReYou)) {

            } else if (map.get(SdcSoftDevice.KEY_POINT_MEDIA).getValue().equals(Media.ReFeng)) {

            } else if (map.get(SdcSoftDevice.KEY_POINT_MEDIA).getValue().equals(Media.ZhengQi)) {
                list.add(getUiItem(this.getDeviceFields(),"de_jiarezu"));
                list.add(getUiItem(this.getBaseInfoFields(),"ba_guolushuiweizhuangtai"));
                if (this.getBaseInfoFields().containsKey("ba_guoluyalizhuangtai")) {
                    list.add(this.getBaseInfoFields().get("ba_guoluyalizhuangtai"));
                } else {
                    list.add(getUiItem(this.getMockFields(),"mo_zhengqiyali"));
                }
            } else if (map.get(SdcSoftDevice.KEY_POINT_MEDIA).getValue().equals(Media.ZhenKong)) {

            }
        } else if (map.get(SdcSoftDevice.KEY_POINT_POWER).getValue().equals(Power.Mei)) {
            if (map.get(SdcSoftDevice.KEY_POINT_MEDIA).getValue().equals(Media.ReShui)) {
                list.add(getUiItem(this.getMockFields(),"mo_paiyanwendu"));
                list.add(getUiItem(this.getMockFields(),"mo_chukouwendu"));
                list.add(getUiItem(this.getMockFields(),"mo_rukouwendu"));
                if (this.getBaseInfoFields().containsKey("ba_guoluyalizhuangtai")) {
                    list.add(this.getBaseInfoFields().get("ba_guoluyalizhuangtai"));
                } else {
                    list.add(getUiItem(this.getMockFields(),"mo_zhengqiyali"));
                }

            } else if (map.get(SdcSoftDevice.KEY_POINT_MEDIA).getValue().equals(Media.DaoReYou)) {
                list.add(getUiItem(this.getMockFields(),"mo_paiyanwendu"));
                list.add(getUiItem(this.getMockFields(),"mo_chukouwendu"));
                list.add(getUiItem(this.getMockFields(),"mo_rukouwendu"));
                if (this.getBaseInfoFields().containsKey("ba_guoluyalizhuangtai")) {
                    list.add(this.getBaseInfoFields().get("ba_guoluyalizhuangtai"));
                } else {
                    list.add(getUiItem(this.getMockFields(),"mo_zhengqiyali"));
                }
            } else if (map.get(SdcSoftDevice.KEY_POINT_MEDIA).getValue().equals(Media.ReFeng)) {

            } else if (map.get(SdcSoftDevice.KEY_POINT_MEDIA).getValue().equals(Media.ZhengQi)) {
                if (this.getBaseInfoFields().containsKey("ba_guoluyalizhuangtai")) {
                    list.add(this.getBaseInfoFields().get("ba_guoluyalizhuangtai"));
                } else {
                    list.add(getUiItem(this.getMockFields(),"mo_zhengqiyali"));
                }
                list.add(getUiItem(this.getMockFields(),"mo_paiyanwendu"));
                list.add(getUiItem(this.getBaseInfoFields(),"ba_guolushuiweizhuangtai"));

            } else if (map.get(SdcSoftDevice.KEY_POINT_MEDIA).getValue().equals(Media.ZhenKong)) {

            }
        } else if (map.get(SdcSoftDevice.KEY_POINT_POWER).getValue().equals(Power.ShengWuZhi)) {
            if (map.get(SdcSoftDevice.KEY_POINT_MEDIA).getValue().equals(Media.ReShui)) {

            } else if (map.get(SdcSoftDevice.KEY_POINT_MEDIA).getValue().equals(Media.DaoReYou)) {

            } else if (map.get(SdcSoftDevice.KEY_POINT_MEDIA).getValue().equals(Media.ReFeng)) {

            } else if (map.get(SdcSoftDevice.KEY_POINT_MEDIA).getValue().equals(Media.ZhengQi)) {

            } else if (map.get(SdcSoftDevice.KEY_POINT_MEDIA).getValue().equals(Media.ZhenKong)) {

            }
        } else if (map.get(SdcSoftDevice.KEY_POINT_POWER).getValue().equals(Power.YouQi)) {
            if (map.get(SdcSoftDevice.KEY_POINT_MEDIA).getValue().equals(Media.ReShui)) {
                list.add(getUiItem(this.getMockFields(),"mo_paiyanwendu"));
                list.add(getUiItem(this.getMockFields(),"mo_chukouwendu"));
                list.add(getUiItem(this.getMockFields(),"mo_rukouwendu"));
                list.add(getUiItem(this.getBaseInfoFields(),"ba_guolushuiweizhuangtai"));
                list.add(getUiItem(this.getBaseInfoFields(),"ba_shuixiangshuiweizhuangtai"));
            } else if (map.get(SdcSoftDevice.KEY_POINT_MEDIA).getValue().equals(Media.DaoReYou)) {
                list.add(getUiItem(this.getMockFields(),"mo_paiyanwendu"));
                list.add(getUiItem(this.getMockFields(),"mo_chukouwendu"));
                list.add(getUiItem(this.getMockFields(),"mo_rukouwendu"));
            } else if (map.get(SdcSoftDevice.KEY_POINT_MEDIA).getValue().equals(Media.ReFeng)) {
                list.add(getUiItem(this.getMockFields(),"mo_chukouwendu"));
                list.add(getUiItem(this.getDeviceFields(),"de_ranshaoqi"));
                list.add(getUiItem(this.getDeviceFields(),"de_yinfengji"));
            } else if (map.get(SdcSoftDevice.KEY_POINT_MEDIA).getValue().equals(Media.ZhengQi)) {
                list.add(getUiItem(this.getBaseInfoFields(),"ba_guolushuiweizhuangtai"));
                list.add(getUiItem(this.getMockFields(),"mo_paiyanwendu"));

                if (this.getBaseInfoFields().containsKey("ba_guoluyalizhuangtai")) {
                    list.add(this.getBaseInfoFields().get("ba_guoluyalizhuangtai"));
                } else {
                    list.add(getUiItem(this.getMockFields(),"mo_zhengqiyali"));
                }

            } else if (map.get(SdcSoftDevice.KEY_POINT_MEDIA).getValue().equals(Media.ZhenKong)) {
                list.add(getUiItem(this.getMockFields(),"mo_paiyanwendu"));
                list.add(getUiItem(this.getMockFields(),"mo_chukouwendu"));
                list.add(getUiItem(this.getMockFields(),"mo_meishuiwendu"));
                list.add(getUiItem(this.getBaseInfoFields(),"ba_guolushuiweizhuangtai"));
                if (this.getBaseInfoFields().containsKey("ba_guoluyalizhuangtai")) {
                    list.add(this.getBaseInfoFields().get("ba_guoluyalizhuangtai"));
                } else {
                    list.add(getUiItem(this.getMockFields(),"mo_zhengqiyali"));
                }

            }
        }
        return list;
    }

    @Override
    public int getMode() {
        return (Integer) this.getBaseInfoFields().get("ba_moshibianhao").getValue();
    }

    @Override
    protected DeviceFieldForUI getPowerInfo() {
        DeviceFieldForUI power = getBaseInfoFields().get(KEY_POINT_POWER);
        if (power.getValue().equals(Power.Dian))
        {
            return getSettingFields().get(KEY_POINT_JIA_RE_ZU);
        }
        else if (power.getValue().equals(Power.Mei))
        {
            return getDeviceFields().get(KEY_POINT_YIN_FENG_JI);
        }
        return getDeviceFields().get(KEY_POINT_RAN_SHAO_QI);
    }
    @Override
    public List<Element> getBeng() {
        return getElements(Device_Suffix_Beng,Element.Prefix_Beng,Element.Index_Beng_Count);
    }
    @Override
    public List<Element> getFan() {
        return getElements(Device_Suffix_Fan,Element.Prefix_Fan,Element.Index_Fan_Count);
    }

    private  List<Element> getElements(String deviceSuffix,String elementPrefix,int valueIndex){
        List<Element> list = new ArrayList<Element>();
        for(DeviceFieldForUI device : getDeviceFields().values())
        {
            if (device.getName().contains(deviceSuffix))
            {
                Element element = new Element();
                element.setTitle(device.getTitle());
                element.setPrefix(elementPrefix);

                int value = (Integer)device.getValue();
                int v = value & 0x80;

                if (0x80 == v)
                {
                   element.SetValues(valueIndex, 1,1);
                }
                else
                {
                    element.SetValues(valueIndex, 1, 0);
                }
                list.add(element);
            }
        }
        return list;
    }
}
