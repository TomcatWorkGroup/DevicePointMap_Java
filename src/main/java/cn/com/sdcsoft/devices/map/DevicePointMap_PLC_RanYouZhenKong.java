package cn.com.sdcsoft.devices.map;


import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.PLC.BaseInfoField;
import cn.com.sdcsoft.devices.meta.PLC.DeviceField;
import cn.com.sdcsoft.devices.meta.PLC.ExceptionField;
import cn.com.sdcsoft.devices.meta.PLC.MockField;
import cn.com.sdcsoft.devices.meta.PLC.SettingField;
/**
 * @author doudou
 * 初始化数据
 */
public class DevicePointMap_PLC_RanYouZhenKong extends DevicePointMap {

    public static final String Key = "PLC_RanYouZhenKong";
    public DevicePointMap_PLC_RanYouZhenKong() {
        map.put("ba_yunxingxiaoshishu", ByteField.Init(new BaseInfoField(), "ba_yunxingxiaoshishu", 9, 2, "运行小时数","时"));
        map.put("ba_yunxingtianshu", ByteField.Init(new BaseInfoField(), "ba_yunxingtianshu", 11, 2, "运行天数","天"));
        map.put("ba_xitongzhuangtai", ByteField.Init(new BaseInfoField(), "ba_xitongzhuangtai", 13, 2, "系统状态", DevicePointMap_PLC_RanYouDaoReYou.coms_status));
        map.put("ba_ranliao", ByteField.Init(new BaseInfoField(), "ba_ranliao", 15, 2, "燃料", DevicePointMap_PLC_RanYouDaoReYou.coms_power));
        map.put("ba_jiezhimeijie", ByteField.Init(new BaseInfoField(), "ba_jiezhimeijie", 17, 2, "介质", DevicePointMap_PLC_RanYouDaoReYou.coms_media));
        map.put("ba_shuiweizhuangtai", ByteField.Init(new BaseInfoField(), "ba_shuiweizhuangtai", 19, 2, "水位状态", DevicePointMap_PLC_RanYouDaoReYou.coms_level));
        map.put("ba_ranshaoqizhuangtai", ByteField.Init(new BaseInfoField(), "ba_ranshaoqizhuangtai", 21, 2, "燃烧器状态", DevicePointMap_PLC_RanYouDaoReYou.coms_ranshaoqi_status));

        map.put("mo_remeishuiwendu", ByteField.Init(new MockField(), "mo_remeishuiwendu", 35, 4, "热媒水温度", "℃"));
        map.put("mo_zhenkongyali", ByteField.Init(new MockField(),"mo_zhenkongyali", 39, 4, "真空压力", "Kpa"));
        map.put("mo_jinyanwendu", ByteField.Init(new MockField(),"mo_jinyanwendu", 43, 4, "进烟温度", "℃"));
        map.put("mo_paiyanwendu", ByteField.Init(new MockField(),"mo_paiyanwendu", 47, 4, "排烟温度", "℃"));
        map.put("mo_shiwaiwendu", ByteField.Init(new MockField(),"mo_shiwaiwendu", 51, 4, "室外温度", "℃"));
        map.put("mo_cainuanchushuiwendu", ByteField.Init(new MockField(),"mo_cainuanchushuiwendu", 55, 4, "采暖出水温度", "℃"));
        map.put("mo_cainuanhuishuiwendu", ByteField.Init(new MockField(),"mo_cainuanhuishuiwendu", 59, 4, "采暖回水温度", "℃"));
        map.put("mo_cainuanchushuiyali", ByteField.Init(new MockField(),"mo_cainuanchushuiyali", 63, 4, "采暖出水压力", "Mpa"));
        map.put("mo_cainuanhuishuiyali", ByteField.Init(new MockField(),"mo_cainuanhuishuiyali", 67, 4, "采暖回水压力", "Mpa"));
        map.put("mo_shenghuochushuiwendu", ByteField.Init(new MockField(),"mo_shenghuochushuiwendu", 71, 4, "生活出水温度", "℃"));
        map.put("mo_shenghuohuishuiwendu", ByteField.Init(new MockField(),"mo_shenghuohuishuiwendu", 75, 4, "生活回水温度", "℃"));
        map.put("mo_shenghuochushuiyali", ByteField.Init(new MockField(),"mo_shenghuochushuiyali", 79, 4, "生活出水压力", "Mpa"));
        map.put("mo_shenghuohuishuiyali", ByteField.Init(new MockField(),"mo_shenghuohuishuiyali", 83, 4, "生活回水压力", "Mpa"));

        map.put("se_qiluwendusheding", ByteField.Init(new SettingField(), "se_qiluwendusheding", 111, 4, "启炉温度设定", "℃"));
        map.put("se_mubiaowendusheding", ByteField.Init(new SettingField(), "se_mubiaowendusheding", 115, 4, "目标温度设定", "℃"));
        map.put("se_tingluwendusheding", ByteField.Init(new SettingField(), "se_tingluwendusheding", 119, 4, "停炉温度设定", "℃"));
        map.put("se_zhenkongyalidisheding", ByteField.Init(new SettingField(), "se_zhenkongyalidisheding", 123, 4, "真空压力低设定", "KPa"));
        map.put("se_zhenkongyaligaosheding", ByteField.Init(new SettingField(), "se_zhenkongyaligaosheding", 127, 4, "真空压力高设定", "KPa"));
        map.put("se_paiyanwenduchaogaobaojingsheding", ByteField.Init(new SettingField(), "se_paiyanwenduchaogaobaojingsheding", 131, 4, "排烟温度超高报警设定", "℃"));
        map.put("se_chukouwenduchaogaobaojingsheding", ByteField.Init(new SettingField(), "se_chukouwenduchaogaobaojingsheding", 135, 4, "出口温度超高报警设定", "℃"));
        map.put("se_zhenkongyalichaogaobaojingsheding", ByteField.Init(new SettingField(), "se_zhenkongyalichaogaobaojingsheding", 139, 4, "真空压力超高报警设定", "KPa"));

        map.put("de_ranshaojiqiting", ByteField.Init(new DeviceField(), "de_ranshaojiqiting", 163, 2, "燃烧器", DevicePointMap_PLC_RanYouDaoReYou.coms_atuo));
        map.put("de_1#xunhuanbengshoudongzidong", ByteField.Init(new DeviceField(), "de_1#xunhuanbengshoudongzidong", 165, 2, "1#循环泵",DevicePointMap_PLC_RanYouDaoReYou.coms_atuo));
        map.put("de_1#xunhuanbengqidongtingzhi", ByteField.Init(new DeviceField(), "de_1#xunhuanbengqidongtingzhi", 167, 2, "1#循环泵", DevicePointMap_PLC_RanYouDaoReYou.coms_start_stop));
        map.put("de_2#xunhuanbengshoudongzidong", ByteField.Init(new DeviceField(), "de_2#xunhuanbengshoudongzidong", 169, 2, "2#循环泵",DevicePointMap_PLC_RanYouDaoReYou.coms_atuo));
        map.put("de_2#xunhuanbengqidongtingzhi", ByteField.Init(new DeviceField(), "de_2#xunhuanbengqidongtingzhi", 171, 2, "2#循环泵", DevicePointMap_PLC_RanYouDaoReYou.coms_start_stop));
        map.put("de_1#bushuibengshoudongzidong", ByteField.Init(new DeviceField(), "de_1#bushuibengshoudongzidong", 173, 2, "1#补水泵",DevicePointMap_PLC_RanYouDaoReYou.coms_atuo));
        map.put("de_1#bushuibengqidongtingzhi", ByteField.Init(new DeviceField(), "de_1#bushuibengqidongtingzhi", 175, 2, "1#补水泵", DevicePointMap_PLC_RanYouDaoReYou.coms_start_stop));
        map.put("de_2#bushuibengshoudongzidong", ByteField.Init(new DeviceField(), "de_2#bushuibengshoudongzidong", 177, 2, "2#补水泵",DevicePointMap_PLC_RanYouDaoReYou.coms_atuo));
        map.put("de_2#bushuibengqidongtingzhi", ByteField.Init(new DeviceField(), "de_2#bushuibengqidongtingzhi", 179, 2, "2#补水泵", DevicePointMap_PLC_RanYouDaoReYou.coms_start_stop));
        map.put("de_zhenkongbengshoudongzidong", ByteField.Init(new DeviceField(), "de_zhenkongbengshoudongzidong", 181, 2, "真空泵",DevicePointMap_PLC_RanYouDaoReYou.coms_atuo));
        map.put("de_zhenkongbengqidongtingzhi", ByteField.Init(new DeviceField(), "de_zhenkongbengqidongtingzhi", 183, 2, "真空泵", DevicePointMap_PLC_RanYouDaoReYou.coms_start_stop));

        map.put("ex_lubichaowenbaojing", ByteField.Init(new ExceptionField(), "ex_lubichaowenbaojing", 203, 2, "炉壁超温报警", 0));
        map.put("ex_remeishuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_remeishuiwenduchuanganqiguzhang", 203, 2, "热媒水温度传感器故障", 1));
        map.put("ex_paiyanwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_paiyanwenduchuanganqiguzhang", 203, 2, "排烟温度传感器故障", 2));
        map.put("ex_cainuanchushuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_cainuanchushuiwenduchuanganqiguzhang", 203, 2, "采暖出水温度传感器故障", 3));
        map.put("ex_shenghuochushuiwenduchuanganqiguzhang", ByteField.Init(new ExceptionField(), "ex_shenghuochushuiwenduchuanganqiguzhang", 203, 2, "生活出水温度传感器故障", 4));
        map.put("ex_wendushedingcuowubaojing", ByteField.Init(new ExceptionField(), "ex_wendushedingcuowubaojing", 203, 2, "温度设定错误报警", 5));
        map.put("ex_xunhuanbengliansuoduankaibaojing", ByteField.Init(new ExceptionField(), "ex_xunhuanbengliansuoduankaibaojing", 203, 2, "循环泵连锁断开报警", 6));
        map.put("ex_waibuliansuoduankaibaojing", ByteField.Init(new ExceptionField(), "ex_waibuliansuoduankaibaojing", 203, 2, "外部连锁断开报警", 7));

        map.put("ex_ranshaojiguzhang", ByteField.Init(new ExceptionField(), "ex_ranshaojiguzhang", 203, 2, "燃烧器故障", 8));
        map.put("ex_ranqixielou", ByteField.Init(new ExceptionField(), "ex_ranqixielou", 203, 2, "燃气泄漏", 9));
        map.put("ex_ranqiyaliyichang", ByteField.Init(new ExceptionField(), "ex_ranqiyaliyichang", 203, 2, "燃气压力异常", 10));
        map.put("ex_luneiyaligaobaojingshedingzhi", ByteField.Init(new ExceptionField(), "ex_luneiyaligaobaojingshedingzhi", 203, 2, "炉内压力高报警（设定值）", 11));
        map.put("ex_luneiyaligaobaojingyalikaiguan", ByteField.Init(new ExceptionField(), "ex_luneiyaligaobaojingyalikaiguan", 203, 2, "炉内压力高报警（压力开关）", 12));
        map.put("ex_paiyanwenduchaogaobaojing", ByteField.Init(new ExceptionField(), "ex_paiyanwenduchaogaobaojing", 203, 2, "排烟温度超高报警", 13));
        map.put("ex_remeishuiwenduchaogaobaojing", ByteField.Init(new ExceptionField(), "ex_remeishuiwenduchaogaobaojing", 203, 2, "热媒水温度超高报警", 14));
        map.put("ex_queshuibaohubaojing", ByteField.Init(new ExceptionField(), "ex_queshuibaohubaojing", 203, 2, "缺水保护报警", 15));

    }
}
