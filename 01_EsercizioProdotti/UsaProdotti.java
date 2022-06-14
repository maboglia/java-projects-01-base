import prodotti.Prodotto;
import prodotti.ProdottoScontato;

public class UsaProdotti {

	public static void main(String[] args) {

		Prodotto panino = new Prodotto("panino", 5);
		
		Prodotto bibita = new Prodotto("bibita", 3, 20);
		
		ProdottoScontato caramella = new ProdottoScontato("caramella", 0.5, 100, 10, 20);
		
		boolean tutto_ok;
		tutto_ok = panino.vendi();
		if (!tutto_ok) System.out.println("Vendita non andata bene");
		
		panino.rifornisci(10);
		tutto_ok = panino.vendi();
		if (!tutto_ok) System.out.println("Vendita non andata bene");
		
		tutto_ok = bibita.vendi();
		if (!tutto_ok) System.out.println("Vendita non andata bene");
		
		tutto_ok = caramella.vendi();
		if (!tutto_ok) System.out.println("Vendita non andata bene");

		tutto_ok = caramella.vendi(5);
		if (!tutto_ok) System.out.println("Vendita non andata bene");

		tutto_ok = caramella.vendi(30);
		if (!tutto_ok) System.out.println("Vendita non andata bene");

		
	}

}
