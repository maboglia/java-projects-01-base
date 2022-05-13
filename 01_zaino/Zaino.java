package week4.zaino;

import java.util.ArrayList;

/**
 * Created by mauro on 30/06/16.
 */
public class Zaino {

    private String marca;
    private String proprietario;
    private int numeroMaxCose;
    private ArrayList<Cosa> cose;

    public Zaino(String marca, String proprietario, int numeroMaxCose) {
        this.marca = marca;
        this.proprietario = proprietario;
        this.numeroMaxCose = numeroMaxCose;

        inserisciCose();
    }

    private void inserisciCose() {
        cose = new ArrayList<Cosa>();
        cose.add(new Cosa("penna", "blu"));
        cose.add(new Cosa("computer", "mac"));
        cose.add(new Cosa("focaccia", "bianca"));

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {

        this.marca = marca;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public int getNumeroMaxCose() {
        return numeroMaxCose;
    }

    public void setNumeroMaxCose(int numeroMaxCose) {
        this.numeroMaxCose = numeroMaxCose;
    }

    public void elencaCose(){
        for (int i = 0; i < cose.size(); i++) {
            Cosa c = cose.get(i);
            int pos = i + 1;
            System.out.println(pos + " -\t " + c.getNome() + " -\t " + c.getDesc() + "");

        }
    }


    public Cosa rimuoviCosa(int pos){

        int i = pos - 1 ;

        Cosa c = cose.get(i);
        cose.remove(i);

        return c;

    }

    public boolean inserisciCosa(Cosa c){
        if(numeroMaxCose > cose.size()){
            cose.add(c);
            return true;
        } else {
            return false;
        }
    }

}
