package week3.negozio;

/**
 * Created by mauro on 20/06/16.
 */
public class Negozio {
    public static void main(String[] args) {

        Cassa cassa1 = new Cassa();

        cassa1.aggiungiProdotto("12345", "Pasta Barilla", 0.79);
        cassa1.aggiungiProdotto("12354", "Pesto buono dela nonna", 5.79);
        cassa1.aggiungiProdotto("1546", "Spigola", 8.90);
        cassa1.aggiungiProdotto("12745", "Patate novelle", 3.49);
        cassa1.aggiungiProdotto("89678", "Pastiera ", 10.79);


        cassa1.stampaScontrino();


    }
}
