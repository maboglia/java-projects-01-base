Poligono.java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Poligono {

	/**
	 * Metodo ausiliario per leggere una stringa da tastiera e convertirla in intero
	 */
	public static int stampaLeggiConverti(String m) throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(input);
		System.out.print(m);
		String line = reader.readLine();
		int valore = Integer.parseInt(line);
		return valore;
	}
	
	/**
	 * Metodo ausiliario per leggere una stringa da tastiera 
	 */
	public static String stampaLeggi(String m) throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(input);
		System.out.print(m);
		String line = reader.readLine();
		return line;
	}
	
	/**
	 * Metodo ausiliario che date le coordinate degli estremi di un segmaneto nel piano
	 * cartesiano (x1,y1) (x2,y2), ne calcola la lunghezza e la restituisce sotto forma di double
	 */
	public static double calcolaLunghezzaSegmento(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
	
	/**
	 * Metodo che preso in ingresso il numero di vertici di un poligono,
	 * chiede le coordinate cartesiane dei vertici all'utente e ne calcola il perimetro
	 */
	public static double calcolaPerimetro(int numLati) throws IOException {
		System.out.println("Digitare le coordinate dei " + numLati + " vertici del poligono...");
		int x1 = stampaLeggiConverti("X1 = ");
		int y1 = stampaLeggiConverti("Y1 = ");
		int xtemp = x1;
		int ytemp = y1;
		double perimetro = 0;
		for (int i=1; i < numLati; i++) {
			int xnext = stampaLeggiConverti("X" + (i+1) + " = ");
			int ynext = stampaLeggiConverti("Y" + (i+1) + " = ");
			perimetro = perimetro + calcolaLunghezzaSegmento(xtemp, ytemp, xnext, ynext);
			xtemp = xnext;
			ytemp = ynext;
		}
		perimetro = perimetro + calcolaLunghezzaSegmento(xtemp,ytemp,x1,y1);
		return perimetro;
	}
	
	/**
	 * Metodo che preso in ingresso il numero di vertici di un poligono,
	 * chiede le coordinate cartesiane dei vertici all'utente e ne calcola l'area
	 */
	public static double calcolaArea(int numLati) throws IOException {
		System.out.println("Digitare le coordinate dei " + numLati + " vertici del poligono...");
		int x1 = stampaLeggiConverti("X1 = ");
		int y1 = stampaLeggiConverti("Y1 = ");
		int xtemp = x1;
		int ytemp = y1;
		double area = 0;
		for (int i=1; i < numLati; i++) {
			int xnext = stampaLeggiConverti("X" + (i+1) + " = ");
			int ynext = stampaLeggiConverti("Y" + (i+1) + " = ");
			area = area + xtemp*ynext - xnext*ytemp;
			xtemp = xnext;
			ytemp = ynext;
		}
		area = area + xtemp*y1 - ytemp*x1;
		area = Math.abs(area) / 2;
		return area;
	}
	
	/**
	 * Metodo che preso in ingresso il numero di vertici di un poligono,
	 * chiede le coordinate cartesiane nel formato (x,y) dei vertici all'utente e ne calcola l'area
	 */
	public static double calcolaAreaConPunti(int numLati) throws IOException {
		System.out.println("Digitare le coordinate dei " + numLati + " vertici del poligono...");
		System.out.println("Usare il formato Pi = (x,y), esempio P1 = (5,4)");
		String punto1 = stampaLeggi("P1 = ");
		int x1 = Poligono.estraiCoordinataX(punto1);
		int y1 = Poligono.estraiCoordinataY(punto1);
		int xtemp = x1;
		int ytemp = y1;
		double area = 0;
		for (int i=1; i < numLati; i++) {
			String puntoNext = stampaLeggi("P" + (i+1) + " = ");
			int xnext = Poligono.estraiCoordinataX(puntoNext);
			int ynext = Poligono.estraiCoordinataY(puntoNext);;
			area = area + xtemp*ynext - xnext*ytemp;
			xtemp = xnext;
			ytemp = ynext;
		}
		area = area + xtemp*y1 - x1*ytemp;
		area = Math.abs(area) / 2;
		return area;
	}
	
	/**
	 * Metodo che preso in ingresso il numero di vertici di un poligono,
	 * chiede le coordinate cartesiane nel formato (x,y) dei vertici all'utente e ne calcola il perimetro
	 */
	public static double calcolaPerimetroConPunti(int numLati) throws IOException {
		System.out.println("Digitare le coordinate dei " + numLati + " vertici del poligono...");
		System.out.println("Usare il formato Pi = (x,y), esempio P1 = (5,4)");
		String punto1 = stampaLeggi("P1 = ");
		int x1 = Poligono.estraiCoordinataX(punto1);
		int y1 = Poligono.estraiCoordinataY(punto1);
		int xtemp = x1;
		int ytemp = y1;
		double perimetro = 0;
		for (int i=1; i < numLati; i++) {
			String puntoNext = stampaLeggi("P" + (i+1) + " = ");
			int xnext = Poligono.estraiCoordinataX(puntoNext);
			int ynext = Poligono.estraiCoordinataY(puntoNext);;
			perimetro = perimetro + calcolaLunghezzaSegmento(xtemp, ytemp, xnext, ynext);
			xtemp = xnext;
			ytemp = ynext;
		}
		perimetro = perimetro + calcolaLunghezzaSegmento(xtemp,ytemp,x1,y1);
		return perimetro;
	}
	
	/**
	 * Data una stringa contenente le coordinate cartesiane di un punto nel formato (x,y)
	 * estrare la coordinata X e la restituisce sotto forma di intero
	 */
	public static int estraiCoordinataX(String punto) {
		if (!punto.startsWith("(")) {
			System.out.println("ERRORE NEL FORMATO! manca la parentesi iniziale! restituisco ZERO!!");
			return 0;
		}
		if (!punto.endsWith(")")) {
			System.out.println("ERRORE NEL FORMATO! manca la parentesi finale! restituisco ZERO!!");
			return 0;
		}
		if (!punto.contains(",")) {
			System.out.println("ERRORE NEL FORMATO! manca la virgola! restituisco ZERO!!");
			return 0;
		}		
		String xcoord = punto.substring(1,punto.indexOf(","));
		return Integer.parseInt(xcoord);
	}
	
	/**
	 * Data una stringa contenente le coordinate cartesiane di un punto nel formato (x,y)
	 * estrare la coordinata Y e la restituisce sotto forma di intero
	 */
	public static int estraiCoordinataY(String punto) {
		if (!punto.startsWith("(")) {
			System.out.println("ERRORE NEL FORMATO! manca la parentesi iniziale! restituisco ZERO!!");
			return 0;
		}
		if (!punto.endsWith(")")) {
			System.out.println("ERRORE NEL FORMATO! manca la parentesi finale! restituisco ZERO!!");
			return 0;
		}
		if (!punto.contains(",")) {
			System.out.println("ERRORE NEL FORMATO! manca la virgola! restituisco ZERO!!");
			return 0;
		}		
		String xcoord = punto.substring(punto.indexOf(",")+1, punto.length()-1);
		return Integer.parseInt(xcoord);
	}

	/**
	 * Metodo eseguibile per il collaudo delle funzionalita' del programma 
	 */
	public static void main(String[] args) throws IOException {
		calcolaPerimetro(6);
	}
	
}

