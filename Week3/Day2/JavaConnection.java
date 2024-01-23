package week3.day2;

public class JavaConnection extends MySqlConnection

{
	
	public static void main(String[] args) {
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeMethod();
		jc.executeQuery();
	}

}
