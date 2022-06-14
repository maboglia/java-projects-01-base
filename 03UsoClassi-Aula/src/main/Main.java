package main;

import allievo.Allievo;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Allievo [] classe = new Allievo [2];
		
		classe[0] = new Allievo("Mauro", "Bogliaccino", 26, "via boh");
		classe[1] = new Allievo("pippo", "pippo", 26, "via ciao");
		
		stampa(classe);
	}

	public static void stampa(Allievo [] allievo){
		
		for(int x = 0; x < allievo.length; x++){
			System.out.println("Il nome dell'allievo è: "+allievo[x].nome+
					" cognome è: " + allievo[x].cognome +
					" eta è: "+ allievo[x].eta +
					" indirizzo è: "+ allievo[x].indirizzo);
		}
		
	}
	
}
