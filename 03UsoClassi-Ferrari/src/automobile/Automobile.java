package automobile;

public class Automobile {

	public String modello;
	public String targa;
	public String colore;
	
	public Automobile(){
		modello = "Enzo";
		targa = "FG456ER";
		colore = "Nero";
	}
	
	public Automobile(String modello, String targa, String colore){
		this.modello = modello;
		this.targa = targa;
		this.colore = colore;
	}
	
	public void stampa(){
		System.out.println("il modello �: " + modello + " la targa �: " + targa + " e il colore �: " + colore);
	}
	
}
