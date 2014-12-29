package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
//import java.sql.Date;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dominio.GestorGastoIngreso;

public class GastoIngresoIU {

	private JFrame frmIntroducirGatoingreso;
	private JPanel panel;
	private JLabel lbCantidad;
	private JLabel lbEtiqueta;
	private JTextField textCantidad;
	private JTextField textEtiqueta;
	private JButton btnIntroducir;
	private JCheckBox chckbxGasto;
	private JCheckBox chckbxIngreso;

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
		frmIntroducirGatoingreso.setTitle("Introducir Gasto/Ingreso");
		frmIntroducirGatoingreso.setBounds(100, 100, 337, 300);
		frmIntroducirGatoingreso.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
				lbEtiqueta = new JLabel("Etiqueta");
				lbEtiqueta.setBounds(29, 77, 83, 14);
				panel.add(lbEtiqueta);
			}
			{
				textCantidad = new JTextField();
				textCantidad.setText("");
				textCantidad.setColumns(10);
				textCantidad.setBounds(122, 35, 138, 20);
				panel.add(textCantidad);
			}
			{
				textEtiqueta = new JTextField();
				textEtiqueta.setText("");
				textEtiqueta.setColumns(10);
				textEtiqueta.setBounds(122, 74, 138, 20);
				panel.add(textEtiqueta);
			}
			{
				btnIntroducir = new JButton("Introducir");
				btnIntroducir.addActionListener(new BtnIntroducirActionListener());
				btnIntroducir.setBounds(122, 142, 138, 75);
				panel.add(btnIntroducir);
			}
			{
				chckbxGasto = new JCheckBox("Gasto");
				chckbxGasto.setBounds(29, 142, 97, 23);
				panel.add(chckbxGasto);
			}
			{
				chckbxIngreso = new JCheckBox("Ingreso");
				chckbxIngreso.setBounds(29, 187, 97, 23);
				panel.add(chckbxIngreso);
			}
		}
	}
	private class BtnIntroducirActionListener implements ActionListener {
		GestorGastoIngreso ggi= new GestorGastoIngreso();
		public void actionPerformed(ActionEvent arg0) {
			
			if(ggi.comprobarCantidad(textCantidad)){
				
				if((chckbxGasto.isSelected()==true && chckbxIngreso.isSelected()==true) ||(chckbxGasto.isSelected()==false && chckbxIngreso.isSelected()==false) ){
					JOptionPane.showMessageDialog(null, "No se puede seleccionar ambas opciones.Seleccione la requerida.");
					chckbxGasto.setSelected(false);
					chckbxIngreso.setSelected(false);
				}else{
					if(chckbxGasto.isSelected()==true && chckbxIngreso.isSelected()==false){//introducimos un gasto	
						double gasto=Double.parseDouble(textCantidad.getText());
						gasto=gasto*-1;
						try {
							if(ggi.introducirGastoIngreso(gasto, textEtiqueta.getText())){
								JOptionPane.showMessageDialog(null, "Gasto introducido!!");
							}
						} catch (HeadlessException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					if(chckbxGasto.isSelected()==false && chckbxIngreso.isSelected()==true){//introducimos un ingreso
						double gasto=Double.parseDouble(textCantidad.getText());
						try {
							if(ggi.introducirGastoIngreso(gasto, textEtiqueta.getText())){
								JOptionPane.showMessageDialog(null, "Ingreso introducido!!");
							}
						} catch (HeadlessException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
}
