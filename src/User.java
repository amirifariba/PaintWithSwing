import java.util.ArrayList;
import java.util.Arrays;

public class User {
	String username;
	String password;
	static int shapeListSize = 0;
	static ArrayList<MyShape> shapesList;

	public static ArrayList<MyShape> getShapesArrayList() {
		return shapesList;
	}

	public static void setShapesArrayList() {
		shapesList = new ArrayList<MyShape>();
		for (int i = 0; i < UserDB.listShape().size(); i++) {
			System.out.println("db color is:"+UserDB.listShape().get(i).CovertColorToString());
			shapesList.add(UserDB.listShape().get(i));

		}
		shapeListSize = shapesList.size();
	}

	User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean checkUser() {
		boolean flag = false;
		if (UserDB.checkManager(this)) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	static void addShapesToDB() {
		for (int i = shapeListSize; i < shapesList.size(); i++) {
			shapesList.get(i).SaveToDB();
		}
	}

}
