package ManchaGlobex.GestionaT.Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class IntroducirDeuda {

	private JFrame frmIntroducirDeuda;
	private JPanel panel;
	private JButton btnIntroducirDeuda;
	private JTextField textField;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblDestinatario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntroducirDeuda window = new IntroducirDeuda();
					window.frmIntroducirDeuda.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IntroducirDeuda() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIntroducirDeuda = new JFrame();
		frmIntroducirDeuda.setTitle("Introducir Deuda");
		frmIntroducirDeuda.setBounds(100, 100, 450, 278);
		frmIntroducirDeuda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			panel = new JPanel();
			panel.setLayout(null);
			frmIntroducirDeuda.getContentPane().add(panel, BorderLayout.CENTER);
			{
				btnIntroducirDeuda = new JButton("Introducir Deuda");
				btnIntroducirDeuda.setBounds(250, 183, 154, 23);
				panel.add(btnIntroducirDeuda);
			}
			{
				textField = new JTextField();
				textField.setColumns(10);
				textField.setBounds(154, 46, 86, 20);
				panel.add(textField);
			}
			{
				label = new JLabel("Cantidad");
				label.setBounds(35, 49, 46, 14);
				panel.add(label);
			}
			{
				label_1 = new JLabel("Fecha");
				label_1.setBounds(35, 80, 46, 14);
				panel.add(label_1);
			}
			{
				label_2 = new JLabel("Etiqueta");
				label_2.setBounds(35, 111, 46, 14);
				panel.add(label_2);
			}
			{
				textField_1 = new JTextField();
				textField_1.setColumns(10);
				textField_1.setBounds(154, 77, 86, 20);
				panel.add(textField_1);
			}
			{
				textField_2 = new JTextField();
				textField_2.setColumns(10);
				textField_2.setBounds(154, 108, 86, 20);
				panel.add(textField_2);
			}
			{
				textField_3 = new JTextField();
				textField_3.setBounds(154, 139, 86, 20);
				panel.add(textField_3);
				textField_3.setColumns(10);
			}
			{
				lblDestinatario = new JLabel("Destinatario");
				lblDestinatario.setBounds(35, 142, 68, 14);
				panel.add(lblDestinatario);
			}
		}
	}

}
