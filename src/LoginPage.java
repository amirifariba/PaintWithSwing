import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField UsertextField;
	private JTextField PasswordtextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 374, 255);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		UsertextField = new JTextField();
		UsertextField.setBounds(167, 46, 118, 20);
		contentPane.add(UsertextField);
		UsertextField.setColumns(10);

		PasswordtextField = new JTextField();
		PasswordtextField.setBounds(167, 77, 118, 20);
		contentPane.add(PasswordtextField);
		PasswordtextField.setColumns(10);

		JLabel UserNameLabel = new JLabel(" username");
		UserNameLabel.setBounds(80, 49, 69, 14);
		contentPane.add(UserNameLabel);

		JLabel PasswordLabel = new JLabel(" password");
		PasswordLabel.setBounds(83, 80, 56, 14);
		contentPane.add(PasswordLabel);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User user = new User(UsertextField.getText(), PasswordtextField.getText());
				if (user.checkUser()) {
					PaintPage2 paintpage = new PaintPage2();

					paintpage.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "this user not found");
				}
			}
		});
		btnLogin.setBounds(167, 119, 118, 23);
		contentPane.add(btnLogin);
	}
}
