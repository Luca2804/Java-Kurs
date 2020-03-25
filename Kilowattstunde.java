import java.util.Scanner;

class Kilowattstunde
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		double Kosten;
		double Kilowattstunden;
		double Jahreskosten;
		
		System.out.println("Kosten in Cent:" );
		Kosten = scan.nextDouble();
		System.out.println("Kilowattstunden im Jahr:");
		Kilowattstunden = scan.nextDouble();
		Jahreskosten = Kilowattstunden * (Kosten / 100 );
		System.out.println("Jahreskosten: " + Jahreskosten);
		
		
	}
}	
