/* 
   Questa classe permette di definire uno studente, che e' caratterizzato
   da un nome, tre voti e la possibilita' di ottenere la media dei suoi
   voti.
*/

public class Studente {

    public int voto1; 
    public int voto2; 
    public int voto3;

    public String nome;

    // calcolo la media dei voti:

    public double mediaVoti() {
	return (double)(voto1 + voto2 + voto3)/3;
    }


} // fine classe Studente
