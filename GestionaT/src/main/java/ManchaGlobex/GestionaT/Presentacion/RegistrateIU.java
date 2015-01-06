package ManchaGlobex.GestionaT.Presentacion;
import ManchaGlobex.GestionaT.Dominio.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JLabel;

public class RegistrateIU {

	private JFrame frame;
	private JPanel panel;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtDNI;
	private JTextField txtEmail;
	private JLabel lblApellidos;
	private JLabel lblDni;
	private JLabel lblCorreoElectrnico;
	private JLabel lblContrasea;
	private JTextField txtContrasena;
	private JButton btnRegistrarse;
	private GestorRegistrarse gr=new GestorRegistrarse();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrateIU window = new RegistrateIU();
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
	public RegistrateIU() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 399, 315);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(10, 0, 363, 262);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(198, 30, 111, 20);
		panel.add(txtNombre);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(198, 64, 155, 20);
		panel.add(txtApellidos);
		
		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBounds(198, 95, 111, 20);
		panel.add(txtDNI);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(198, 126, 111, 20);
		panel.add(txtEmail);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(77, 30, 46, 14);
		panel.add(lblNombre);
		
		lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(77, 64, 46, 14);
		panel.add(lblApellidos);
		
		lblDni = new JLabel("DNI");
		lblDni.setBounds(77, 95, 46, 14);
		panel.add(lblDni);
		
		lblCorreoElectrnico = new JLabel("Correo electrónico");
		lblCorreoElectrnico.setBounds(77, 126, 111, 14);
		panel.add(lblCorreoElectrnico);
		
		lblContrasea = new JLabel("Contraseña");
		lblContrasea.setBounds(77, 159, 76, 14);
		panel.add(lblContrasea);
		
		txtContrasena = new JTextField();
		txtContrasena.setColumns(10);
		txtContrasena.setBounds(198, 159, 111, 20);
		panel.add(txtContrasena);
		{
			btnRegistrarse = new JButton("Registrarse");
			btnRegistrarse.addActionListener(new BtnRegistrarseActionListener());
			btnRegistrarse.setBounds(132, 210, 89, 23);
			panel.add(btnRegistrarse);
		}
	}
	private class BtnRegistrarseActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			GestorUsuario gu=new GestorUsuario();
			try {
				if(gu.regitrar(txtDNI.getText(),txtNombre.getText(),txtApellidos.getText() , txtEmail.getText(), txtContrasena.getText())==true){
				JOptionPane.showMessageDialog(null, "Registrado");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
