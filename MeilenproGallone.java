import java.util.Scanner;

class MeilenproGallone
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		
		int AMeilen = 0, EMeilen, Gallone, Zaehler = 1;
		double MGallone = 0;
		
		
		while(Zaehler > 0) 
		{
		System.out.println("Anfangstand Meilen:");
		AMeilen = scan.nextInt();
			if (AMeilen <= -1)
			{
				System.out.println("bye");
				break;
			}
		System.out.println("Endstand Meilen:");
			EMeilen = scan.nextInt();
		System.out.println("Gallone");
			Gallone = scan.nextInt();
		MGallone = (EMeilen - AMeilen) / Gallone;
		
		System.out.println("Meilen pro Gallone: " + MGallone);
		
		}
		
	}
}