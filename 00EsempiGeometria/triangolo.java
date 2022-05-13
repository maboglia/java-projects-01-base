	import system.IO;
        import java.lang.Math;

public class triangolo
{
	public static void main(String[] args)
		{
	    	double lato1;
		double lato2;
		double lato3 ;
             	double area;
             	double perimetro;
             	double semiperimetro;


		System.out.println("                TRIANGOLO");
		System.out.println("");

		System.out.print("lato 1 =");
		lato1 = IO.in.readDouble();

		System.out.print("lato 2 = ");
		lato2 = IO.in.readDouble();

		System.out.print("lato 3 = ");
		lato3 = IO.in.readDouble();

		perimetro = lato1+lato2+lato3;
		semiperimetro= perimetro/2;

		area= Math.sqrt (semiperimetro*(semiperimetro-lato1)*(semiperimetro-lato2)*(semiperimetro-lato3));	//formula erone

		System.out.println("Area= "+area );
		System.out.println("Perimetro= " +perimetro);
            	}
}
