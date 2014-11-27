package ManchaGlobex.GestionaT.Presentacion;

import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Component;

import javax.swing.Box;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

import ManchaGlobex.GestionaT.Dominio.GestorDeuda;

import com.toedter.calendar.JCalendar;

import javax.swing.JCheckBox;

public class IntroducirDeuda {

	private JFrame frmIntroducirDeuda;
	private JPanel panel;
	private JButton btnIntroducirDeuda;
	private JTextField textCantidad;
	private JLabel lbCantidad;
	private JTextField textEtiqueta;
	private JTextField textDestinatario;
	private JLabel lbDestinatario;
	private JLabel lbEtiqueta;
	private JCheckBox chckbxAFavor;
	private JCheckBox chckbxEnContra;

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
		frmIntroducirDeuda.setBounds(100, 100, 403, 335);
		frmIntroducirDeuda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			panel = new JPanel();
			panel.setLayout(null);
			frmIntroducirDeuda.getContentPane().add(panel, BorderLayout.CENTER);
			{
				btnIntroducirDeuda = new JButton("Introducir Deuda");
				btnIntroducirDeuda.addActionListener(new BtnIntroducirDeudaActionListener());
				btnIntroducirDeuda.setBounds(191, 181, 154, 70);
				panel.add(btnIntroducirDeuda);
			}
			{
				textCantidad = new JTextField();
				textCantidad.setColumns(10);
				textCantidad.setBounds(154, 46, 119, 20);
				panel.add(textCantidad);
			}
			{
				lbCantidad = new JLabel("Cantidad");
				lbCantidad.setBounds(35, 49, 68, 14);
				panel.add(lbCantidad);
			}
			{
				lbEtiqueta = new JLabel("Etiqueta");
				lbEtiqueta.setBounds(35, 87, 68, 14);
				panel.add(lbEtiqueta);
			}
			{
				textEtiqueta = new JTextField();
				textEtiqueta.setColumns(10);
				textEtiqueta.setBounds(154, 84, 119, 20);
				panel.add(textEtiqueta);
			}
			{
				textDestinatario = new JTextField();
				textDestinatario.setBounds(154, 122, 119, 20);
				panel.add(textDestinatario);
				textDestinatario.setColumns(10);
			}
			{
				lbDestinatario = new JLabel("Destinatario");
				lbDestinatario.setBounds(35, 125, 68, 14);
				panel.add(lbDestinatario);
			}
			{
				chckbxAFavor = new JCheckBox("A favor");
				chckbxAFavor.setBounds(35, 181, 97, 23);
				panel.add(chckbxAFavor);
			}
			{
				chckbxEnContra = new JCheckBox("En contra");
				chckbxEnContra.setBounds(35, 229, 97, 23);
				panel.add(chckbxEnContra);
			}
		}
	}
	private class BtnIntroducirDeudaActionListener implements ActionListener {
		GestorDeuda gd=new GestorDeuda();
		public void actionPerformed(ActionEvent arg0) {
			if(gd.comprobarCantidad(textCantidad)){
				if(textDestinatario.getText()!= null && textEtiqueta.getText() !=null){
					if((chckbxAFavor.isSelected()==true && chckbxEnContra.isSelected()==true) ||(chckbxAFavor.isSelected()==false && chckbxEnContra.isSelected()==false) ){
						JOptionPane.showMessageDialog(null, "No se puede seleccionar ambas opciones.Seleccione la requerida.");
						chckbxAFavor.setSelected(false);
						chckbxEnContra.setSelected(false);
					}else{
						if(chckbxAFavor.isSelected()==true && chckbxEnContra.isSelected()==false){
							double gasto=Double.parseDouble(textCantidad.getText());
							try {
								if(gd.introducirDeuda(gasto, textEtiqueta.getText(), textDestinatario.getText())){
									JOptionPane.showMessageDialog(null, "Deuda introducida!!");
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
								JOptionPane.showMessageDialog(null, "Ingreso introducido!!");
						}
						if(chckbxAFavor.isSelected()==false && chckbxEnContra.isSelected()==true){//introducimos un ingreso
							double gasto=Double.parseDouble(textCantidad.getText());
							gasto=gasto*-1;
							try {
								if(gd.introducirDeuda(gasto, textEtiqueta.getText(), textDestinatario.getText())){
									JOptionPane.showMessageDialog(null, "Deuda introducida!!");
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
}
