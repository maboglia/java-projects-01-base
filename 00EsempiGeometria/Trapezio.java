	import system.IO;
	import java.lang.Math;


public class Trapezio
 {

	public static void main(String[] args)
	{
		int latoobliquo1;
		int latoobliquo2;
		int basemaggiore ;
		int baseminore ;
		int altezza  ;
		int area;
       	int perimetro;


		System.out.println("               TRAPEZIO");
		System.out.println(" ");


	// INPUT

		System.out.print(" basemaggiore = ");
		basemaggiore = IO.in.readInt() ;

		System.out.print("baseminore = ");
		baseminore =IO.in.readInt() ;

		System.out.print("altezza = ");
		altezza=IO.in.readInt();

		System.out.print("lato obliquo 1 = ");
		latoobliquo1=IO.in.readInt();

		System.out.print("lato obliquo 2 = ");
		latoobliquo2=IO.in.readInt();


	// ELABORAZIONE


		area =(baseminore + basemaggiore) * altezza / 2 ;
	        perimetro = basemaggiore + baseminore + latoobliquo1 + latoobliquo2;


	// OUTPUT

		System.out.println("Area = "+area);
	        System.out.println("Perimetro = "+perimetro);

	}

}
