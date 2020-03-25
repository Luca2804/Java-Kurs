import java.util.Scanner;

class Fleisch
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		double PreisA, PreisB;
		int ProzentA, ProzentB;
		double EndpreisA, EndpreisB;
		
		System.out.println("Preis pro Pfund Packung A:");
		PreisA = scan.nextDouble();
		System.out.println("Prozent mageres Fleisch Packung A:");
		ProzentA = scan.nextInt();
		System.out.println("Preis pro Pfund Packung B:");
		PreisB = scan.nextDouble();
		System.out.println("Prozent mageres Fleisch Packung B:");
		ProzentB = scan.nextInt();
		
		EndpreisA = PreisA / (double)ProzentA * 100;
		EndpreisB = PreisB / (double)ProzentB * 100;
		
		System.out.println("Packung A kostet pro Pfund mageres Fleisch :" + EndpreisA);
		System.out.println("Packung B kostet pro Pfund mageres Fleisch :" + EndpreisB);
		if(EndpreisA < EndpreisB)
			System.out.println("Packung A ist preiswerter");
		else
			System.out.println("Packung B ist preiswerter");
	}
}