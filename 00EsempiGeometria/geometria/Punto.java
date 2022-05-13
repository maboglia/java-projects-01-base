
public class Punto {

	//dichiarazione variabili di istanza private
	private int x, y;

	//costruttori
	public Punto() {
		this.x = 0; //literal
		this.y = 0;
	}
	
	public Punto(int a, int b) {
		this.x = b;
		this.y = a;
	}
	
	//metodi getter per ricevere i valori
	public int getX(){
		x++;
		return this.x;
	}
	
	public int leggiValoreDiX(){
		return this.x;
	}
		
	public int getY(){
		return this.y;
	}

}
