package ManchaGlobex.GestionaT.Presentacion;
import ManchaGlobex.GestionaT.Dominio.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class EtiquetaIU {

	private JFrame frame;
	private JPanel panel;
	private JLabel lblNombre;
	private JLabel lblDescripcion;
	private JTextField tfNombre;
	private JButton btnCrear;
	private JLabel lblResultado;
	private JTextPane taDescripcion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EtiquetaIU window = new EtiquetaIU();
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
	public EtiquetaIU() {
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
				lblNombre = new JLabel("Nombre:");
				lblNombre.setBounds(10, 44, 73, 14);
				panel.add(lblNombre);
			}
			{
				lblDescripcion = new JLabel("Descripcion:");
				lblDescripcion.setBounds(10, 91, 73, 14);
				panel.add(lblDescripcion);
			}
			{
				tfNombre = new JTextField();
				tfNombre.setBounds(116, 41, 164, 20);
				panel.add(tfNombre);
				tfNombre.setColumns(10);
			}
			{
				btnCrear = new JButton("Crear");
				btnCrear.addActionListener(new BtnCrearActionListener());
				btnCrear.setBounds(300, 213, 101, 23);
				panel.add(btnCrear);
			}
			{
				lblResultado = new JLabel("");
				lblResultado.setBounds(10, 217, 46, 14);
				panel.add(lblResultado);
			}
			{
				taDescripcion = new JTextPane();
				taDescripcion.setBorder(new LineBorder(new Color(0, 0, 0)));
				taDescripcion.setBounds(115, 91, 165, 123);
				panel.add(taDescripcion);
			}
		}
	}
	private class BtnCrearActionListener implements ActionListener {
		EtiquetaDAO edao;
		public void actionPerformed(ActionEvent e) {
			if(tfNombre.getText() != null){
				if(taDescripcion.getText() != null){
					///falta alguna extructura para comprobar que se ha creao bn
					edao.crearEtiqueta(tfNombre.getText(),taDescripcion.getText());
					lblResultado.setText("Se ha creado la etiqueta");
					
					
				}else{
					edao.crearEtiqueta(tfNombre.getText());
					lblResultado.setText("Se ha creado la etiqueta");
				}
			}else{
				lblResultado.setText("Fallo en la creacion de la etiqueta");
			}
		}
	}
}
