import java.util.Scanner;

class EffizienzvonDampfmaschinen
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		
		double tLuft, tDampf, Effizienz = 0.0;
		
		System.out.println("Geben sie die Lufttemeratur ein :");
		tLuft = scan.nextDouble();
		System.out.println("Geben sie die Dampftemperatur ein :");
		tDampf = scan.nextDouble();
		
		if (tDampf < 373)
			System.out.println("Die Dampftemperatur ist zu niedrig");
		else 
			Effizienz = 1 - tLuft / tDampf;
			System.out.println("Die Effizienz betraegt: " + Effizienz);
			
		
	}
}