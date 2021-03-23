package es.ieslavereda.swing.modelage;

public class Bola {
	
	private int numeroBola;
	private String resultadoBola;

	public Bola(int numeroBola, String resultadoBola) {
		super();
		this.numeroBola = numeroBola;
		this.resultadoBola = resultadoBola;
	}
	
	public void combertir() {
		resultadoBola = Integer.toString(numeroBola);
	}

	public int getNumeroBola() {
		return numeroBola;
	}

	public void setNumeroBola(int numeroBola) {
		this.numeroBola = numeroBola;
	}
	

	public String getResultadoBola() {
		return resultadoBola;
	}

	public void setResultadoBola(String resultadoBola) {
		this.resultadoBola = resultadoBola;
	}

	@Override
	public String toString() {
		return "Bola [numeroBola=" + numeroBola + "]";
	}
	

}
