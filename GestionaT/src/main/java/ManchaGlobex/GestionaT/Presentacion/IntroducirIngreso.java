package ManchaGlobex.GestionaT.Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class IntroducirIngreso {

	private JFrame frmIntroducirIngreso;
	private JPanel panel;
	private JLabel lblTipo;
	private JLabel lblNewLabel;
	private JLabel lblFecha;
	private JLabel lblEtiqueta;
	private JTextField Tipo;
	private JTextField cantidad;
	private JTextField fecha;
	private JTextField etiqueta;
	private JButton btnIntroducirIngreso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntroducirIngreso window = new IntroducirIngreso();
					window.frmIntroducirIngreso.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IntroducirIngreso() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIntroducirIngreso = new JFrame();
		frmIntroducirIngreso.setTitle("Introducir Ingreso");
		frmIntroducirIngreso.setBounds(100, 100, 421, 269);
		frmIntroducirIngreso.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			panel = new JPanel();
			frmIntroducirIngreso.getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				lblTipo = new JLabel("Tipo");
				lblTipo.setBounds(34, 25, 46, 14);
				panel.add(lblTipo);
			}
			{
				lblNewLabel = new JLabel("Cantidad");
				lblNewLabel.setBounds(34, 67, 46, 14);
				panel.add(lblNewLabel);
			}
			{
				lblFecha = new JLabel("Fecha");
				lblFecha.setBounds(34, 111, 46, 14);
				panel.add(lblFecha);
			}
			{
				lblEtiqueta = new JLabel("Etiqueta");
				lblEtiqueta.setBounds(34, 158, 46, 14);
				panel.add(lblEtiqueta);
			}
			{
				Tipo = new JTextField();
				Tipo.setBounds(127, 22, 86, 20);
				panel.add(Tipo);
				Tipo.setColumns(10);
			}
			{
				cantidad = new JTextField();
				cantidad.setText("");
				cantidad.setBounds(127, 64, 86, 20);
				panel.add(cantidad);
				cantidad.setColumns(10);
			}
			{
				fecha = new JTextField();
				fecha.setBounds(127, 108, 86, 20);
				panel.add(fecha);
				fecha.setColumns(10);
			}
			{
				etiqueta = new JTextField();
				etiqueta.setText("");
				etiqueta.setBounds(127, 155, 86, 20);
				panel.add(etiqueta);
				etiqueta.setColumns(10);
			}
			{
				btnIntroducirIngreso = new JButton("Introducir Ingreso");
				btnIntroducirIngreso.setBounds(244, 171, 138, 38);
				panel.add(btnIntroducirIngreso);
			}
		}
	}

}
