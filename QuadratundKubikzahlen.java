import java.util.Scanner;

class QuadratundKubikzahlen
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		
		int Zahl, n, Zaehler = 0, Quadratsumme = 0 , Kubiksumme = 0;
		
		System.out.println("Geben Sie n ein:");
		n = scan.nextInt();
		
		while(Zaehler < n)
		{
			Zaehler = Zaehler + 1; 
			Quadratsumme = Quadratsumme + Zaehler * Zaehler;
			Kubiksumme = Kubiksumme + Zaehler * Zaehler * Zaehler;
		}
		
		System.out.println("Die Quadratsumme ist: " + Quadratsumme);
		System.out.println("Die Kubiksumme ist: " + Kubiksumme);
	}
}