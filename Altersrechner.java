import java.util.Scanner;

class DeathValley 
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		
		int Geburtsjahr, Aktuell;
		
		System.out.println("Geburtsjahr");
		Geburtsjahr = scan.nextInt();
		System.out.println("Aktuelles Jahr"); 
		Aktuell = scan.nextInt();
		
		if(Aktuell > Geburtsjahr)
			System.out.println("Ihr alter ist: " + (Aktuell - Geburtsjahr));
		else 
			System.out.println("Ihr alter ist: " + (100 - Geburtsjahr + Aktuell));
		
		
	}
}	
