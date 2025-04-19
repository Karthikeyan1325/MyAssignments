package week4.day1;

public class JavaConnection extends MySqlConnection{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
		System.out.println("Connect to the database");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnect from the database");
		
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		
		System.out.println("Execute the updated query");
	}
	
	public static void main(String[] args) {
		
		
		JavaConnection test = new JavaConnection();
		
		test.connect();
		test.disconnect();
		test.executeUpdate();
		test.executeQuery();
	}

}
