package prodotti;

public class ProdottoScontato extends Prodotto {

	private int sconto;
	private int soglia;
	
	public ProdottoScontato(String d, double p, int q, int sc, int so) {
		super(d, p, q);
		sconto = sc;
		soglia = so;
	}

	public ProdottoScontato(String d, double p, int sc, int so) {
		this(d, p, 0, sc, so);
	}

	public boolean vendi(int q) {
		if ((q<=0)||(q>quantita))
			return false;
		else {
			double totale = q * prezzo;
			if (q>=soglia) {
				totale -= totale * sconto/100;
			}
			System.out.println(descrizione + " " + totale);
			quantita -= q;
			return true;
		}
	}
	
}
