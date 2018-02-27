package test;
import com.baidu.translate.demo.TransApi;

public class Main {

    // 在平台申请的APP_ID 详见 http://api.fanyi.baidu.com/api/trans/product/desktop?req=developer
    private static final String APP_ID = "20180226000127571";
    private static final String SECURITY_KEY = "cyL3JEoymqDWvs7rVpSV";

    public static void main(String[] args)   {
        TransApi api = new TransApi(APP_ID, SECURITY_KEY);
        String query = "我想知道 这个是什么东西，广州体育中心";
        System.out.println(api.getTransResult(query, "auto", "en"));
    }

}
