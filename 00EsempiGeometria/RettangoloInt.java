 import system.IO;

 class RettangoloInt
 {

	public static void main(String[] args)
		{
		int base;
		int altezza;
		int area;
		int perimetro;


		// FASE DI INPUT

		System.out.print("Base = ");
		base=IO.in.readInt();

		System.out.print ("Altezza = ");
		altezza = IO.in.readInt();


		// FASE DI ELABORAZIONE

		area = base * altezza;
		perimetro = 2*(base+altezza);


		// FASE DI OUTPUT

		System.out.println("Area = "+area);
		System.out.println("Perimetro = "+perimetro);
		}

 }

