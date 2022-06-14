package main;

import automobile.Automobile;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Automobile auto = new Automobile();
		
		auto.stampa();
		
		Automobile macchina = new Automobile("F480","FD333RR","Blu");
		
		macchina.stampa();
		
		Automobile costruttore = new Automobile();
		
		costruttore.stampa();
		
	}

}
