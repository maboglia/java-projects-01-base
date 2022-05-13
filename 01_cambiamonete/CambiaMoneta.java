package week4.cambiamonete;

/**
 * Created by mauro on 29/06/16.
 */
public class CambiaMoneta {

    public static int[] cambia(int denaro){

        int[] arrayTagli = new int[9];

        int p500 = 0;
        int p200 = 0;
        int p100 = 0;
        int p50  = 0;
        int p20  = 0;
        int p10  = 0;
        int p5   = 0;
        int p2   = 0;
        int p1   = 0;

        if (denaro >= 500){
            while (denaro>=500){
                denaro -= 500;
                p500++;
            }
            arrayTagli[0] = p500;
        }

        if (denaro >= 200){
            while (denaro>=200){
                denaro -= 200;
                p200++;
            }
            arrayTagli[1] = p200;
        }

        if (denaro >= 100){
            while (denaro>=100){
                denaro -= 100;
                p100++;
            }
            arrayTagli[2] = p100;
        }

        if (denaro >= 50){
            while (denaro>=50){
                denaro -= 50;
                p50++;
            }
            arrayTagli[3] = p50;
        }

        if (denaro >= 20){
            while (denaro>=20){
                denaro -= 20;
                p20++;
            }
            arrayTagli[4] = p20;
        }

        if (denaro >= 10){
            while (denaro>=10){
                denaro -= 10;
                p10++;
            }
            arrayTagli[5] = p10;
        }

        if (denaro >= 5){
            while (denaro>=5){
                denaro -= 5;
                p5++;
            }
            arrayTagli[6] = p5;
        }

        if (denaro >= 2){
            while (denaro>=2){
                denaro -= 2;
                p2++;
            }
            arrayTagli[7] = p500;
        }

        if (denaro >= 1){
            while (denaro>=1){
                denaro -= 1;
                p1++;
            }
            arrayTagli[8] = p1;
        }


        return arrayTagli;

    }

}
