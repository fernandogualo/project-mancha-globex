package ManchaGlobex.GestionaT.Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;

public class IntroducirGastoIngresoIU {

	private JFrame frame;
	private JPanel panel;
	private JButton btnIngresarGasto;
	private JButton btnIngresarDeuda;
	private JButton btnIngresarIngreso;
	private JLabel lblIngreseUnGasto;
	private JLabel lblIngreseUnIngreso;
	private JLabel lblIngreseUnaDeuda;
	private JTextField Gasto;
	private JTextField Ingreso;
	private JTextField Deuda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntroducirGastoIngresoIU window = new IntroducirGastoIngresoIU();
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
	public IntroducirGastoIngresoIU() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 436, 269);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			panel = new JPanel();
			frame.getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				btnIngresarGasto = new JButton("Ingresar Gasto");
				btnIngresarGasto.addActionListener(new BtnIngresarDeudagastoActionListener());
				btnIngresarGasto.setBounds(247, 45, 154, 23);
				panel.add(btnIngresarGasto);
			}
			{
				btnIngresarDeuda = new JButton("Ingresar Deuda");
				btnIngresarDeuda.setBounds(247, 171, 154, 23);
				panel.add(btnIngresarDeuda);
			}
			{
				btnIngresarIngreso = new JButton("Ingresar Ingreso");
				btnIngresarIngreso.setBounds(247, 107, 154, 23);
				panel.add(btnIngresarIngreso);
			}
			{
				lblIngreseUnGasto = new JLabel("Ingrese un gasto: ");
				lblIngreseUnGasto.setBounds(10, 49, 106, 14);
				panel.add(lblIngreseUnGasto);
			}
			{
				lblIngreseUnIngreso = new JLabel("Ingrese un ingreso: ");
				lblIngreseUnIngreso.setBounds(10, 111, 121, 14);
				panel.add(lblIngreseUnIngreso);
			}
			{
				lblIngreseUnaDeuda = new JLabel("Ingrese una deuda:");
				lblIngreseUnaDeuda.setBounds(10, 175, 106, 14);
				panel.add(lblIngreseUnaDeuda);
			}
			{
				Gasto = new JTextField();
				Gasto.setBounds(129, 46, 86, 20);
				panel.add(Gasto);
				Gasto.setColumns(10);
			}
			{
				Ingreso = new JTextField();
				Ingreso.setBounds(129, 108, 86, 20);
				panel.add(Ingreso);
				Ingreso.setColumns(10);
			}
			{
				Deuda = new JTextField();
				Deuda.setBounds(126, 172, 86, 20);
				panel.add(Deuda);
				Deuda.setColumns(10);
			}
		}
	}

	private class BtnIngresarDeudagastoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
		}
	}
}
