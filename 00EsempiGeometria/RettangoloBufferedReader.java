import java.io.*;

class RettangoloBufferedReader
{

	public static void main(String[] args) throws IOException
		{

		BufferedReader stdin = new BufferedReader
                                      (new InputStreamReader(System.in));


        	int base, altezza, area; 	//Dichiarazione di tre numeri interi
        	double metaArea;	    	//Dichiarazione di un numero reale


		System.out.print("Base = ");

        	System.out.flush();
        	base = Integer.parseInt(stdin.readLine()); //legge una linea, e dopo converte in un intero


		System.out.print ("Altezza = ");

        	System.out.flush();
        	altezza = Integer.parseInt(stdin.readLine());

		area = base*altezza;
	
		System.out.println("Area = "+area);
		

      		}

   	}

