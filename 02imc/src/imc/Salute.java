package imc;

public class Salute {

	public void imc(Persona persona) {

		double result = persona.getMassa() / Math.pow(persona.getAltezza(), 2);

		persona.setImc(result);

		if(result < 18.5) {
			persona.setClasseRischio("sottopeso");
		}
		else if(result >= 18.5 && result < 25) {
			persona.setClasseRischio("normale");
		}
		else if(result >= 25 && result < 30) {
			persona.setClasseRischio("sovrappeso");
		}
		else {
			persona.setClasseRischio("obeso");
		}
	}
}
