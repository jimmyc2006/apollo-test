import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;

public class Test {
    public static void main(String[] args) {
        System.setProperty("app.id", "dataintegration-8092");
        System.setProperty("apollo.meta", "http://10.241.241.24:8080");
        System.setProperty("apollo.env", "PRO");
        Config config = ConfigService.getAppConfig();
        for (String str : config.getPropertyNames()) {
            System.out.println(str + ":" + config.getProperty(str, null));
        }
    }
}
