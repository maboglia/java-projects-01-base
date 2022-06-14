package week4.cambiamonete;

/**
 * Created by mauro on 29/06/16.
 */
public class Main {

    public static void main(String[] args) {

        int denaro = 73456;
        int[] risultato = CambiaMoneta.cambia(denaro);

        String[] pezzi = {
                "500", "200", "100", "50", "20", "10", "5", "2", "1",
        };

        for (int i = 0; i < risultato.length; i++) {

            if (risultato[i] >=1 ){
                int result =  (Integer.parseInt(pezzi[i]) * risultato[i]);
            System.out.println("Pezzi da \t" + pezzi[i] +  "\teuro: \t" + risultato[i] +"\t\t " + result );
            }

        }
        /*
        if (risultato[1] >=1 ){
        System.out.println("Pezzi da 200 euro: " + risultato[1]);
        }

        if (risultato[2] >=1 ){
        System.out.println("Pezzi da 100 euro: " + risultato[2]);
        }

        if (risultato[3] >=1 ){
        System.out.println("Pezzi da 50 euro: " + risultato[3]);
        }

        if (risultato[4] >=1 ){
        System.out.println("Pezzi da 20 euro: " + risultato[4]);
        }

        if (risultato[5] >=1 ){
        System.out.println("Pezzi da 10 euro: " + risultato[5]);
        }

        if (risultato[6] >=1 ){
        System.out.println("Pezzi da 5 euro: " + risultato[6]);
        }

        if (risultato[7] >=1 ){
        System.out.println("Pezzi da 2 euro: " + risultato[7]);
        }

        if (risultato[8] >=1 ){
        System.out.println("Pezzi da 1 euro: " + risultato[8]);
        }

        */
    }



}
