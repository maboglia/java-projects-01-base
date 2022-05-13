package week3.negozio;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mauro on 20/06/16.
 */
public class Cassa {

    private List<Prodotto> prodotti = new ArrayList<>();

    public void aggiungiProdotto(String codice, String desc, double prezzo){

        Prodotto p = new Prodotto(codice, desc, prezzo);
        prodotti.add(p);

    }

    public void stampaScontrino(){

        double somma = 0;

        for (Prodotto p: prodotti) {
            System.out.println(p.getDescrizione());
            somma += p.getPrezzo();

        }

        System.out.println("il totale è");
        System.out.println(Math.round(somma));


    }



}
