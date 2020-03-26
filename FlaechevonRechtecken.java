import java.util.Scanner;

class Berreicheaddieren 
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		
		int x1, x2 , y1 ,y2 , hoehe = 1, breite = 1,flaeche;
		
		while(hoehe > 0 ||breite > 0)
		{
			System.out.println("Erster Eckpunkt X:");
				x1 = scan.nextInt();
			System.out.println("Erster Eckpunkt Y:");
				y1 = scan.nextInt();
			System.out.println("Zweiter Eckpunkt X:");
				x2 = scan.nextInt();
			System.out.println("Zweiter Eckpunkt Y:");
				y2 = scan.nextInt();
				
			if(x1 > x2)
			{
				breite = x1 - x2;
			}
			else 
			{
				breite = x2 - x1;
			}
			if(y1 > y2)
			{
				hoehe = y1 - y2;
			}
			else 
			{
				hoehe = y2 - y1;
			}
			if(hoehe == 0 || breite == 0)
			{
				break;
			}
			flaeche = hoehe * breite;
			System.out.println("Breite: " + breite + " Hoehe: " + hoehe + " Flaeche: " + flaeche); 
		}
		
	}
}