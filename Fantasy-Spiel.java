import java.util.Scanner;

class FanatsySpiel
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		
		int Staerke, Gesundheit, Glueck, Gesamt = 0;
		
		System.out.println("Staerke eingeben(1-10) ");
		Staerke = scan.nextInt();
		System.out.println("Gesundheit eingeben(1-10) ");
		Gesundheit = scan.nextInt();
		System.out.println("Glueck eingeben(1-10) ");
		Glueck = scan.nextInt();
		
		Gesamt = Staerke + Gesundheit + Glueck;
		
		if(Gesamt > 15)
		{	
	    System.out.println("Die Eingegeben Werte sind zu groß");
		Staerke = 5;
		Gesundheit = 5;
		Glueck = 5;
		System.out.println("Staerke: " + Staerke + "Gesundheit:" + Gesundheit + "Glueck: " + Glueck);
		}
		else
		{
		System.out.println("Staerke: " + Staerke + "G esundheit:" + Gesundheit + " Glueck: " + Glueck);
		}
	}
}