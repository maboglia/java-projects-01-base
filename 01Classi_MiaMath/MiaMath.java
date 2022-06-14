/*
Questa classe mi permette di avere delle funzioni che calcolano 
potenze di numeri
*/

public class MiaMath {


    // Calcola il quadrato di un intero e restituisce un intero
    public static int quadrato(int a) {

	return a*a;
    }

    // calcola il quadrato di un numero double e restituisce un
    // numero double

    public static double quadrato(double a) {
	return a*a;
    }

    // Calcola il cubo di un intero e restituisce un intero
    public static int cubo(int a) {

	return a*a*a;
    }

    // calcola il cubo di un numero double e restituisce un
    // numero double

    public static double cubo(double a) {
	return a*a*a;
    }

    // calcola la potenza i-ima di un numero intero e restituisce
    // un intero.
    public static int potenza(int a, int b) {

	if (b < 0) 
	    return 0;

	int c = 1;
	for (int i = 0; i < b; i++) {
	    c *= a;
	}
	return c;
    }

    // calcola la potenza i-ima di un numero double e restituisce
    // un double. 
    public static double potenza(double a, int b) {

	int esp = b;

	if (b < 0)
	    esp = -b;

	double c = 1;
	for (int i = 0; i < esp; i++) {
	    c *= a;
	}

	if (b >= 0) 
	    return c;
	else 
	    return 1/c;
    }


} // fine classe MiaMath
