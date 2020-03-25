import java.util.Scanner;

class InternetDelikatessen
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		double Produkt; 
		char Express;
		double Zuschlag; 
		
		System.out.println("Wert der Bestellung:");
		Produkt = scan.nextDouble();
		System.out.println("Expressversand 0 nein , 1 Ja:");
		Express = scan.nextChar();
		
		if(Express.equals ("1"))
		{
		Zuschlag = Zuschlag + 5;
			if(Produkt >= 10)
			{
				Zuschlag = Zuschlag + 3;
			}
			else 
			{
				Zuschlag = Zuschlag + 2;
			}
		}
		else if(Produkt >= 10)
			{
				Zuschlag = Zuschlag + 3;
			}
			else 
			{
				Zuschlag = Zuschlag + 2;
			}
		System.out.println("Produkt :" + Produkt);
		System.out.println("Versand :" + Zuschlag);
		System.out.println("Gesamt :" + (Zuschlag + Produkt));
		
		
	}
}