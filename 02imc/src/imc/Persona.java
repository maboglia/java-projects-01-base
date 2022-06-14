package imc;

public class Persona {

	private double massa;
	private double altezza;
	private double imc;
	private String classeRischio;

	public Persona(double massa, double altezza) {
		this.massa = massa;
		this.altezza = altezza;
	}

	public double getMassa() {
		return this.massa;
	}

	public double getAltezza() {
		return this.altezza;
	}

	public double getImc() {
		return this.imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}

	public String getClasseRischio() {
		return this.classeRischio;
	}

	public void setClasseRischio(String classeRischio) {
		this.classeRischio = classeRischio;
	}
		
	public String stampaDettagli() {
		return "Imc: " + this.getImc() + "\n" + "Classe di rischio: " + this.getClasseRischio();
	}
}

