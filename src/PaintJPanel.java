import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JPanel;

public class PaintJPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	
	private MyShape currentShape;
	private Color currentColor;
	private String currentType = "";
	Graphics g;

	public String getCurrentType() {
		return currentType;
	}

	public void setCurrentType(String currentType) {
		this.currentType = currentType;
	}

	public MyShape getCurrentShape() {
		return currentShape;
	}

	public void setCurrentShape(MyShape currentShape) {
		this.currentShape = currentShape;
	}

	public Color getCurrentColor() {
		return currentColor;
	}

	public void setCurrentColor(Color currentColor) {
		this.currentColor = currentColor;
	}

	public PaintJPanel() {
		User.setShapesArrayList();
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				PaintJPanelMousePressed(e);
			}

			public void mouseReleased(MouseEvent e) {
				currentShape.setyEnd(e.getY());
				currentShape.setyEnd(e.getY());
				User.shapesList.add(currentShape);
				////
				repaint();

			}

		});
		addMouseMotionListener(new MouseMotionAdapter() {

			public void mouseDragged(MouseEvent e) {
				PaintJPanelMouseDragged(e);
			}

		});

	}// end constructor//

	private void PaintJPanelMousePressed(MouseEvent e) {
		if (currentType.equals("line")) {
			currentShape = new Line(e.getX(), e.getY(), e.getX(), e.getY(), currentColor);
		} else if (currentType.equals("circle")) {
			currentShape = new Circle(e.getX(), e.getY(), e.getX(), e.getY(), currentColor);

		} else if (currentType.equals("rectangle")) {
			currentShape = new Rectangle(e.getX(), e.getY(), e.getX(), e.getY(), currentColor);
		}
		
	}

	private void PaintJPanelMouseDragged(MouseEvent e) {
		currentShape.setxEnd(e.getX());
		currentShape.setyEnd(e.getY());

		

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < User.getShapesArrayList().size(); i++) {

			User.getShapesArrayList().get(i).Draw(g);
			

		}
	

	}

}
