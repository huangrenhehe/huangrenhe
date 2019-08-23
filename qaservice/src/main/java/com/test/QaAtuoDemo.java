package com.test;

import com.Ziroom.qa.utils.HttpRequest;
import net.sf.json.JSONObject;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;

import java.util.HashMap;
import java.util.Map;

/**
 * modify by huangrenhe on 2019/8/16
 **/

public class QaAtuoDemo {

    HttpRequest httpRequest = new HttpRequest();
    HttpPost postMethod = new HttpPost();
    public JSONObject getDistrictName(){

        postMethod.addHeader("Content-Type","application/json");
        postMethod.addHeader("X-Forwarded-Ziroom","1231312312");
        String url = "https://tmovessmsapis.ziroom.com/zrk/move/common/order/create";
        Map<String,String> map = new HashMap<>();
        map.put("resblockId","1111027373682");
        JSONObject response = httpRequest.postParasReturnJson(url,map);
//        String returnValue = response.getString("returnValue");
//        JSONObject returnValueJson = JSONObject.fromObject(returnValue);
//        String data = returnValueJson.getString("data");
//        JSONObject dataJson = JSONObject.fromObject(data);
//        String districtName = dataJson.getString("districtName");
        return response;
    }
}
