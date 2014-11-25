package ManchaGlobex.GestionaT.Presentacion;

import  ManchaGlobex.GestionaT.Dominio.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginIU {

	private JFrame frame;
	private JPanel panel;
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JLabel lblLogo;
	private JTextField tfUsuario;
	private JPasswordField pwdContrasena;
	private JButton btnIniciarSesion;
	private JButton btnRegistrarse;
	private JLabel lblnoTieneCuenta;
	private JLabel lblResultado;

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
		frame.setBounds(100, 100, 386, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);		
		{
			panel = new JPanel();
			panel.setBounds(0, 0, 434, 261);
			frame.getContentPane().add(panel);
			panel.setLayout(null);
			{
				lblUsuario = new JLabel("Usuario:");
				lblUsuario.setBounds(151, 74, 66, 26);
				panel.add(lblUsuario);
			}
			{
				lblContrasea = new JLabel("Contraseña");
				lblContrasea.setBounds(151, 125, 83, 14);
				panel.add(lblContrasea);
			}
			{
				lblLogo = new JLabel(" ");
				lblLogo.setBounds(43, 86, 46, 14);
				panel.add(lblLogo);
			}
			{
				tfUsuario = new JTextField();
				tfUsuario.setBounds(244, 77, 105, 20);
				panel.add(tfUsuario);
				tfUsuario.setColumns(10);
			}
			{
				pwdContrasena = new JPasswordField();
				pwdContrasena.setBounds(244, 122, 105, 20);
				panel.add(pwdContrasena);
			}
			{
				btnIniciarSesion = new JButton("Iniciar Sesión");
				btnIniciarSesion.addActionListener(new BtnIniciarSesinActionListener());
				btnIniciarSesion.setBounds(198, 164, 151, 50);
				panel.add(btnIniciarSesion);
			}
			{
				btnRegistrarse = new JButton("Registrarse");
				btnRegistrarse.addActionListener(new BtnRegistrarseActionListener());
				btnRegistrarse.setBounds(10, 166, 116, 46);
				panel.add(btnRegistrarse);
			}
			{
				lblnoTieneCuenta = new JLabel("¿No tiene cuenta? Registrese");
				lblnoTieneCuenta.setBounds(10, 223, 169, 14);
				panel.add(lblnoTieneCuenta);
			}
			{
				lblResultado = new JLabel("");
				lblResultado.setBounds(198, 223, 46, 14);
				panel.add(lblResultado);
			}
		}
	}
	private class BtnIniciarSesinActionListener implements ActionListener {
		UsuarioDAO aux= new UsuarioDAO();
		public void actionPerformed(ActionEvent arg0) {
			if(tfUsuario.getText() != null && pwdContrasena.getText() != null){				
				if(aux.comprobarLogin(tfUsuario.getText(), pwdContrasena.getText())==true){
					lblResultado.setText("Ha iniciado sesion correctamente.");
					
				}
				lblResultado.setText("Fallo en el inicio de sesion.");
			}
			
			
		}
	}
	private class BtnRegistrarseActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			RegistrateIU reg=new RegistrateIU();
			reg.main(null);
			
		}
	}
}
