class Niederschlag
{
	public static void main (String[] args )
	{
		int April = 12;
		int Mai = 14; 
		int Juni = 8;
		double Durchschnitt = 0.0;
		
		Durchschnitt = ((double)April + (double)Mai + (double)Juni )/ 3;
		
		System.out.println("Niederschlag im April:"  + April);
		System.out.println("Niederschlag im Mai  :"  + Mai);
		System.out.println("Niederschlag im Juni :"  + Juni);
		System.out.println("Durchschnitt:"  + Durchschnitt);
	}
}
