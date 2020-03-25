import java.util.Scanner;

class DeathValley 
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		double Tank, Menge, Verbrauch;
		double Reichweite;

		System.out.println("Tankkapazität:");
		Tank = scan.nextDouble();
		System.out.println("Benzinanzeige:");
		Menge = scan.nextDouble();
		System.out.println("Meilen pro Gallone:");
		Verbrauch = scan.nextDouble();
		
		Reichweite = (0.01 * Menge) * Tank * Verbrauch; 
		
		if(Reichweite >= 200)
			System.out.println("Weiterfahren!");
		else 
			System.out.println("Tanken!");
	
	}
}	
