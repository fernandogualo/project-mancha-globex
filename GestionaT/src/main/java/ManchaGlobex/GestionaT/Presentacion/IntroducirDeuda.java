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
	private JTextField textCantidad;
	private JLabel lbCantidad;
	private JLabel lbFecha;
	private JTextField textFecha;
	private JTextField textEtiqueta;
	private JTextField textDestinatario;
	private JLabel lbDestinatario;
	private JLabel lbEtiqueta;

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
				btnIntroducirDeuda.setBounds(254, 171, 157, 46);
				panel.add(btnIntroducirDeuda);
			}
			{
				textCantidad = new JTextField();
				textCantidad.setColumns(10);
				textCantidad.setBounds(154, 46, 86, 20);
				panel.add(textCantidad);
			}
			{
				lbCantidad = new JLabel("Cantidad");
				lbCantidad.setBounds(35, 49, 46, 14);
				panel.add(lbCantidad);
			}
			{
				lbFecha = new JLabel("Fecha");
				lbFecha.setBounds(35, 80, 46, 14);
				panel.add(lbFecha);
			}
			{
				lbEtiqueta = new JLabel("Etiqueta");
				lbEtiqueta.setBounds(35, 111, 46, 14);
				panel.add(lbEtiqueta);
			}
			{
				textFecha = new JTextField();
				textFecha.setColumns(10);
				textFecha.setBounds(154, 77, 86, 20);
				panel.add(textFecha);
			}
			{
				textEtiqueta = new JTextField();
				textEtiqueta.setColumns(10);
				textEtiqueta.setBounds(154, 108, 86, 20);
				panel.add(textEtiqueta);
			}
			{
				textDestinatario = new JTextField();
				textDestinatario.setBounds(154, 139, 86, 20);
				panel.add(textDestinatario);
				textDestinatario.setColumns(10);
			}
			{
				lbDestinatario = new JLabel("Destinatario");
				lbDestinatario.setBounds(35, 142, 68, 14);
				panel.add(lbDestinatario);
			}
		}
	}

}
