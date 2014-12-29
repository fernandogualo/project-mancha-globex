package presentacion;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuIU {

	private JFrame frame;
	private JPanel panel;
	private JButton btnIntroducirGastoIngreso;
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
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		{
			panel = new JPanel();
			frame.getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				btnIntroducirGastoIngreso = new JButton("Introducir Gasto/Ingreso");
				btnIntroducirGastoIngreso.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						GastoIngresoIU igasto=new GastoIngresoIU();
						igasto.main(null);
					}
				});
				btnIntroducirGastoIngreso.setBounds(43, 40, 329, 47);
				panel.add(btnIntroducirGastoIngreso);
			}
			{
				btnIntroducirDeuda = new JButton("Introducir Deuda");
				btnIntroducirDeuda.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					IntroducirDeuda ideuda=new IntroducirDeuda();
					ideuda.main(null);
					}
				});
				btnIntroducirDeuda.setBounds(43, 122, 329, 46);
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
