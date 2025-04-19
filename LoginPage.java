package week4.day1;

public class LoginPage extends  BasePage{
	
	public void performCommonTasks() {
		// TODO Auto-generated method stub
	
		super.performCommonTasks();
		System.out.println("Perform a task in the login page");

	}
	
	
	public static void main(String[] args) {
		
		LoginPage test = new LoginPage();
		test.performCommonTasks();
		test.findElement();
		test.clickElement();
		test.enterText();
	}

}
