package week4.zaino;

import java.util.Scanner;

/**
 * Created by mauro on 30/06/16.
 */
public class ZainoTest {
    public static void main(String[] args) {

    Zaino z = new Zaino("invicta", "mauro", 4);
    Scanner sc = new Scanner(System.in);

        boolean esci = false;

        while (!esci){

            System.out.println("-------------------");
            System.out.println("scrivi cosa vuoi fare: \nelenco, \nzaino, \nprendi, \naggiungi \no q per uscire");
            System.out.println("-------------------");
            System.out.println();
            String c = sc.next();

            if (c.equals("q")){
                esci = true;
            } else if (c.equals("elenco")){
                z.elencaCose();
            } else if (c.equals("zaino")){
                System.out.println("marca " + z.getMarca());
                System.out.println("proprietario " + z.getProprietario());
                System.out.println("n max " + z.getNumeroMaxCose());

            } else if (c.equals("prendi")){
                z.elencaCose();
                System.out.println("inserisci numero: ");
                int pos = sc.nextInt();
                Cosa cosa = z.rimuoviCosa(pos);
                System.out.println(cosa.getNome());
                System.out.println(cosa.getDesc());

            } else if (c.equals("aggiungi")){
                System.out.println("cosa inserisci nello zaino?");
                String nome = sc.next();
                System.out.println("descrivi meglio la cosa");
                String desc = sc.next();
                Cosa nuovaCosa = new Cosa(nome, desc);

                boolean inserito = z.inserisciCosa(nuovaCosa);

                if (inserito == false)
                    System.out.println("zaino pieno, non posso inserire");
                else
                    System.out.println("inserito l'oggetto nello zaino");

            }



        }




        sc.close();


    }

}
