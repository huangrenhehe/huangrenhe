package com.test;

import net.sf.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * modify by huangrenhe on 2019/8/16
 **/

public class QaAtuoDemoTest {
    /*
     * 获取districtName值用例
     * @author zhangwei
     * **/

    QaAtuoDemo qaAtuoDemo = new QaAtuoDemo();

    @Test(description = "获取districtName值")
    public void testDemo(){
        JSONObject response = qaAtuoDemo.getDistrictName();
        String returnValue = response.getString("returnValue");
        JSONObject returnValueJson = JSONObject.fromObject(returnValue);
        String data = returnValueJson.getString("data");
        JSONObject dataJson = JSONObject.fromObject(data);
        String districtName = dataJson.getString("districtName");
        Assert.assertEquals(districtName,"海淀","获取districtName值");
        System.out.println("================================");
        System.out.println(districtName);
        System.out.println("================================");
    }
}
