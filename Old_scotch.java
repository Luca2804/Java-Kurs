package JavaKurs30032020;

class Artikel{
	String artikelNr = new String();
	String bezeichnung = new String(); 
	double einkaufspreis;
	double verkaufspreis;
	int lagerzeit;
	final double Handelsspanne = 0.6;
	final double mwst = 0.19;
	
Artikel(String aritkelNr, String bezeichnung, double einkaufspreis, int lagerzeit){
super();
this.artikelNr = aritkelNr;
this.bezeichnung = bezeichnung;
this.einkaufspreis = einkaufspreis;
this.lagerzeit = lagerzeit;
}
	
public void ausgeben() {
	System.out.println(artikelNr + bezeichnung + einkaufspreis+ " " + berechneVerkaufspreis() + " " + lagerzeit);
}
	
public double berechneVerkaufspreis() {
	verkaufspreis = (einkaufspreis * (1 + Handelsspanne)) * (1 + mwst);
	return verkaufspreis;
}
	
public double getEinkauf()
{
	return einkaufspreis;
}


class Sonderposten extends Artikel {
	private double rabatt;

	public Sonderposten(String aritkelNr, String bezeichnung, double einkaufspreis, int lagerzeit) {
		super(aritkelNr, bezeichnung, einkaufspreis, lagerzeit);
		if (lagerzeit > 12) {
			this.rabatt = 0.30;
		} else {
			this.rabatt = 0.10;
		}
	}

	public void ausgeben() {
		System.out.println("Sonderposten: ");
		super.ausgeben();
		System.out.println(
				"(VK <alt>: " + berechneVerkaufspreis() / (100 - (rabatt*100)) * 100 +  + rabatt * 100 + "%)");
	}

	public double berechneVerkaufspreis() {
		double verkaufspreis = (getEinkauf() * (1 + Handelsspanne)) * (1 + mwst) * (1-rabatt);

		return verkaufspreis;
	}
}
	
public static void main(String[] args) {

	Artikel eins = new Artikel("SC123-F", "\"DUFFY MALT WHISKEY\"", 10.0 , 3);
	eins.ausgeben();
	Sonderposten zwei = new Sonderposten("SC347-A", "\"GLEN MORANGIE MALT WHISKEY\"", 49.0 ,15);
	zwei.ausgeben();
}
}
