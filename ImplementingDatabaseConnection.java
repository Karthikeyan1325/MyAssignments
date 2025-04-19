package week4.day1;

public class ImplementingDatabaseConnection implements DatabaseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImplementingDatabaseConnection implement = new ImplementingDatabaseConnection();
		implement.connect();
		implement.disconnect();
		implement.executeUpdate();
		
}

	
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Database is connected");
	}

	
	public void disconnect() {
		// TODO Auto-generated method stub
		
		System.out.println("Database is disconnected");
		
	}


	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Execution update is completed successfully in the database");
		
	}

}
