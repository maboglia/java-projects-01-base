package week3.contocorrente;

import java.util.Date;

/**
 * Created by mauro on 23/06/16.
 */
public class ContoCorrenteTester {


    public static void main(String[] args) {

        Date oggi = new Date();


    ContoCorrente c1 = new ContoCorrente("mauro", "abcdef");

    ContoCorrente c2 = new ContoCorrente("paolo", "ghilmno");

    c1.versamento(10000,oggi);
    c1.versamento(5000,oggi);
    c1.versamento(500,oggi);
    c1.prelievo(3000,oggi);

        c1.listaMovimenti();

        System.out.println(c1);

    c2.versamento(10000,oggi);
    c2.prelievo(5000,oggi);
    c2.versamento(500,oggi);
    c2.prelievo(3000,oggi);

        c2.listaMovimenti();

        System.out.println(c2);





    }

}
