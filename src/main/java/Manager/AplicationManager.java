package Manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AplicationManager {

    WebDriver wd;
    HelperUser userHelper;

    public HelperUser getUserHelper() {
        return userHelper;
    }

    public void init()
    {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.navigate().to("https://ticket-service-69443.firebaseapp.com/");
        wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        userHelper  = new HelperUser(wd);

    }
    public void stop()
    {
        wd.quit();
    }

}
