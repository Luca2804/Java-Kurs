import java.util.Scanner;

class Berreicheaddieren 
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		
		int Gewicht = 1, Zaehler = 10;
		double Versandkosten = 3.0; 
		
		while(Gewicht > 0)
		{
			if(Gewicht == 0)
			{
				break;
			}
			System.out.println("Gewicht der Sendung :");
			Gewicht = scan.nextInt();
			if (Gewicht > 10)
			{
				while(Zaehler < Gewicht)
				{
					Zaehler = Zaehler + 1 ;
					Versandkosten = Versandkosten + 0.25;
				}
					Zaehler = 10;
					System.out.println("Versandkosten :" + Versandkosten);
					Versandkosten = 3.0;
			}
			else 
			{
				System.out.println("Versandkosten :" + Versandkosten);
			}
		}
	}
}