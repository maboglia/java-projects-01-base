package week3.contocorrente;

import java.util.Date;

/**
 * Created by mauro on 23/06/16.
 */
public class OperazioneCC {

    private Date dataOperazione;
    private int importo;

    public OperazioneCC(Date dataOperazione, int importo) {
        if(importo == 0) throw new RuntimeException("stattene a casa se non c'hai un picco, barbone!");
        this.dataOperazione = dataOperazione;
        this.importo = importo;
    }

    @Override
    public String toString(){
        String descrizione = "Operazione";
        if(this.importo >= 0)
            descrizione = descrizione + "DEPOSITO";
        else
            descrizione = descrizione + "PRELIEVO\t\t\t";

        return descrizione + this.importo + " - " + this.dataOperazione;

    }

}
