package cn.com.sdcsoft.devices.map;

import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.PLC.*;

import java.util.HashMap;

/**
 * @author doudou
 * 初始化数据
 */
public class DevicePointMap_PLC_DianReShui extends DevicePointMap {
    public static final String Key = "PLC_DianReShui";
    public static final String Power = "ba_ranliao";
    public static final String Media = "ba_jiezhimeijie";

    public DevicePointMap_PLC_DianReShui() {

        map.put("ba_yunxingxiaoshishu", ByteField.Init(new BaseInfoField(), "ba_yunxingxiaoshishu", 9, 2, "运行小时数","时"));
        map.put("ba_yunxingtianshu", ByteField.Init(new BaseInfoField(), "ba_yunxingtianshu", 11, 2, "运行天数","天"));
        map.put("ba_xitongzhuangtai", ByteField.Init(new BaseInfoField(), "ba_xitongzhuangtai", 13, 2, "系统状态", DevicePointMap_PLC_RanYouDaoReYou.coms_status));
        map.put("ba_ranliao", ByteField.Init(new BaseInfoField(), "ba_ranliao", 15, 2, "燃料", DevicePointMap_PLC_RanYouDaoReYou.coms_power));
        map.put("ba_jiezhimeijie", ByteField.Init(new BaseInfoField(), "ba_jiezhimeijie", 17, 2, "介质", DevicePointMap_PLC_RanYouDaoReYou.coms_media));
        map.put("ba_shuiweizhuangtai", ByteField.Init(new BaseInfoField(), "ba_shuiweizhuangtai", 19, 2, "水位状态", DevicePointMap_PLC_RanYouDaoReYou.coms_level));
        map.put("ba_ranshaoqizhuangtai", ByteField.Init(new BaseInfoField(), "ba_ranshaoqizhuangtai", 21, 2, "燃烧器状态", DevicePointMap_PLC_RanYouDaoReYou.coms_ranshaoqi_status));

        map.put("mo_chushuiwendu", ByteField.Init(new MockField(), "mo_chushuiwendu", 35, 4, "出水温度", "MPa"));
        map.put("mo_huishuiwendu", ByteField.Init(new MockField(), "mo_huishuiwendu", 39, 4, "回水温度", "℃"));
        map.put("mo_chushuiyali", ByteField.Init(new MockField(), "mo_chushuiyali", 43, 4, "出水压力", "mm"));
        map.put("mo_huishuiyali", ByteField.Init(new MockField(), "mo_huishuiyali", 47, 4, "回水压力", "T/H"));
        map.put("mo_qidongjiarezushu", ByteField.Init(new MockField(), "mo_qidongjiarezushu", 79, 4, "启动加热组数", "组"));
        map.put("mo_qidongjiarezushubaifenbi", ByteField.Init(new MockField(), "mo_qidongjiarezushubaifenbi", 83, 4, "启动加热组数百分比", "%"));

        map.put("se_chaowenbaojingsheding", ByteField.Init(new SettingField(), "se_chaowenbaojingsheding", 127, 4, "超温报警设定", "℃"));
        map.put("se_shiyongjiarezushusheding", ByteField.Init(new SettingField(), "se_shiyongjiarezushusheding", 131, 4, "使用加热组数设定", "组"));
        map.put("se_touqiejiangeshijiansheding", ByteField.Init(new SettingField(), "se_touqiejiangeshijiansheding", 135, 4, "投切间隔时间设定", "S"));
        map.put("se_kuaiqiejiangeshijiansheding", ByteField.Init(new SettingField(), "se_kuaiqiejiangeshijiansheding", 139, 4, "快切间隔时间设定", "S"));
        map.put("se_tingluwendusheding", ByteField.Init(new SettingField(), "se_tingluwendusheding", 143, 4, "停炉温度设定", "℃"));
        map.put("se_shiyongwendusheding", ByteField.Init(new SettingField(), "se_shiyongwendusheding", 147, 4, "使用温度设定", "℃"));
        map.put("se_qiluwendusheding", ByteField.Init(new SettingField(), "se_qiluwendusheding", 151, 4, "启炉温度设定", "℃"));
        map.put("se_yalidibaojingsheding", ByteField.Init(new SettingField(), "se_yalidibaojingsheding", 155, 4, "压力低报警设定", "Mpa"));
        map.put("se_yaligaobaojingsheding", ByteField.Init(new SettingField(), "se_yaligaobaojingsheding", 159, 4, "压力高报警设定", "Mpa"));
        map.put("se_qibengyalisheding", ByteField.Init(new SettingField(), "se_qibengyalisheding", 163, 4, "启泵压力设定", "Mpa"));
        map.put("se_tingbengyalisheding", ByteField.Init(new SettingField(), "se_tingbengyalisheding", 167, 4, "停泵压力设定", "Mpa"));

        map.put("de_1bushuibeng", ByteField.Init(new DeviceField(), "de_1bushuibeng", 199, 2, "1#补水泵",DevicePointMap_PLC_RanYouDaoReYou.coms_atuo));
        map.put("de_1bushuibeng", ByteField.Init(new DeviceField(), "de_1bushuibeng", 201, 2, "1#补水泵", DevicePointMap_PLC_RanYouDaoReYou.coms_start_stop));
        map.put("de_2bushuibeng", ByteField.Init(new DeviceField(), "de_2bushuibeng", 203, 2, "2#补水泵",DevicePointMap_PLC_RanYouDaoReYou.coms_atuo));
        map.put("de_2bushuibeng", ByteField.Init(new DeviceField(), "de_2bushuibeng", 205, 2, "2#补水泵", DevicePointMap_PLC_RanYouDaoReYou.coms_start_stop));
        map.put("de_baojingshuchuzhishi", ByteField.Init(new DeviceField(), "de_baojingshuchuzhishi", 207, 2, "报警输出指示", new HashMap<Integer, String>() {
            {
                put(0, "关");
                put(1, "开");
            }
        }));
        map.put("de_1xunhuanbeng", ByteField.Init(new DeviceField(), "de_1xunhuanbeng", 209, 2, "1#循环泵",DevicePointMap_PLC_RanYouDaoReYou.coms_atuo));
        map.put("de_1xunhuanbeng", ByteField.Init(new DeviceField(), "de_1xunhuanbeng", 211, 2, "1#循环泵", DevicePointMap_PLC_RanYouDaoReYou.coms_start_stop));
        map.put("de_2xunhuanbeng", ByteField.Init(new DeviceField(), "de_2xunhuanbeng", 213, 2, "2#循环泵",DevicePointMap_PLC_RanYouDaoReYou.coms_atuo));
        map.put("de_2xunhuanbeng", ByteField.Init(new DeviceField(), "de_2xunhuanbeng", 215, 2, "2#循环泵", DevicePointMap_PLC_RanYouDaoReYou.coms_start_stop));

        map.put("ex_shuiweijidibaojing（dianji）", ByteField.Init(new ExceptionField(), "ex_shuiweijidibaojing（dianji）", 233, 2, "水位极低报警（电极）", 8));
        map.put("ex_xitongchaoyabaojing（shedingzhi）", ByteField.Init(new ExceptionField(), "ex_xitongchaoyabaojing（shedingzhi）", 233, 2, "系统超压报警（设定值）", 9));
        map.put("ex_xitongyalidibaojing（shedingzhi）", ByteField.Init(new ExceptionField(), "ex_xitongyalidibaojing（shedingzhi）", 233, 2, "系统压力低报警（设定值）", 10));
        map.put("ex_xitongchaoyabaojing（dianjiedianyalibiao）", ByteField.Init(new ExceptionField(), "ex_xitongchaoyabaojing（dianjiedianyalibiao）", 233, 2, "系统超压报警（电接点压力表）", 11));
        map.put("ex_xitongyalidibaojing（dianjiedianyalibiao）", ByteField.Init(new ExceptionField(), "ex_xitongyalidibaojing（dianjiedianyalibiao）", 233, 2, "系统压力低报警（电接点压力表）", 12));
        map.put("ex_chushuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_chushuiwenduchuanganqiguzhang", 233, 2, "出水温度传感器故障", 13));
        map.put("ex_huishuiwenduchuanganqiguzhang）", ByteField.Init(new ExceptionField(), "ex_huishuiwenduchuanganqiguzhang）", 233, 2, "回水温度传感器故障）", 14));
        map.put("ex_chushuiyalibiansongqiguzhang", ByteField.Init(new ExceptionField(), "ex_chushuiyalibiansongqiguzhang", 233, 2, "出水压力变送器故障", 15));
        map.put("ex_huishuiyalibiansongqiguzhang", ByteField.Init(new ExceptionField(), "ex_huishuiyalibiansongqiguzhang", 233, 2, "回水压力变送器故障", 0));
        map.put("ex_lubichaowenbaojing", ByteField.Init(new ExceptionField(), "ex_lubichaowenbaojing", 233, 2, "炉壁超温报警", 1));
        map.put("ex_waibuliansuoduankaibaojing", ByteField.Init(new ExceptionField(), "ex_waibuliansuoduankaibaojing", 233, 2, "外部连锁断开报警", 2));
        map.put("ex_xunhuanbengliansuoduankaibaojing", ByteField.Init(new ExceptionField(), "ex_xunhuanbengliansuoduankaibaojing", 233, 2, "循环泵连锁断开报警", 3));
        map.put("ex_loudianbaojing", ByteField.Init(new ExceptionField(), "ex_loudianbaojing", 233, 2, "漏电报警", 4));
        map.put("ex_qianyabaojing", ByteField.Init(new ExceptionField(), "ex_qianyabaojing", 233, 2, "欠压报警", 5));
        map.put("ex_chushuichaowenbaojing", ByteField.Init(new ExceptionField(), "ex_chushuichaowenbaojing", 233, 2, "出水超温报警", 6));
        map.put("ex_wendushedingcuowubaojing", ByteField.Init(new ExceptionField(), "ex_wendushedingcuowubaojing", 233, 2, "温度设定错误报警", 7));

        map.put("ex_Axiangguoliubaojing", ByteField.Init(new ExceptionField(), "ex_Axiangguoliubaojing", 235, 2, "A相过流报警", 8));
        map.put("ex_Bxiangguoliubaojing", ByteField.Init(new ExceptionField(), "ex_Bxiangguoliubaojing", 235, 2, "B相过流报警", 9));
        map.put("ex_Cxiangguoliubaojing", ByteField.Init(new ExceptionField(), "ex_Cxiangguoliubaojing", 235, 2, "C相过流报警"   , 10));


    }
}
