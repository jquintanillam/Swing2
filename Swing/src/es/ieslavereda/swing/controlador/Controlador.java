package es.ieslavereda.swing.controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import es.ieslavereda.swing.modelage.Bola;
import es.ieslavereda.swing.vistas.Bombo;

public class Controlador implements ActionListener {

	private Bombo vista;

	private ArrayList<Bola> bola;
	private int index;

	
	
	public Controlador(Bombo vista) {
		super();

		this.vista = vista;
		this.index = 0;
		
		bola = new ArrayList<Bola>();
		
		inicializar();
		
	}



	private void inicializar() {

		vista.getBtnSimulacion().addActionListener(this);
		
		vista.getBtnSimulacion().setActionCommand("Simular");
		
	}

	public void go() {
		vista.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		String comando = arg0.getActionCommand();
		
		if(comando.equals("Simular")) {
			simulador();
		}
		
	}

	private void simulador() {
	
		vista.getBtnSimulacion().setVisible(false);
		tabla();
		
	}
	private void tabla() {
		vista.getExtraer().getValue();
		
//		vista = new Bombo();
//		vista.setVisible(true);
//		
		vista.getDtm().addColumn("Simulacion nº");
		
		
		for(int i = 0 ; i < (Integer)vista.getExtraer().getValue() ; i++ ) {
			vista.getDtm().addColumn("Bola " + (i+1) );
			
		}
		
		vista.getDtm().addColumn("Exito");
		
		vista.getDtm().addColumn("nº aciertos");
		

		for(int a = 0 ; a < (Integer)vista.getExtraer().getValue() ; a++) {
			vista.getDtm().addRow(new String[] {bola.toString()});
		}
		
	}



	
	
}
