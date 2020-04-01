package JavaKurs30032020;

	class Box2
	{
		double breite;
		double hoehe;
		double laenge;
		
	Box2(double breite, double hoehe, double laenge)
		{
		this.breite = breite;
		this.hoehe = hoehe;
		this.laenge = laenge;
		}	
	
	public Box2 groessereBox()
	{
		return new Box2(1.25 * this.breite, 1.25 * this.hoehe, 1.25 * this.laenge );
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

class BoxTester2
{
  public static void main ( String[] args )
  {
     Box2 box = new  Box2( 2.5, 5.0, 6.0 ) ;

     						box = box.groessereBox();
     System.out.println( "Flaeche: "  + box.berechneOberflaeche( ) +
                         " Volumen: " + box. berechneVolumen());
                                box = box.groessereBox();
     					 

     System.out.println( "Laenge: " + box.laenge +
                         " Hoehe: " + box. hoehe +
                         "Breite: " + box.breite )  ;
  }
}
