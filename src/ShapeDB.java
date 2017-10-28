import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShapeDB {
	public static Connection conn = MyConnection.getConnection();

	static void saveShapeToDb(MyShape shape, int typeid) {
		String addLineQuery = "INSERT INTO `paint`.`shape` (`shapeTypeId`, `x1`, `y1`, `x2`, `y2`, `color`, `userId`) VALUES (?,?,?,?,?,?,?)";
		PreparedStatement pstmtaddLine = null;
		ResultSet rs = null;
		try {
			pstmtaddLine = conn.prepareStatement(addLineQuery, Statement.RETURN_GENERATED_KEYS);
			pstmtaddLine.setInt(1, typeid);
			pstmtaddLine.setInt(2, shape.xStart);
			pstmtaddLine.setInt(3, shape.yStart);
			pstmtaddLine.setInt(4, shape.xEnd);
			pstmtaddLine.setInt(5, shape.yEnd);
			pstmtaddLine.setString(6, shape.CovertColorToString());
			pstmtaddLine.setInt(7, IOManger.currentuserId);
			pstmtaddLine.executeUpdate();
			rs = pstmtaddLine.getGeneratedKeys();
			if (rs.next()) {
				System.out.println("true");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
