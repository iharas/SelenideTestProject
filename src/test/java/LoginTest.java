import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest {

    @Test
    public void login() {
        new LoginPage().login();
    }

    @Test
    public void logout() {
        new LoginPage().logot();
    }
}
