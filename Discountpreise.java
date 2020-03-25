import java.util.Scanner;

class Discountpreis
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		double Preis; 
		double EndPreis;
		System.out.println("Geben sie einen Preis ein:");
		Preis = scan.nextDouble();
		if (Preis > 10 )
			EndPreis = Preis * 0.9;
		else 
			EndPreis = Preis; 
		
		System.out.println("Es kostet noch :" + EndPreis);
	
		
		
		
		
		
	}
}	
