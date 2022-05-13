package imc;

public class Main {
	public static void main(String[] args) {

		Salute salute = new Salute();
		
		Persona p1 = new Persona(62, 1.75);
		salute.imc(p1);
		System.out.println(p1.stampaDettagli());
		
		Persona p2 = new Persona(70, 1.65);
		salute.imc(p2);
		System.out.println("\n" + p2.stampaDettagli());
		
		Persona p3 = new Persona(72, 1.90);
		salute.imc(p3);
		System.out.println("\n" + p3.stampaDettagli());
		
	}
}
