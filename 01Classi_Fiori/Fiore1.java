/*
  La classe Fiore1 definisce alcuen caratteristiche di un giore (numero
  petali e colore). 
*/

public class Fiore1 {

    private int numeroPetali; 
    private String colore; 

    // costruisco un fiore assegnando i petali e il colore
    public Fiore1(int numP, String col) {
	numeroPetali = numP; 
	colore = col; 
    }

    public int dammiNumPetali() {
	return numeroPetali;
    }

    public String dammiColore() {
	return colore; 
    }
}
