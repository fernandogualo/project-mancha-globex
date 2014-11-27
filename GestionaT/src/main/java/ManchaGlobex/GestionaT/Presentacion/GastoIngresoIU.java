package ManchaGlobex.GestionaT.Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GastoIngresoIU {

	private JFrame frmIntroducirGatoingreso;
	private JPanel panel;
	private JLabel lbCantidad;
	private JLabel lbFecha;
	private JLabel lbEtiqueta;
	private JTextField textCantidad;
	private JTextField textFecha;
	private JTextField textEtiqueta;
	private JButton btnIntroducir;
	private JCheckBox chckbxGasto;
	private JCheckBox chckbxIngreso;
	private JLabel lbDestinatario;
	private JTextField textDestinatario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GastoIngresoIU window = new GastoIngresoIU();
					window.frmIntroducirGatoingreso.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GastoIngresoIU() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIntroducirGatoingreso = new JFrame();
		frmIntroducirGatoingreso.setTitle("Introducir Gato/Ingreso");
		frmIntroducirGatoingreso.setBounds(100, 100, 450, 300);
		frmIntroducirGatoingreso.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			panel = new JPanel();
			panel.setLayout(null);
			frmIntroducirGatoingreso.getContentPane().add(panel, BorderLayout.CENTER);
			{
				lbCantidad = new JLabel("Cantidad");
				lbCantidad.setBounds(29, 38, 83, 14);
				panel.add(lbCantidad);
			}
			{
				lbFecha = new JLabel("Fecha");
				lbFecha.setBounds(29, 69, 83, 14);
				panel.add(lbFecha);
			}
			{
				lbEtiqueta = new JLabel("Etiqueta");
				lbEtiqueta.setBounds(29, 100, 83, 14);
				panel.add(lbEtiqueta);
			}
			{
				textCantidad = new JTextField();
				textCantidad.setText("");
				textCantidad.setColumns(10);
				textCantidad.setBounds(122, 35, 86, 20);
				panel.add(textCantidad);
			}
			{
				textFecha = new JTextField();
				textFecha.setColumns(10);
				textFecha.setBounds(122, 66, 86, 20);
				panel.add(textFecha);
			}
			{
				textEtiqueta = new JTextField();
				textEtiqueta.setText("");
				textEtiqueta.setColumns(10);
				textEtiqueta.setBounds(122, 97, 86, 20);
				panel.add(textEtiqueta);
			}
			{
				btnIntroducir = new JButton("Introducir");
				btnIntroducir.addActionListener(new BtnIntroducirActionListener());
				btnIntroducir.setBounds(258, 179, 138, 38);
				panel.add(btnIntroducir);
			}
			{
				chckbxGasto = new JCheckBox("Gasto");
				chckbxGasto.setBounds(29, 187, 97, 23);
				panel.add(chckbxGasto);
			}
			{
				chckbxIngreso = new JCheckBox("Ingreso");
				chckbxIngreso.setBounds(138, 187, 97, 23);
				panel.add(chckbxIngreso);
			}
			{
				lbDestinatario = new JLabel("Destinatario");
				lbDestinatario.setBounds(29, 131, 83, 14);
				panel.add(lbDestinatario);
			}
			{
				textDestinatario = new JTextField();
				textDestinatario.setBounds(122, 128, 86, 20);
				panel.add(textDestinatario);
				textDestinatario.setColumns(10);
			}
		}
	}
	private class BtnIntroducirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if((chckbxGasto.isSelected()==true && chckbxIngreso.isSelected()==true) ||(chckbxGasto.isSelected()==false && chckbxIngreso.isSelected()==false) ){
				JOptionPane.showMessageDialog(null, "No se puede seleccionar ambas opciones.Seleccione la requerida.");
				chckbxGasto.setSelected(false);
				chckbxIngreso.setSelected(false);
			}else{
				if(chckbxGasto.isSelected()==true && chckbxIngreso.isSelected()==false){//introducimos un gasto
					
					
				}
				if(chckbxGasto.isSelected()==false && chckbxIngreso.isSelected()==true){//introducimos un ingreso
					
				}
			}
		}
	}
}