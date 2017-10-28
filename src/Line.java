import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Line extends MyShape {
	public Line(int x1, int y1, int x2, int y2, Color color) {

		super(x1, y1, x2, y2, color);

	}

	public Line(int x1, int y1, int x2, int y2, String color) {

		super(x1, y1, x2, y2, color);

	}

	public void Draw(Graphics g) {

		System.out.println(this.CovertColorToString());
		g.setColor(this.getColor());
		g.drawLine(this.getxStart(), this.getyStart(), this.getxEnd(), this.getyEnd());
	}

	public void SaveToDB() {
		ShapeDB.saveShapeToDb(this, 1);
	}

}
