package cn.com.sdcsoft.devices.map;

import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.PLC.BaseInfoField;
import cn.com.sdcsoft.devices.meta.PLC.DeviceField;
import cn.com.sdcsoft.devices.meta.PLC.ExceptionField;
import cn.com.sdcsoft.devices.meta.PLC.MockField;
import cn.com.sdcsoft.devices.meta.PLC.SettingField;

import java.util.HashMap;

public class DevicePointMap_PLC_DianZhengQi extends DevicePointMap {
    public static final String Key = "PLC_DianZhengQi";
    public static final String Power = "ba_ranliao";
    public static final String Media = "ba_jiezhimeijie";

    public DevicePointMap_PLC_DianZhengQi() {
        map.put("ba_yunxingxiaoshishu", ByteField.Init(new BaseInfoField(), "ba_yunxingxiaoshishu", 9, 2, "运行小时数", "时"));
        map.put("ba_yunxingtianshu", ByteField.Init(new BaseInfoField(), "ba_yunxingtianshu", 11, 2, "运行天数", "天"));
        map.put("ba_xitongzhuangtai", ByteField.Init(new BaseInfoField(), "ba_xitongzhuangtai", 13, 2, "系统状态", DevicePointMap_PLC_RanYouDaoReYou.coms_status));
        map.put("ba_ranliao", ByteField.Init(new BaseInfoField(), "ba_ranliao", 15, 2, "燃料", DevicePointMap_PLC_RanYouDaoReYou.coms_power));
        map.put("ba_jiezhimeijie", ByteField.Init(new BaseInfoField(), "ba_jiezhimeijie", 17, 2, "介质", DevicePointMap_PLC_RanYouDaoReYou.coms_media));
        map.put("ba_shuiweizhuangtai", ByteField.Init(new BaseInfoField(), "ba_shuiweizhuangtai", 19, 2, "水位状态", DevicePointMap_PLC_RanYouDaoReYou.coms_level));
        map.put("ba_ranshaoqizhuangtai", ByteField.Init(new BaseInfoField(), "ba_ranshaoqizhuangtai", 21, 2, "燃烧器状态", DevicePointMap_PLC_RanYouDaoReYou.coms_ranshaoqi_status));

        map.put("mo_zhengqiyali", ByteField.Init(new MockField(), "mo_zhengqiyali", 35, 4, "蒸汽压力", "MPa"));
        map.put("mo_zhengqiwendu", ByteField.Init(new MockField(), "mo_zhengqiwendu", 39, 4, "蒸汽温度", "℃"));
        map.put("mo_guolushuiwei", ByteField.Init(new MockField(), "mo_guolushuiwei", 43, 4, "锅炉水位", "mm"));
        map.put("mo_zhengqishunshiliuliang", ByteField.Init(new MockField(), "mo_zhengqishunshiliuliang", 47, 4, "蒸汽瞬时流量", "T/H"));
        map.put("mo_bushuishunshiliuliang", ByteField.Init(new MockField(), "mo_bushuishunshiliuliang", 51, 4, "补水瞬时流量", "T/H"));
        map.put("mo_zhengqileijiliuliang", ByteField.Init(new MockField(), "mo_zhengqileijiliuliang", 55, 4, "蒸汽累计流量", "T"));
        map.put("mo_bushuileijiliuliang", ByteField.Init(new MockField(), "mo_bushuileijiliuliang", 59, 4, "补水累计流量", "T"));
        map.put("mo_jinshuiwendu", ByteField.Init(new MockField(), "mo_jinshuiwendu", 63, 4, "进水温度", "℃"));
        map.put("mo_jinshuiyali", ByteField.Init(new MockField(), "mo_jinshuiyali", 67, 4, "进水压力", "MPa"));
        map.put("mo_bushuibengpinlvfankui", ByteField.Init(new MockField(), "mo_bushuibengpinlvfankui", 71, 4, "补水泵频率反馈", "Hz"));
        map.put("mo_ruanshuixiangyewei", ByteField.Init(new MockField(), "mo_ruanshuixiangyewei", 75, 4, "软水箱液位", "%"));
        map.put("mo_qidongjiarezushu", ByteField.Init(new MockField(), "mo_qidongjiarezushu", 79, 4, "启动加热组数", "组"));
        map.put("mo_qidongjiarezushubaifenbi", ByteField.Init(new MockField(), "mo_qidongjiarezushubaifenbi", 83, 4, "启动加热组数百分比", "%"));

        map.put("se_chaoyabaojingsheding", ByteField.Init(new SettingField(), "se_chaoyabaojingsheding", 127, 4, "超压报警设定", "MPa"));
        map.put("se_shiyongjiarezushusheding", ByteField.Init(new SettingField(), "se_shiyongjiarezushusheding", 131, 4, "使用加热组数设定", "组"));
        map.put("se_touqiejiangeshijiansheding", ByteField.Init(new SettingField(), "se_touqiejiangeshijiansheding", 135, 4, "投切间隔时间设定", "S"));
        map.put("se_kuaiqiejiangeshijiansheding", ByteField.Init(new SettingField(), "se_kuaiqiejiangeshijiansheding", 139, 4, "快切间隔时间设定", "S"));
        map.put("se_tingluyalisheding", ByteField.Init(new SettingField(), "se_tingluyalisheding", 143, 4, "停炉压力设定", "MPa"));
        map.put("se_shiyongyalisheding", ByteField.Init(new SettingField(), "se_shiyongyalisheding", 147, 4, "使用压力设定", "MPa"));
        map.put("se_qiluyalisheding", ByteField.Init(new SettingField(), "se_qiluyalisheding", 151, 4, "启炉压力设定", "MPa"));
        map.put("se_guolushuiweijidibaojingsheding", ByteField.Init(new SettingField(), "se_guolushuiweijidibaojingsheding", 155, 4, "锅炉水位极低报警设定", "mm"));
        map.put("se_geishuibengshoudongpinlvsheding", ByteField.Init(new SettingField(), "se_geishuibengshoudongpinlvsheding", 159, 4, "给水泵手动频率设定", "Hz"));
        map.put("se_bushuimubiaosheding", ByteField.Init(new SettingField(), "se_bushuimubiaosheding", 163, 4, "补水目标设定", "mm"));
        map.put("se_guolushuiweijigaobaojingsheding", ByteField.Init(new SettingField(), "se_guolushuiweijigaobaojingsheding", 167, 4, "锅炉水位极高报警设定", "mm"));
        map.put("se_qibengyeweisheding", ByteField.Init(new SettingField(), "se_qibengyeweisheding", 171, 4, "启泵液位设定", "mm"));
        map.put("se_tingbengyeweisheding", ByteField.Init(new SettingField(), "se_tingbengyeweisheding", 175, 4, "停泵液位设定", "mm"));


        map.put("de_1#bushuibengshoudongzidong", ByteField.Init(new DeviceField(), "de_1#bushuibengshoudongzidong", 199, 2, "1#补水泵", DevicePointMap_PLC_RanYouDaoReYou.coms_atuo));
        map.put("de_1#bushuibengqidongtingzhi", ByteField.Init(new DeviceField(), "de_1#bushuibengqidongtingzhi", 201, 2, "1#补水泵", DevicePointMap_PLC_RanYouDaoReYou.coms_start_stop));
        map.put("de_2#bushuibengshoudongzidong", ByteField.Init(new DeviceField(), "de_2#bushuibengshoudongzidong", 203, 2, "2#补水泵", DevicePointMap_PLC_RanYouDaoReYou.coms_atuo));
        map.put("de_2#bushuibengqidongtingzhi", ByteField.Init(new DeviceField(), "de_2#bushuibengqidongtingzhi", 205, 2, "2#补水泵", DevicePointMap_PLC_RanYouDaoReYou.coms_start_stop));
        map.put("de_baojingshuchuzhishi", ByteField.Init(new DeviceField(), "de_baojingshuchuzhishi", 207, 2, "报警输出指示", new HashMap<Integer, String>() {
            {
                put(0, "关");
                put(1, "开");
            }
        }));


        map.put("ex_shuidianjiluojicuobaojing", ByteField.Init(new ExceptionField(), "ex_shuidianjiluojicuobaojing", 233, 2, "水电极逻辑错报警", 0));
        map.put("ex_yalibiansongqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_yalibiansongqiguzhangbaojing", 233, 2, "压力变送器故障报警", 1));
        map.put("ex_shuiweibiansongqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_shuiweibiansongqiguzhangbaojing", 233, 2, "水位变送器故障报警", 2));
        map.put("ex_geishuibengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_geishuibengbianpinqiguzhang", 233, 2, "给水泵变频器故障", 3));
        map.put("ex_loudianbaojing", ByteField.Init(new ExceptionField(), "ex_loudianbaojing", 233, 2, "漏电报警", 4));
        map.put("ex_qianyabaojing", ByteField.Init(new ExceptionField(), "ex_qianyabaojing", 233, 2, "欠压报警", 5));

        map.put("ex_shuiweiweidibaojing_dianji", ByteField.Init(new ExceptionField(), "ex_shuiweiweidibaojing_dianji", 233, 2, "水位危低报警（电极）", 8));
        map.put("ex_shuiweijidibaojing_dianji", ByteField.Init(new ExceptionField(), "ex_shuiweijidibaojing_dianji", 233, 2, "水位极低报警（电极）", 9));
        map.put("ex_shuiweijigaobaojing_dianji", ByteField.Init(new ExceptionField(), "ex_shuiweijigaobaojing_dianji", 233, 2, "水位极高报警（电极）", 10));
        map.put("ex_shuiweijidibaojing_shedingzhi", ByteField.Init(new ExceptionField(), "ex_shuiweijidibaojing_shedingzhi", 233, 2, "水位极低报警（设定值）", 11));
        map.put("ex_shuiweijigaobaojing_shedingzhi", ByteField.Init(new ExceptionField(), "ex_shuiweijigaobaojing_shedingzhi", 233, 2, "水位极高报警（设定值）", 12));
        map.put("ex_chaoyabaojing_yalikaiguan", ByteField.Init(new ExceptionField(), "ex_chaoyabaojing_yalikaiguan", 233, 2, "超压报警（压力开关）", 13));
        map.put("ex_chaoyabaojing_shedingzhi", ByteField.Init(new ExceptionField(), "ex_chaoyabaojing_shedingzhi", 233, 2, "超压报警（设定值）", 14));
        map.put("ex_ruanshuixiangqueshuibaojing", ByteField.Init(new ExceptionField(), "ex_ruanshuixiangqueshuibaojing", 233, 2, "软水箱缺水报警", 15));

    }
}
