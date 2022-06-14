/*
Questa classe testa la classe MiaMath
*/

public class ProveMiaMath {


    public static void main(String[] a) {
	int x = 2;
	int y = 5;
	int z = -3;

	double u = 10.;

	System.out.println("Il quadrato di " + x + " e': " 
			   + MiaMath.quadrato(x));

	System.out.println("Il cubo di " + x + " e': " 
			   + MiaMath.cubo(x));

	System.out.println("Il quadrato di " + u + " e': " 
			   + MiaMath.quadrato(u));

	System.out.println("Il cubo di " + u + " e': " 
			   + MiaMath.cubo(u));

	System.out.println(x + "^" + y + " vale: " + MiaMath.potenza(x, y));

	System.out.println(u + "^" + y + " vale: " + MiaMath.potenza(u, y));

	System.out.println(u + "^" + z + " vale: " + MiaMath.potenza(u, z));


    }
}
