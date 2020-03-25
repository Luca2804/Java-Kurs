import java.util.Scanner;

class HarmonischeMittel
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		
		int x;
		int y; 
		double Durchschnitt; 
		double HarmonischeMittel; 
		
		System.out.println("Geben sie einen Wert für x ein: ");
		x = scan.nextInt();
		System.out.println("Geben sie einen Wert für y ein: ");
		y = scan.nextInt();
		
		Durchschnitt = (x + y ) / 2;
		HarmonischeMittel = 2 / (1/(double)x  + 1/(double)y);
		System.out.println("Arithmetisches Mittel :"+ Durchschnitt);
		System.out.println("Harmonisches Mittel :" + HarmonischeMittel);
		
	}
}