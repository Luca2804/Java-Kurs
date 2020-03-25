import java.util.Scanner;

class Kilowattstunde
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		double Sekunden; 
		double Entfernung; 
		System.out.println("Geben sie die Anzahl der Sekunden ein:");
		Sekunden = scan.nextDouble();
		Entfernung = 0.5 * 9.81  * Math.pow(Sekunden,2);		
		System.out.println("Die Entfernung betraegt :" + Entfernung);
		
		
	}
}	
