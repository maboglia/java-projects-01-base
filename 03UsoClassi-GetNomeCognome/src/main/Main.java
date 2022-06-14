package main;

import iterazione.Iterazione;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iterazione ite = new Iterazione();
		ite.setNome("mauro");
		ite.setCognome("bogliaccino");
		
		System.out.println("il mio nome è: "+ite.getNome() + " e il mio cognome è: " + ite.getCognome());
	}

}
