package JavaKurs30032020;

class Marmelade
{
  // Instanzvariablen
  private String inhalt;   // Art der Frucht im Glas
  private String datum;   // Datum des Abfüllens
  private int menge;       // Menge der Marmelade im Glas
  boolean bglas1 = false ;
  boolean bglas2 = false ;
  boolean bglas3 = false;

  // Konstruktor
  public Marmelade( String inhalt, String datum, int menge )
  {
    this . inhalt = inhalt;
    this . datum  = datum;
    this . menge  = menge;
  }

  // Methoden
  public boolean istLeer()
  {
    return ( menge == 0 );
  }
  
  public void pruefung()
  {
	  if (this.inhalt == "stachelbeer" && menge <= 2) {
		  bglas1 = true;
	  }
	  else if(this.inhalt == "erdbeer" && menge <= 2) {
		  bglas2= true;
	  }
	  else {
		  bglas3 = true;
	  }
  }

  public void ausgeben()
  {
    System.out.println ( inhalt + "   " +  datum + "   " +  menge + " Unzen." );
  }

  public void auftragen ( int unzen)
  {
    if ( !istLeer() )
    {
      if ( unzen <= menge )
      {
        System.out.println("Auftragen von " + unzen + " Unzen "
            + inhalt );
        menge = menge - unzen;
      }
      else
      {
        System.out.println("Auftragen von  " + menge + " Unzen "
            + inhalt );
        menge =  0;
      }
     }
     else
       System.out.println("Keine Marmelade im Glas!");
  }

}

class Vorratskammer
{
  // Instanzvariablen
  private Marmelade  glas1;
  private Marmelade  glas2;
  private Marmelade  glas3;
  private Marmelade  glasAusgewaehlt;

  // Konstruktor
  public Vorratskammer( Marmelade glas1, Marmelade glas2, Marmelade glas3 )
  {
    this . glas1    = glas1;
    this . glas2    = glas2;
    this . glas3    = glas3;
    glasAusgewaehlt = null;
  }

  // Methoden
  public void ausgeben()
  {
    System.out.print("1: "); glas1 . ausgeben();
    System.out.print("2: "); glas2 . ausgeben();
    System.out.print("3: "); glas3 . ausgeben();
  }

  // wir setzen voraus, dass der Anwender eine richtige Auswahl trifft, 1, 2, oder 3
  public void auswaehlen( int glasNummer )
  {
    if ( glasNummer == 1 )
      glasAusgewaehlt =  glas1;

    else if ( glasNummer == 2 )
      glasAusgewaehlt = glas2;

    else
      glasAusgewaehlt = glas3;
  }

  // Auftragen der ausgewählten Marmelade
  public void auftragen( int unzen  )
  {
    glasAusgewaehlt . auftragen( unzen  );
  }


public void ersetzen(Marmelade Sorte, int platz) {
	if(platz == 1) {
		glas1 = Sorte;
	}
	else if(platz == 3) {
		glas2 = Sorte;
	}
	else {
		glas3 = Sorte;
	}
}


	public static void main(String[] args) {
		Marmelade stachelbeer = new Marmelade("Stachelbeer", "04.07.09", 12);
		Marmelade erdbeer = new Marmelade("Erdbeer", "31.09.10", 8);
		Marmelade aprikosen = new Marmelade("Aprikosen", "31.10.10", 16);

		Vorratskammer vorrat = new Vorratskammer(stachelbeer, erdbeer, aprikosen);
		vorrat.ausgeben();

		Marmelade kirsch = new Marmelade("Kirsch", "01.07.09", 11);

		vorrat.ersetzen(kirsch, 3);
		vorrat.ausgeben();
		}
	}

