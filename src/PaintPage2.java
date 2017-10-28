import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class PaintPage2 extends JFrame {

	private JPanel contentPane;
	private PaintJPanel paintjpanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaintPage2 frame = new PaintPage2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PaintPage2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		paintjpanel = new PaintJPanel();
		paintjpanel.setBounds(0, 0, 466, 374);
		contentPane.add(paintjpanel);
		paintjpanel.setLayout(null);

		JPanel Optionpanel = new JPanel();
		Optionpanel.setBounds(469, 0, 114, 374);
		contentPane.add(Optionpanel);
		Optionpanel.setLayout(null);

		JButton btnLine = new JButton("Line");
		btnLine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paintjpanel.setCurrentType("line");
			}
		});

		btnLine.setBounds(10, 11, 89, 23);
		Optionpanel.add(btnLine);

		JButton btnCircle = new JButton("Circle");
		btnCircle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paintjpanel.setCurrentType("circle");
			}
		});
		btnCircle.setBounds(10, 45, 89, 23);
		Optionpanel.add(btnCircle);

		JButton rectangleButton = new JButton("Rectangle");
		rectangleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paintjpanel.setCurrentType("rectangle");
			}
		});
		rectangleButton.setBounds(10, 79, 89, 23);
		Optionpanel.add(rectangleButton);

		JLabel lblSelectColor = new JLabel("Select Color:");
		lblSelectColor.setBounds(10, 164, 89, 14);
		Optionpanel.add(lblSelectColor);

		JRadioButton BlackColorRadioButton = new JRadioButton("Black");
		BlackColorRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paintjpanel.setCurrentColor(Color.black);
			}
		});
		BlackColorRadioButton.setBounds(6, 185, 109, 23);
		Optionpanel.add(BlackColorRadioButton);

		JRadioButton RedColorRadioButton = new JRadioButton("Red");
		RedColorRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paintjpanel.setCurrentColor(Color.RED);
			}
		});
		RedColorRadioButton.setBounds(6, 211, 109, 23);
		Optionpanel.add(RedColorRadioButton);

		JRadioButton GreenColorRadioButton = new JRadioButton("Green");
		GreenColorRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paintjpanel.setCurrentColor(Color.GREEN);
			}
		});
		GreenColorRadioButton.setBounds(6, 237, 109, 23);
		Optionpanel.add(GreenColorRadioButton);

		JRadioButton BlueColorRadioButton = new JRadioButton("Blue");
		BlueColorRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paintjpanel.setCurrentColor(Color.blue);
			}
		});
		BlueColorRadioButton.setBounds(6, 263, 109, 23);
		Optionpanel.add(BlueColorRadioButton);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User.addShapesToDB();
				IOManger.currentuserId = 0;
				MyConnection.closeConnection();
				dispose();
				LoginPage loginpage = new LoginPage();
				loginpage.setVisible(true);

			}
		});
		btnExit.setBounds(10, 340, 89, 23);
		Optionpanel.add(btnExit);

	}

}
