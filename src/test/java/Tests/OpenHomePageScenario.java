package Tests;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class OpenHomePageScenario extends PageBase {
    public void Run() {
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL,
                "https://www.google.com/" );
    }
}