package cn.com.sdcsoft.devices.map.zh_cn;


import cn.com.sdcsoft.devices.SdcSoftDevice;
import cn.com.sdcsoft.devices.meta.ByteField;
import cn.com.sdcsoft.devices.meta.CTL_NJZJ_485.*;


/**
 * Created by jialiang on 2018/4/20.
 */

public class DevicePointMap_CTL_NJZJ_IPK2_485_V1 extends DevicePointMap_CTL_NJZJ_IPK2_485 {

    public DevicePointMap_CTL_NJZJ_IPK2_485_V1() {
        super();
        map.put("ba_fangdongkaiguan", ByteField.Init(new BaseInfoField(), "ba_fangdongkaiguan", 0, 0, "防冻开关", DevicePointMap.coms_open_close));
        map.put("ba_leijijiaretianshu", ByteField.Init(new BaseInfoField(), "ba_leijijiaretianshu", 0, 0, "累计加热", "天"));
        map.put("ba_leijijiarexiaoshi", ByteField.Init(new BaseInfoField(), "ba_leijijiarexiaoshi", 0, 0, "累计加热", "时"));
        map.put("ba_dahuoshijian", ByteField.Init(new BaseInfoField(), "ba_dahuoshijian", 0, 0, "大火工作时间", "时"));
        map.put("ba_xiaohuoshijian", ByteField.Init(new BaseInfoField(), "ba_xiaohuoshijian", 0, 0, "小火工作时间", "时"));

    }
}
