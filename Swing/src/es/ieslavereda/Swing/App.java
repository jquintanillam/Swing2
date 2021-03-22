package es.ieslavereda.Swing;

import java.awt.EventQueue;

import es.ieslavereda.swing.controlador.Controlador;
import es.ieslavereda.swing.vistas.Bombo;

public class App {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bombo frame = new Bombo();
					Controlador controlador = new Controlador(frame);
					controlador.go();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
