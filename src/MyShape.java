import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public abstract class MyShape {
	protected int xStart;
	protected int yStart;
	protected int xEnd;
	protected int yEnd;
	Color color;

	public int getxStart() {
		return xStart;
	}

	public void setxStart(int xStart) {
		this.xStart = xStart;
	}

	public int getyStart() {
		return yStart;
	}

	public void setyStart(int yStart) {
		this.yStart = yStart;
	}

	public int getxEnd() {
		return xEnd;
	}

	public void setxEnd(int xEnd) {
		this.xEnd = xEnd;
	}

	public int getyEnd() {
		return yEnd;
	}

	public void setyEnd(int yEnd) {
		this.yEnd = yEnd;
	}

	public MyShape(int x1, int y1, int x2, int y2, Color color) {
		this.xStart = x1;
		this.yStart = y1;
		this.xEnd = x2;
		this.yEnd = y2;
		this.setColor(color);
	}

	public MyShape(int x1, int y1, int x2, int y2, String color) {
		this.xStart = x1;
		this.yStart = y1;
		this.xEnd = x2;
		this.yEnd = y2;
		this.setColor(color);
		System.out.println();
	}

	public void CopyMyShape(MyShape MyShape) {
		this.xEnd = MyShape.xEnd;
		this.xStart = MyShape.xStart;
		this.yEnd = MyShape.yEnd;
		this.yStart = MyShape.yStart;
		this.color = MyShape.color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setColor(String color) {
		if (color.compareTo("black")==0) {
			this.color = Color.BLACK;
		}
		if (color.compareTo("red")==0) {
			this.color = Color.RED;
		}
		if (color.compareTo("green")==0) {
			this.color = Color.GREEN;
		}
		if (color.compareTo("blue")==0) {
			this.color = Color.BLUE;
		}
	
	}

	public String CovertColorToString() {
		String color = "";
		if(this.color.getRGB()==Color.BLACK.getRGB())
	  {
			color = "black";
		}
		if (this.color.equals(Color.RED)) {
			color = "red";
		}
		if (this.color.equals(Color.GREEN)) {
			color = "green";
		}
		if (this.color.equals(Color.BLUE)) {
			color = "blue";
		}
		return color;
	}

	public abstract void Draw(Graphics g);

	public abstract void SaveToDB();

}
