import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends MyShape {
	public Rectangle(int x1, int y1, int x2, int y2, Color color) {
		super(x1, y1, x2, y2, color);
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int x1, int y1, int x2, int y2, String color) {
		super(x1, y1, x2, y2, color);
		// TODO Auto-generated constructor stub
	}

	public void Draw(Graphics g) {
		int x = Math.min(this.xStart, this.xEnd);
		int y = Math.min(this.yStart, this.yEnd);
		int width = Math.abs(this.xStart - this.xEnd);
		int height = Math.abs(this.yStart - this.yEnd);
		g.setColor(color);
		g.drawRect(x, y, width, height);
	}

	public void SaveToDB() {
		ShapeDB.saveShapeToDb(this, 3);
	}

}
