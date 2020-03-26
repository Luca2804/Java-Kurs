import java.util.Scanner;

class Wettbewerb
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		int Gewicht; 
		
		System.out.println("Geben sie ein Gewicht ein"); Gewicht = scan.nextInt();	
	

		if (Gewicht >=235 && Gewicht <= 265)
		{
			System.out.println("Zugelassen"); 
		}
		else 
		{
			System.out.println("Nicht Zugelassen");
		}
			
		
	}
}