package jun;

import org.junit.Assert;
import org.junit.Test;

public class LoginTest {
    @Test
    public void login(){
        Assert.assertEquals("ok",Login.login());
    }
}
