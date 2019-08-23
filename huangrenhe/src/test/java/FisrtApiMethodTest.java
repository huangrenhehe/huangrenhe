import net.sf.json.JSONObject;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Map;


@Test
public class FisrtApiMethodTest {
    FisrtApiMethod fisrtApiMethod = new FisrtApiMethod();
    public void getOrderCode(){
        Map<String,String> returnMap = fisrtApiMethod.getApiValue();
        System.out.println("=====================实在看不出来画个线======================");
        JSONObject returnValue = JSONObject.fromObject(returnMap.get("returnValue"));
        JSONObject data = JSONObject.fromObject(returnValue.get("data"));
        Iterator<String> it = data.keys();
        while(it.hasNext()){
        // 获得key
            String key = it.next();
            String value = data.getString(key);
            System.out.println("key: "+key+",value:"+value);
        }
        System.out.println("生成订单号为："+data.get("workOrderCode").toString());
        System.out.println("=====================实在看不出来画个线======================");
//        Map<String,String> dataMap = JSONObject.fromObject(data);
//        if(dataMap.isEmpty()){
//           for (Map.Entry<String, String> entry : dataMap.entrySet()) {
//               System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
//               System.out.print("执行啥");
//            }
//       }else {
//           System.out.println("空空空空空");
//        }
//
//        Iterator<Map.Entry<String, String>> it = returnMap.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry<String, String> entry = it.next();
//            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
//        }
//
    }
}