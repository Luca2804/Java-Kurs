package JavaKurs30032020;

	class Box1
	{
		double breite;
		double hoehe;
		double laenge;
		
	Box1(double breitei, double hoehei, double laengei)
		{
		breite = breitei;
		hoehe = hoehei;
		laenge = laengei;
		}	
	
	Box1(Box alteBox)
		{
		
		}
	
	public double getLaenge()
	{
		return laenge;
	}
	
	public double getHoehe()
	{
		return hoehe;
	}
	
	public double getBreite()
	{
		return breite;
	}
	
	private double berechneOberflaechevorne()
	{
		return laenge * hoehe;
	}
	
	private double berechneOberflaecheoben()
	{
		return laenge * breite;
	}
	
	private double berechneOberflaecheseite()
	{
		return hoehe * breite;
	}
		
	double berechneOberflaeche()
	{
		return 2*berechneOberflaechevorne() +
			   2*berechneOberflaecheoben() +
			   2*berechneOberflaecheseite();	
	}

	double berechneVolumen()
	{
		return breite*laenge+hoehe;
	}
}

class BoxTester1
{
  public static void main ( String[] args )
  {
     Box1 box = new  Box1( 2.5, 5.0, 6.0 ) ;

     System.out.println( "Flaeche: "  + box.berechneOberflaeche( ) +
                         " Volumen: " + box. berechneVolumen( ) );

     System.out.println( "Laenge: " + box.getLaenge() +
                         " Hoehe: " + box.getHoehe() +
                         "Breite: " + box.getBreite() ;
  }
}