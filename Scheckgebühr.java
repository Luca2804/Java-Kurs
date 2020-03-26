import java.util.Scanner;

class Scheckgebuehr
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		int Giro, Spar;
		System.out.println("Girokonto:");
		Giro = scan.nextInt();
		System.out.println("Sparkonto:");
		Spar = scan.nextInt();
		
		if(Giro >= 1000 || Spar >= 1500 )
		{
			System.out.println("Es wird keine Gebühr verlangt");
		}
		else
		{
			System.out.println("Es ist eine Gebühr von 0.15€ fällig");
		}
		
		
	}
}