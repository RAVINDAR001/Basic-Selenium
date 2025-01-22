package advancesellenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnDependsOnMethods {
	
	@Test
	public void CreatedAccount() {
		Reporter.log("Account created succsesfully", true);
		
	}
	@Test(dependsOnMethods = "CreatedAccount")
	public void editdAccount() {
		Reporter.log("Account edited succsesfully", true);
		
	}
	@Test(dependsOnMethods = {"editdAccount","CreatedAccount"})
	public void deletedAccount() {
		Reporter.log("Account deleted succsesfully", true);
		
	}
}
