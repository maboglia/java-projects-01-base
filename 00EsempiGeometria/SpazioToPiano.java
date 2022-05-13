/** Questa classe permette di costruire oggetti che convertono
    un punto in coordinate spaziali in un punto sul piano 
    su cui si proietta il punto dello spazio.
*/

public class SpazioToPiano {


    private int xOrigine, yOrigine;

    /**
       Fissa l'origine degli assi piani
       @a ascissa dell'origine sullo schermo
       @b ordinata dell'origine sullo schermo.
     */
    public SpazioToPiano(int a, int b) {
	xOrigine = a; 
	yOrigine = b;
    }
     
    /**
       Trasforma un punto dello spazio in un punto da disegnare sul piano.
       @P il punto dello spazio
       @U fattore di scala.
       @return le due copordinate del punto trasformato.
     */
    public int[] coordPiane(double[] P, double U) {

	// i tre assi coordinati sono rappresentati sul piano da 
	// tre rette, l'asse z e' verticale, l'asse x e l'asse y
	// assieme all'asse z dividono il piano in 3 parti uguali
	// (angoli di 120 gradi).

	return new int[] {(int)(xOrigine + U*(P[1] - P[0])*Math.sqrt(3)/2),
	                   (int)(yOrigine - U*P[2] + U*(P[0] + P[1])/2)};

    }

}
