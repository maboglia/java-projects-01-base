package week3.negozio;

/**
 * Created by mauro on 20/06/16.
 */
public class Prodotto {
    private String codice;
    private String descrizione;
    private double prezzo;

    public Prodotto(String codice, String descrizione, double prezzo) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }

    public String getCodice() {
        return codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }
}
