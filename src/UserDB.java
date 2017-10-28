import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDB {
	public static Connection conn = MyConnection.getConnection();
	static int countShape = 0;
	//static MyShape[] shapeList;

	public static boolean checkManager(User user) {
		boolean flag = false;

		PreparedStatement pstmtUser = null;
		String queryUser = "SELECT userId FROM paint.user where username=? and password=?;";
		ResultSet rsUser = null;
		try {
			pstmtUser = conn.prepareStatement(queryUser);
			pstmtUser.setString(1, user.getUsername());
			pstmtUser.setString(2, user.getPassword());
			rsUser = pstmtUser.executeQuery();
			if (rsUser.next()) {
				flag = true;
				IOManger.setCurrentuserId(rsUser.getInt(1));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	/*
	 * public static int countShapeOfUser() { String queryCountShape =
	 * "SELECT count(shapeId) FROM paint.shape where userId=?;"; try {
	 * PreparedStatement pstmtCountShape = conn .prepareStatement(
	 * queryCountShape); pstmtCountShape.setInt(1, IOManger.currentuserId);
	 * ResultSet rsCountShape = pstmtCountShape.executeQuery(); if
	 * (rsCountShape.next()) { countShape = rsCountShape.getInt(1);
	 * IOManger.setCountShapeOfCurrentUser(countShape);
	 * 
	 * } System.out.println(countShape); } catch (SQLException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } return countShape; }
	 */
	/*
	 */
	public static ArrayList<MyShape> listShape() {
		int ShapeTypeId = 0;
		ArrayList<MyShape> shapeList = new ArrayList<MyShape>();
		String queryListShape = "SELECT shapeTypeId,x1,y1,x2,y2,color FROM paint.shape where userId=?;";
		try {
			PreparedStatement pstmtListShape = conn.prepareStatement(queryListShape);
			pstmtListShape.setInt(1, IOManger.currentuserId);
			ResultSet rsListShape = pstmtListShape.executeQuery();
			while (rsListShape.next()) {
				ShapeTypeId = rsListShape.getInt(1);
				if (ShapeTypeId == 1) {
					Line temp = new Line(rsListShape.getInt(2), rsListShape.getInt(3), rsListShape.getInt(4),
							rsListShape.getInt(5), rsListShape.getString(6));
					shapeList.add(temp);
				} else if (ShapeTypeId == 2) {
					Circle temp = new Circle(rsListShape.getInt(2), rsListShape.getInt(3), rsListShape.getInt(4),
							rsListShape.getInt(5), rsListShape.getString(6));
					shapeList.add(temp);
				} else if (ShapeTypeId == 3) {
					Rectangle temp = new Rectangle(rsListShape.getInt(2), rsListShape.getInt(3), rsListShape.getInt(4),
							rsListShape.getInt(5), rsListShape.getString(6));
					System.out.println(rsListShape.getString(6));
					shapeList.add(temp);
				}

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return shapeList;
	}
}
