package ManchaGlobex.GestionaT.Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class IntroducirGasto {

	private JFrame frmIntroducirGasto;
	private JPanel panel;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnIntroducirGasto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntroducirGasto window = new IntroducirGasto();
					window.frmIntroducirGasto.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IntroducirGasto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIntroducirGasto = new JFrame();
		frmIntroducirGasto.setTitle("Introducir Gasto");
		frmIntroducirGasto.setBounds(100, 100, 418, 267);
		frmIntroducirGasto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			panel = new JPanel();
			panel.setLayout(null);
			frmIntroducirGasto.getContentPane().add(panel, BorderLayout.CENTER);
			{
				label = new JLabel("Tipo");
				label.setBounds(34, 25, 46, 14);
				panel.add(label);
			}
			{
				label_1 = new JLabel("Cantidad");
				label_1.setBounds(34, 67, 46, 14);
				panel.add(label_1);
			}
			{
				label_2 = new JLabel("Fecha");
				label_2.setBounds(34, 111, 46, 14);
				panel.add(label_2);
			}
			{
				label_3 = new JLabel("Etiqueta");
				label_3.setBounds(34, 158, 46, 14);
				panel.add(label_3);
			}
			{
				textField = new JTextField();
				textField.setColumns(10);
				textField.setBounds(127, 22, 86, 20);
				panel.add(textField);
			}
			{
				textField_1 = new JTextField();
				textField_1.setText("");
				textField_1.setColumns(10);
				textField_1.setBounds(127, 64, 86, 20);
				panel.add(textField_1);
			}
			{
				textField_2 = new JTextField();
				textField_2.setColumns(10);
				textField_2.setBounds(127, 108, 86, 20);
				panel.add(textField_2);
			}
			{
				textField_3 = new JTextField();
				textField_3.setText("");
				textField_3.setColumns(10);
				textField_3.setBounds(127, 155, 86, 20);
				panel.add(textField_3);
			}
			{
				btnIntroducirGasto = new JButton("Introducir Gasto");
				btnIntroducirGasto.setBounds(234, 170, 147, 36);
				panel.add(btnIntroducirGasto);
			}
		}
	}
}
