package ManchaGlobex.GestionaT.Presentacion;
import ManchaGlobex.GestionaT.Dominio.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class MenuIU {

	private JFrame frame;
	private JPanel panel;
	private JButton btnIntroducirGasto;
	private JButton btnIntroducirIngreso;
	private JButton btnIntroducirDeuda;
	private JButton btnGenerarInformes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuIU window = new MenuIU();
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
	public MenuIU() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 329);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			panel = new JPanel();
			frame.getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				btnIntroducirGasto = new JButton("Introducir Gasto");
				btnIntroducirGasto.setBounds(43, 25, 329, 47);
				panel.add(btnIntroducirGasto);
			}
			{
				btnIntroducirIngreso = new JButton("Introducir Ingreso");
				btnIntroducirIngreso.setBounds(43, 140, 329, 47);
				panel.add(btnIntroducirIngreso);
			}
			{
				btnIntroducirDeuda = new JButton("Introducir Deuda");
				btnIntroducirDeuda.setBounds(43, 83, 329, 46);
				panel.add(btnIntroducirDeuda);
			}
			{
				btnGenerarInformes = new JButton("Generar Informes");
				btnGenerarInformes.setBounds(43, 198, 329, 47);
				panel.add(btnGenerarInformes);
			}
		}
	}

}
