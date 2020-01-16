package WikipediaSearch.Wiki;

//
import org.testng.annotations.Test;

public class OnlineRegistrationTest {

	@Test(priority=1, description="This is use to login", groups={"sanity","regression"})
	public void LogIn() {
		System.out.println("Log in here");
	}

	@Test(priority=2, description="This is used to enter password and username", groups={"sanity"})
	public void EnterCredentials() {
		System.out.print("Enter password and username");
	}
	
	@Test(priority=3, description="When customers want to checkout",groups={"regression"})
	public void Checkout() {
		System.out.println("Logout here");
	}
}
