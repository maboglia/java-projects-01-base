package week3.contocorrente;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by mauro on 23/06/16.
 */
public class ContoCorrente {
    private String titolare;
    private String numeroConto;
    private double saldo;
    private ArrayList<OperazioneCC> movimenti;

    public ContoCorrente(String titolare, String numeroConto) {
        this.titolare = titolare;
        this.numeroConto = numeroConto;
        this.saldo = 0;
        movimenti = new ArrayList<>();
    }

    public void versamento(int importo, Date data){

        OperazioneCC op = new OperazioneCC(data, importo);

        movimenti.add(op);

        saldo += importo;


    }

    public void prelievo(int importo, Date data){

        OperazioneCC op = new OperazioneCC(data, importo);

        movimenti.add(op);

        saldo -= importo;


    }

    public void listaMovimenti(){

        for (OperazioneCC op:movimenti
             ) {
            System.out.println(op.toString());
        }

    }

    @Override
    public String toString() {
        String descrizione = "Conto corrente " +
                this.numeroConto +
                " intestato a " + this.titolare +
                " - Saldo disponibile " + this.saldo;

        return descrizione;
    }
}
