package ManchaGlobex.GestionaT;

import java.awt.EventQueue;

import javax.swing.JFrame;
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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblApellidos;
	private JLabel lblDni;
	private JLabel lblCorreoElectrnico;
	private JLabel lblContrasea;
	private JTextField textField_4;

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
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(10, 0, 363, 262);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(194, 62, 111, 20);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(194, 96, 111, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(194, 127, 111, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(194, 158, 111, 20);
		panel.add(textField_3);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(73, 62, 46, 14);
		panel.add(lblNombre);
		
		lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(73, 96, 46, 14);
		panel.add(lblApellidos);
		
		lblDni = new JLabel("DNI");
		lblDni.setBounds(73, 127, 46, 14);
		panel.add(lblDni);
		
		lblCorreoElectrnico = new JLabel("Correo electrónico");
		lblCorreoElectrnico.setBounds(73, 158, 111, 14);
		panel.add(lblCorreoElectrnico);
		
		lblContrasea = new JLabel("Contraseña");
		lblContrasea.setBounds(73, 191, 76, 14);
		panel.add(lblContrasea);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(194, 191, 111, 20);
		panel.add(textField_4);
	}
}
