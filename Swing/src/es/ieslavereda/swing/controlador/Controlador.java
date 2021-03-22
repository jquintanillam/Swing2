package es.ieslavereda.swing.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import es.ieslavereda.swing.vistas.Bombo;

public class Controlador implements ActionListener {

	private Bombo vista;

	

	
	
	public Controlador(Bombo vista) {
		super();

		this.vista = vista;
		
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
		
		if(comando.equals("Simulador")) {
			simulador();
		}
		
	}

	private void simulador() {
	
		tabla();
		
	}
	private void tabla() {
	
		
	}
	
	
}
