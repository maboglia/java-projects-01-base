 import system.IO;

 class RettangoloDouble
 {

	public static void main(String[] args)
		{
		double base;
		double altezza;
		double area;
		double perimetro;


		// FASE DI INPUT

		System.out.print("Base = ");
		base=IO.in.readDouble();

		System.out.print ("Altezza = ");
		altezza = IO.in.readDouble();


		// FASE DI ELABORAZIONE

		area = base * altezza;
		perimetro = 2*(base+altezza);


		// FASE DI OUTPUT

		System.out.println("Area = "+area);
		System.out.println("Perimetro = "+perimetro);
		}

 }

