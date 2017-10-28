
import java.sql.*;
public class MyConnection {
	public static Connection conn=null;
	static MyConnection instance;
	private  MyConnection()
 throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
	Class.forName("com.mysql.jdbc.Driver").newInstance();

	String url = "jdbc:mysql://127.0.0.1/paint?user=root&password=";
	
	 conn = DriverManager.getConnection(url);
	
	}
	public static Connection getConnection(){
	
		if(instance==null)
		{
			try {
				instance=new MyConnection();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conn;
	}
	public static void closeConnection(){
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
