
public class Geometria {

		static String[] punti = {"punto1", "punto2", "punto3", "punto4", "punto5" }; 
	
	public static void main(String[] args){
		System.out.println("sono nella classe geometria, nel metodo main");
		
		System.out.println("creo il punto 1");
		Punto p1 = new Punto();
		System.out.println(p1.leggiValoreDiX() + ", " + p1.getY());
		

		System.out.println("creo il punto 2");
		Punto p2 = new Punto(4,5);
		System.out.println(p2.getX() + ", " + p2.getY());
	
		
		Persona people1 = new Persona("mauro","bogliaccino");
		System.out.println(people1.getFirma().replace("o", "a").toUpperCase());
		
		for (int i = 0; i < punti.length; i++) {
			
			double casuale = Math.random() * 10 +1 ;
			
		System.out.println("Valore di i = " + punti[i]   + " valore random: " + (casuale) );
					
		}
		
		
		
	}
}
