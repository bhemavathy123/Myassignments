package week3.day2;

public abstract class MySqlConnection implements DatabaseConnection{
	
	public void connect() {
		System.out.println("Database connection");
		
	}

	public void disconnect() {
		System.out.println("Database disconnection");
		
	}

	public void executeMethod() {
		System.out.println("Database execution");
		
	}
	public void executeQuery() {
		System.out.println("Query execution");
		
	}
	
	public static void main(String[] args) {
		
	}
}
