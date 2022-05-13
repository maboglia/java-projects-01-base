/*
  La classe Fiore2 definisce alcune caratteristiche di un fiore (numero
  petali e colore). E' uguale alla classe Fiore1, salvo che ha in piu'
  la sovrascrittura del metodo toString() della classe Object.
*/

public class Fiore2 {

    private int numeroPetali; 
    private String colore; 

    // costruisco un fiore assegnando i petali e il colore
    public Fiore2(int numP, String col) {
	numeroPetali = numP; 
	colore = col; 
    }

    public int dammiNumPetali() {
	return numeroPetali;
    }

    public String dammiColore() {
	return colore; 
    }

    // riscrivo il metodo toString() della superclasse Object.
    public String toString() {
	return "fiore con petali: " + numeroPetali + ", di colore: " + colore;
    }
}
