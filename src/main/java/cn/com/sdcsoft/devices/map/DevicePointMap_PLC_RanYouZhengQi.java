package cn.com.sdcsoft.devices.map;

import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.PLC.BaseInfoField;
import cn.com.sdcsoft.devices.meta.PLC.DeviceField;
import cn.com.sdcsoft.devices.meta.PLC.ExceptionField;
import cn.com.sdcsoft.devices.meta.PLC.MockField;
import cn.com.sdcsoft.devices.meta.PLC.SettingField;

import java.util.HashMap;

/**
 * @author doudou
 * 初始化数据
 */
public class DevicePointMap_PLC_RanYouZhengQi extends DevicePointMap {
    public static final String Key = "PLC_RanYouZhenKong";
    public static final String Power = "ba_ranliao";
    public static final String Media = "ba_jiezhimeijie";

    public DevicePointMap_PLC_RanYouZhengQi() {

        map.put("ba_yunxingxiaoshishu", ByteField.Init(new BaseInfoField(), "ba_yunxingxiaoshishu", 9, 2, "运行小时数","时"));
        map.put("ba_yunxingtianshu", ByteField.Init(new BaseInfoField(), "ba_yunxingtianshu", 11, 2, "运行天数","天"));
        map.put("ba_xitongzhuangtai", ByteField.Init(new BaseInfoField(), "ba_xitongzhuangtai", 13, 2, "系统状态", DevicePointMap_PLC_RanYouDaoReYou.coms_status));
        map.put("ba_ranliao", ByteField.Init(new BaseInfoField(), "ba_ranliao", 15, 2, "燃料", DevicePointMap_PLC_RanYouDaoReYou.coms_power));
        map.put("ba_jiezhimeijie", ByteField.Init(new BaseInfoField(), "ba_jiezhimeijie", 17, 2, "介质", DevicePointMap_PLC_RanYouDaoReYou.coms_media));
        map.put("ba_shuiweizhuangtai", ByteField.Init(new BaseInfoField(), "ba_shuiweizhuangtai", 19, 2, "水位状态", DevicePointMap_PLC_RanYouDaoReYou.coms_level));
        map.put("ba_ranshaoqizhuangtai", ByteField.Init(new BaseInfoField(), "ba_ranshaoqizhuangtai", 21, 2, "燃烧器状态", DevicePointMap_PLC_RanYouDaoReYou.coms_ranshaoqi_status));

        map.put("mo_zhengqiyali", ByteField.Init(new MockField(), "mo_zhengqiyali", 35, 4, "蒸汽压力", "MPa"));
        map.put("mo_guorezhengqiyali", ByteField.Init(new MockField(), "mo_guorezhengqiyali", 39, 4, "过热蒸汽压力", "MPa"));
        map.put("mo_zhengqiwendu", ByteField.Init(new MockField(), "mo_zhengqiwendu", 43, 4, "蒸汽温度", "℃"));
        map.put("mo_guorezhengqiwendu", ByteField.Init(new MockField(), "mo_guorezhengqiwendu", 47, 4, "过热蒸汽温度", "℃"));
        map.put("mo_guolushuiwei", ByteField.Init(new MockField(), "mo_guolushuiwei", 51, 4, "锅炉水位", ""));
        map.put("mo_zhengqishunshiliuliang", ByteField.Init(new MockField(), "mo_zhengqishunshiliuliang", 55, 4, "蒸汽瞬时流量", "m³/h"));
        map.put("mo_bushuishunshiliuliang", ByteField.Init(new MockField(), "mo_bushuishunshiliuliang", 59, 4, "补水瞬时流量", "m³/h"));
        map.put("mo_lutangwendu", ByteField.Init(new MockField(), "mo_lutangwendu", 63, 4, "炉膛温度", "℃"));
        map.put("mo_lutangyali", ByteField.Init(new MockField(), "mo_lutangyali", 67, 4, "炉膛压力", "MPa"));
        map.put("mo_lengningqijinkouyanwen", ByteField.Init(new MockField(), "mo_lengningqijinkouyanwen", 71, 4, "冷凝器进口烟温", "℃"));
        map.put("mo_lengningqijinkouyanya", ByteField.Init(new MockField(), "mo_lengningqijinkouyanya", 75, 4, "冷凝器进口烟压", "kPa"));
        map.put("mo_jienengqijinkouyanwen", ByteField.Init(new MockField(), "mo_jienengqijinkouyanwen", 79, 4, "节能器进口烟温", "℃"));
        map.put("mo_jienengqijinkouyanya", ByteField.Init(new MockField(), "mo_jienengqijinkouyanya", 83, 4, "节能器进口烟压", "kPa"));
        map.put("mo_zhengqileijiliuliang", ByteField.Init(new MockField(), "mo_zhengqileijiliuliang", 87, 4, "蒸汽累计流量", "m³/h"));
        map.put("mo_bushuileijiliuliang", ByteField.Init(new MockField(), "mo_bushuileijiliuliang", 91, 4, "补水累计流量", "m³/h"));
        map.put("mo_kongyuqijinyanwendu", ByteField.Init(new MockField(), "mo_kongyuqijinyanwendu", 95, 4, "空预器进烟温度", "℃"));
        map.put("mo_kongyuqijinyanyali", ByteField.Init(new MockField(), "mo_kongyuqijinyanyali", 99, 4, "空预器进烟压力", "kPa"));
        map.put("mo_zuizhongpaiyanwendu", ByteField.Init(new MockField(), "mo_zuizhongpaiyanwendu", 103, 4, "最终排烟温度", "℃"));
        map.put("mo_zuizhongpaiyanyali", ByteField.Init(new MockField(), "mo_zuizhongpaiyanyali", 107, 4, "最终排烟压力", "MPa"));
        map.put("mo_lengningqijinshuiwendu", ByteField.Init(new MockField(), "mo_lengningqijinshuiwendu", 111, 4, "冷凝器进水温度", "℃"));
        map.put("mo_lengningqichushuiwendu", ByteField.Init(new MockField(), "mo_lengningqichushuiwendu", 115, 4, "冷凝器出水温度", "℃"));
        map.put("mo_jienengqijinshuiwendu", ByteField.Init(new MockField(), "mo_jienengqijinshuiwendu", 119, 4, "节能器进水温度", "℃"));
        map.put("mo_jienengqichushuiwendu", ByteField.Init(new MockField(), "mo_jienengqichushuiwendu", 123, 4, "节能器出水温度", "℃"));
        map.put("mo_lengningqichushuiyali", ByteField.Init(new MockField(), "mo_lengningqichushuiyali", 127, 4, "冷凝器出水压力", "MPa"));
        map.put("mo_jienengqichushuiyali", ByteField.Init(new MockField(), "mo_jienengqichushuiyali", 131, 4, "节能器出水压力", "MPa"));
        map.put("mo_bushuibengpinlüfankui", ByteField.Init(new MockField(), "mo_bushuibengpinlüfankui", 135, 4, "补水泵频率反馈", ""));
        map.put("mo_ruanshuixiangyewei", ByteField.Init(new MockField(), "mo_ruanshuixiangyewei", 139, 4, "软水箱液位", "mm"));
        map.put("mo_chuyangqiyewei", ByteField.Init(new MockField(), "mo_chuyangqiyewei", 143, 4, "除氧器液位", "mm"));
        map.put("mo_chuyangqiwendu", ByteField.Init(new MockField(), "mo_chuyangqiwendu", 147, 4, "除氧器温度", "℃"));
        map.put("mo_bushuidiandongfafankui", ByteField.Init(new MockField(), "mo_bushuidiandongfafankui", 151, 4, "补水电动阀反馈", ""));
        map.put("mo_guoreqijiangwendiandongfafankui", ByteField.Init(new MockField(), "mo_guoreqijiangwendiandongfafankui", 155, 4, "过热器降温电动阀反馈", ""));
        map.put("mo_zhufengjipinlüfankui", ByteField.Init(new MockField(), "mo_zhufengjipinlüfankui", 159, 4, "主风机频率反馈", ""));
        map.put("mo_xunhuanfengjipinlüfankui", ByteField.Init(new MockField(), "mo_xunhuanfengjipinlüfankui", 163, 4, "循环风机频率反馈", ""));
        map.put("mo_kongyuqijinfengwendu", ByteField.Init(new MockField(), "mo_kongyuqijinfengwendu", 167, 4, "空预器进风温度", "℃"));
        map.put("mo_kongyuqijinfengyali", ByteField.Init(new MockField(), "mo_kongyuqijinfengyali", 171, 4, "空预器进风压力", "MPa"));
        map.put("mo_kongyuqichufengwendu", ByteField.Init(new MockField(), "mo_kongyuqichufengwendu", 175, 4, "空预器出风温度", "℃"));
        map.put("mo_kongyuqichufengyali", ByteField.Init(new MockField(), "mo_kongyuqichufengyali", 179, 4, "空预器出风压力", "MPa"));
        map.put("mo_zhaoqiyali", ByteField.Init(new MockField(), "mo_zhaoqiyali", 183, 4, "沼气压力", "KPa"));
        map.put("mo_zhaoqishunshiliuliang", ByteField.Init(new MockField(), "mo_zhaoqishunshiliuliang", 187, 4, "沼气瞬时流量", "m³/h"));
        map.put("mo_zhaoqileijiliuliang", ByteField.Init(new MockField(), "mo_zhaoqileijiliuliang", 191, 4, "沼气累计流量", "m³/h"));
        map.put("mo_zhaoqifengjipinlvfankui", ByteField.Init(new MockField(), "mo_zhaoqifengjipinlvfankui", 195, 4, "沼气风机频率反馈","Hz"));


        map.put("se_qiluyalisheding", ByteField.Init(new SettingField(), "se_qiluyalisheding", 248, 4, "启炉压力设定", "MPa"));
        map.put("se_mubiaoyalisheding", ByteField.Init(new SettingField(), "se_mubiaoyalisheding", 252, 4, "目标压力设定", "MPa"));
        map.put("se_tingluyalisheding", ByteField.Init(new SettingField(), "se_tingluyalisheding", 256, 4, "停炉压力设定", "MPa"));
        map.put("se_chaoyabaojingyalisheding", ByteField.Init(new SettingField(), "se_chaoyabaojingyalisheding", 260, 4, "超压报警压力设定", "MPa"));
        map.put("se_paiyanchaowenbaojing", ByteField.Init(new SettingField(), "se_paiyanchaowenbaojing", 264, 4, "排烟超温报警", "℃"));
        map.put("se_guolushuiweimubiaosheding", ByteField.Init(new SettingField(), "se_guolushuiweimubiaosheding", 268, 4, "锅炉水位目标设定", "mm"));
        map.put("se_guolushuiweijigaobaojingsheding", ByteField.Init(new SettingField(), "se_guolushuiweijigaobaojingsheding", 272, 4, "锅炉水位极高报警设定", "mm"));
        map.put("se_guolushuiweijidibaojingsheding", ByteField.Init(new SettingField(), "se_guolushuiweijidibaojingsheding", 276, 4, "锅炉水位极低报警设定", "mm"));
        map.put("se_jishuibengshoudongpinlüsheding", ByteField.Init(new SettingField(), "se_jishuibengshoudongpinlüsheding", 280, 4, "给水泵手动频率设定", "Hz"));
        map.put("se_chuyangqibushuimubiaosheding", ByteField.Init(new SettingField(), "se_chuyangqibushuimubiaosheding", 284, 4, "除氧器补水目标设定", "mm"));
        map.put("se_chuyangqijigaobaojingsheding", ByteField.Init(new SettingField(), "se_chuyangqijigaobaojingsheding", 288, 4, "除氧器极高报警设定", "mm"));
        map.put("se_chuyangqitingbengyeweisheding", ByteField.Init(new SettingField(), "se_chuyangqitingbengyeweisheding", 292, 4, "除氧器停泵液位设定", "mm"));
        map.put("se_chuyangqiqibengyeweisheding", ByteField.Init(new SettingField(), "se_chuyangqiqibengyeweisheding", 296, 4, "除氧器启泵液位设定", "mm"));
        map.put("se_chuyangqijidibaojingsheding", ByteField.Init(new SettingField(), "se_chuyangqijidibaojingsheding", 300, 4, "除氧器极低报警设定", "mm"));
        map.put("se_chuyangqibushuishoudonggeisu", ByteField.Init(new SettingField(), "se_chuyangqibushuishoudonggeisu", 304, 4, "除氧器补水手动给速", "Hz"));
        map.put("se_zhaoqiyalimubiaosheding", ByteField.Init(new SettingField(), "se_zhaoqiyalimubiaosheding", 308, 4, "沼气压力目标设定", "KPa"));


        map.put("de_1#bushuibengshoudongzidong", ByteField.Init(new DeviceField(), "de_1#bushuibengshoudongzidong", 368, 2, "1#补水泵",DevicePointMap_PLC_RanYouDaoReYou.coms_atuo));
        map.put("de_1#bushuibengqidongtingzhi", ByteField.Init(new DeviceField(), "de_1#bushuibengqidongtingzhi", 370, 2, "1#补水泵", DevicePointMap_PLC_RanYouDaoReYou.coms_start_stop));
        map.put("de_2#bushuibengshoudongzidong", ByteField.Init(new DeviceField(), "de_2#bushuibengshoudongzidong", 372, 2, "2#补水泵", DevicePointMap_PLC_RanYouDaoReYou.coms_atuo));
        map.put("de_2#bushuibengqidongtingzhi", ByteField.Init(new DeviceField(), "de_2#bushuibengqidongtingzhi", 374, 2, "2#补水泵", DevicePointMap_PLC_RanYouDaoReYou.coms_start_stop));
        map.put("de_1#jienengbengshoudongzidong", ByteField.Init(new DeviceField(), "de_1#jienengbengshoudongzidong", 376, 2, "1#节能泵", DevicePointMap_PLC_RanYouDaoReYou.coms_atuo));
        map.put("de_1#jienengbengqidongtingzhi", ByteField.Init(new DeviceField(), "de_1#jienengbengqidongtingzhi", 378, 2, "1#节能泵启", DevicePointMap_PLC_RanYouDaoReYou.coms_start_stop));
        map.put("de_2#jienengbengshoudongzidong", ByteField.Init(new DeviceField(), "de_2#jienengbengshoudongzidong", 380, 2, "2#节能泵", DevicePointMap_PLC_RanYouDaoReYou.coms_atuo));
        map.put("de_2#jienengbengqidongtingzhi", ByteField.Init(new DeviceField(), "de_2#jienengbengqidongtingzhi", 382, 2, "2#节能泵", DevicePointMap_PLC_RanYouDaoReYou.coms_start_stop));
        map.put("de_1#chuyangbengshoudongzidong", ByteField.Init(new DeviceField(), "de_1#chuyangbengshoudongzidong", 384, 2, "1#除氧泵", DevicePointMap_PLC_RanYouDaoReYou.coms_atuo));
        map.put("de_1#chuyangbengqidongtingzhi", ByteField.Init(new DeviceField(), "de_1#chuyangbengqidongtingzhi", 386, 2, "1#除氧泵", DevicePointMap_PLC_RanYouDaoReYou.coms_start_stop));
        map.put("de_2#chuyangbengshoudongzidong", ByteField.Init(new DeviceField(), "de_2#chuyangbengshoudongzidong", 388, 2, "2#除氧泵", DevicePointMap_PLC_RanYouDaoReYou.coms_atuo));
        map.put("de_2#chuyangbengqidongtingzhi", ByteField.Init(new DeviceField(), "de_2#chuyangbengqidongtingzhi", 390, 2, "2#除氧泵", DevicePointMap_PLC_RanYouDaoReYou.coms_start_stop));
        map.put("de_baojingshuchuzhishi", ByteField.Init(new DeviceField(), "de_baojingshuchuzhishi", 392, 2, "报警输出指示", new HashMap<Integer, String>() {
            {
                put(0, "关");
                put(1, "开");
            }
        }));
        map.put("de_1#zhaoqifengjishoudongzidong", ByteField.Init(new DeviceField(), "de_1#zhaoqifengjishoudongzidong", 394, 2, "1#沼气风机", DevicePointMap_PLC_RanYouDaoReYou.coms_atuo));
        map.put("de_1#zhaoqifengjiqidongtingzhi", ByteField.Init(new DeviceField(), "de_1#zhaoqifengjiqidongtingzhi", 396, 2, "1#沼气风机", DevicePointMap_PLC_RanYouDaoReYou.coms_start_stop));
        map.put("de_2#zhaoqifengjishoudongzidong", ByteField.Init(new DeviceField(), "de_2#zhaoqifengjishoudongzidong", 398, 2, "2#沼气风机", DevicePointMap_PLC_RanYouDaoReYou.coms_atuo));
        map.put("de_2#zhaoqifengjiqidongtingzhi", ByteField.Init(new DeviceField(), "de_2#zhaoqifengjiqidongtingzhi", 400, 2, "2#沼气风机启", DevicePointMap_PLC_RanYouDaoReYou.coms_start_stop));

        map.put("ex_chaoyabaojingyalikaiguan", ByteField.Init(new ExceptionField(), "ex_chaoyabaojingyalikaiguan", 448, 2, "超压报警（压力开关）", 0));
        map.put("ex_chaoyabaojingshedingzhi", ByteField.Init(new ExceptionField(), "ex_chaoyabaojingshedingzhi", 448, 2, "超压报警（设定值）", 1));
        map.put("ex_paiyanchaowenbaojing", ByteField.Init(new ExceptionField(), "ex_paiyanchaowenbaojing", 448, 2, "排烟超温报警", 2));
        map.put("ex_ruanshuixiangqueshuibaojing", ByteField.Init(new ExceptionField(), "ex_ruanshuixiangqueshuibaojing", 448, 2, "软水箱缺水报警", 3));
        map.put("ex_shuidianjiluojicuobaojing", ByteField.Init(new ExceptionField(), "ex_shuidianjiluojicuobaojing", 448, 2, "水电极逻辑错报警", 4));
        map.put("ex_yalibiansongqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_yalibiansongqiguzhangbaojing", 448, 2, "压力变送器故障报警", 5));
        map.put("ex_shuiweibiansongqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_shuiweibiansongqiguzhangbaojing", 448, 2, "水位变送器故障报警", 6));
        map.put("ex_paiyanwenduchuanganqiguzhangbaojing", ByteField.Init(new ExceptionField(), "ex_paiyanwenduchuanganqiguzhangbaojing", 448, 2, "排烟温度传感器故障报警", 7));

        map.put("ex_ranshaoqiguzhang", ByteField.Init(new ExceptionField(), "ex_ranshaoqiguzhang", 448, 2, "燃烧器故障", 8));
        map.put("ex_ranqixielou", ByteField.Init(new ExceptionField(), "ex_ranqixielou", 448, 2, "燃气泄漏", 9));
        map.put("ex_ranqiyaliyichang", ByteField.Init(new ExceptionField(), "ex_ranqiyaliyichang", 448, 2, "燃气压力异常", 10));
        map.put("ex_shuiweiweidibaojingdianji", ByteField.Init(new ExceptionField(), "ex_shuiweiweidibaojingdianji", 448, 2, "水位危低报警（电极）", 11));
        map.put("ex_shuiweijidibaojingdianji", ByteField.Init(new ExceptionField(), "ex_shuiweijidibaojingdianji", 448, 2, "水位极低报警（电极）", 12));
        map.put("ex_shuiweijigaobaojingdianji", ByteField.Init(new ExceptionField(), "ex_shuiweijigaobaojingdianji", 448, 2, "水位极高报警（电极）", 13));
        map.put("ex_shuiweijidibaojingshedingzhi", ByteField.Init(new ExceptionField(), "ex_shuiweijidibaojingshedingzhi", 448, 2, "水位极低报警（设定值）", 14));
        map.put("ex_shuiweijigaobaojingshedingzhi", ByteField.Init(new ExceptionField(), "ex_shuiweijigaobaojingshedingzhi", 448, 2, "水位极高报警（设定值）", 15));

        map.put("ex_jishuibeng1guzhang", ByteField.Init(new ExceptionField(), "ex_jishuibeng1guzhang", 450, 2, "给水泵1故障", 0));
        map.put("ex_jishuibeng2guzhang", ByteField.Init(new ExceptionField(), "ex_jishuibeng2guzhang", 450, 2, "给水泵2故障", 1));
        map.put("ex_zhaoqifengjibianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_zhaoqifengjibianpinqiguzhang", 450, 2, "沼气风机变频器故障", 2));

        map.put("ex_chuyangqiqueshuibaojing", ByteField.Init(new ExceptionField(), "ex_chuyangqiqueshuibaojing", 450, 2, "除氧器缺水报警", 8));
        map.put("ex_chuyangqigaoshuiweibaojing", ByteField.Init(new ExceptionField(), "ex_chuyangqigaoshuiweibaojing", 450, 2, "除氧器高水位报警", 9));
        map.put("ex_jishuibengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_jishuibengbianpinqiguzhang", 450, 2, "给水泵变频器故障", 10));
        map.put("ex_chuyangbengbianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_chuyangbengbianpinqiguzhang", 450, 2, "除氧泵变频器故障", 11));
        map.put("ex_zhufengjibianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_zhufengjibianpinqiguzhang", 450, 2, "主风机变频器故障", 12));
        map.put("ex_xunhuanfengjibianpinqiguzhang", ByteField.Init(new ExceptionField(), "ex_xunhuanfengjibianpinqiguzhang", 450, 2, "循环风机变频器故障", 13));
        map.put("ex_jienengbeng1guzhang", ByteField.Init(new ExceptionField(), "ex_jienengbeng1guzhang", 450, 2, "节能泵1故障", 14));
        map.put("ex_jienengbeng2guzhang", ByteField.Init(new ExceptionField(), "ex_jienengbeng2guzhang", 450, 2, "节能泵2故障", 15));

    }
}
