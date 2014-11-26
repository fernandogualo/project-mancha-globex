package ManchaGlobex.GestionaT.Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import java.awt.Button;
import javax.swing.JLabel;

public class IUInforme {

	private JFrame frame;
	private JPanel panel;
	private JTextField tfFechaInicio;
	private JTextField tfFechaFinal;
	private Button button;
	private JLabel lblFechaInicio;
	private JLabel lblFechafinal;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IUInforme window = new IUInforme();
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
	public IUInforme() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			panel = new JPanel();
			frame.getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				tfFechaInicio = new JTextField();
				tfFechaInicio.setBounds(152, 44, 86, 20);
				panel.add(tfFechaInicio);
				tfFechaInicio.setColumns(10);
			}
			{
				tfFechaFinal = new JTextField();
				tfFechaFinal.setBounds(152, 83, 86, 20);
				panel.add(tfFechaFinal);
				tfFechaFinal.setColumns(10);
			}
			{
				button = new Button("Generar Informes");
				button.setBounds(286, 42, 105, 43);
				panel.add(button);
			}
			{
				lblFechaInicio = new JLabel("Fecha inicio:");
				lblFechaInicio.setBounds(27, 47, 91, 14);
				panel.add(lblFechaInicio);
			}
			{
				lblFechafinal = new JLabel("FechaFinal");
				lblFechafinal.setBounds(27, 86, 91, 14);
				panel.add(lblFechafinal);
			}
			{
				table = new JTable();
				table.setBounds(27, 124, 364, 126);
				panel.add(table);
			}
		}
	}
}
