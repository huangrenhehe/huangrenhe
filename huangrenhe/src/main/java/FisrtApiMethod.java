
import com.Ziroom.qa.utils.HttpRequest;
import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by huangrenhe on 2019/8/22.
 */
public class FisrtApiMethod {
     HttpRequest httpRequest = new HttpRequest();

     public Map<String,String> getApiValue(){
         //请求地址
         String url = "https://tmovessmsapis.ziroom.com/zrk/move/common/order/create";
         //设置请求头
         Map<String,String> headerMap = new HashMap<>();
         headerMap.put("Content-Type","application/json");
         headerMap.put("X-Forwarded-Ziroom","1231312312");
         //集合存参数
         Map<String,String> paramsMap = new HashMap<>();
         //参数未传完
         paramsMap.put("productCode","8a908eb161d66afc0161fa59fd210009");
         paramsMap.put("dataSourceCode","10");
         paramsMap.put("orderStartDoorplate","酒仙桥东路18号楼一单元8930");
         paramsMap.put("connectPhone","16282868572");
         paramsMap.put("clientSource","10");
         paramsMap.put("endAddressLon","116.5064177852306");
         paramsMap.put("endArea","朝阳区");
         paramsMap.put("orderStartAddress","北京市朝阳区酒仙桥东路18号楼");
         paramsMap.put("appointmentTime","1566527400000");
         paramsMap.put("totalDistance","0");
         paramsMap.put("connectName","黄人赫测试");
         paramsMap.put("moveOutFloors","0");
         paramsMap.put("orderEndDoorplate","now");
         paramsMap.put("startAddressLat","39.97975540161133");
         paramsMap.put("uid","d319f252 - 21ab - 4162 - 9472 - e8a047790e07");
         paramsMap.put("clientVersion","10");
         paramsMap.put("endAddressLat","39.98110929654851");
         paramsMap.put("startAddressLon","116.504753112793");
         paramsMap.put("moveInFloors","0");
         paramsMap.put("startArea","朝阳区");
         paramsMap.put("cityCode","110000");
         paramsMap.put("moveInElevator","1");
         paramsMap.put("userCode","d319f252-21ab-4162-9472-e8a047790e07");
         paramsMap.put("planStartTime","1566527400000");
         paramsMap.put("moveOutElevator","1");
         paramsMap.put("planEndTime","1566532800000");
         paramsMap.put("appointType","1");
         paramsMap.put("orderEndAddress","酒仙桥东路18号楼");
         //map转JsonObject
         JSONObject jsonparmsMap = JSONObject.fromObject(paramsMap);
         //提交请求接收
         Map<String,String> returnMap = httpRequest.postWithHeadersReturnMap(url,jsonparmsMap,headerMap);
         return returnMap;
     }
}