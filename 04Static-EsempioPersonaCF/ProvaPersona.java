
public class ProvaPersona {

  public static void main(String[] args) {
  	Persona p1 = new Persona("Giovanni","Bianchi","GVIBCH123213");
	Persona p2 = new Persona("Mario","Rossi","MRARSS123213");
	
	System.out.println(p1.getNome());
	
	String input = "MRARSS123213";
	
	Persona output = Persona.cercaPersona(input);
	
	System.out.println(output.getNome());
	
  }
}
