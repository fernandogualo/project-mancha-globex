package ManchaGlobex.GestionaT;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;

public class LoginIU {

	private JFrame frame;
	private JPanel panel;
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JLabel lblLogo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginIU window = new LoginIU();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginIU() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		{
			panel = new JPanel();
			panel.setBounds(0, 0, 434, 261);
			frame.getContentPane().add(panel);
			panel.setLayout(null);
			{
				lblUsuario = new JLabel("Usuario:");
				lblUsuario.setBounds(179, 74, 45, 26);
				panel.add(lblUsuario);
			}
			{
				lblContrasea = new JLabel("Contraseña");
				lblContrasea.setBounds(179, 125, 76, 14);
				panel.add(lblContrasea);
			}
			{
				lblLogo = new JLabel(" ");
				lblLogo.setBounds(43, 86, 46, 14);
				panel.add(lblLogo);
			}
		}
	}
}
