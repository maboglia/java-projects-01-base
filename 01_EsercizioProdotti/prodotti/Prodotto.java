package prodotti;

public class Prodotto {

	protected String descrizione;
	protected double prezzo;
	protected int quantita;
	
	public Prodotto (String d, double p, int q) {
		descrizione = d;
		prezzo = p;
		quantita = q;
	}
	
	public Prodotto(String d, double p) {
		this(d,p,0);
	}
	
	public void rifornisci(int q) {
		if (q>0) quantita += q;
	}
	
	public boolean vendi() {
		if (quantita>0) {
			System.out.println(descrizione + " " + prezzo);
			quantita--;
			return true;
		}
		return false;
	}
	
}
