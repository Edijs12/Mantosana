package velo;

public class kalnuRitenis extends Velosipeds {
 //atributi
	private int iestatitAtrumu;
	private boolean atstarpes;
	
		public kalnuRitenis(double ritenaD, int sedeklaPoz, double cena, 
			String razotajs, String cels) {
		super(ritenaD, sedeklaPoz, cena, razotajs, cels);
		this.iestatitAtrumu = iestatitAtrumu;
		this.atstarpes = atstarpes;
		
	}
		
		//Metodes
		public int noteiktAtrumu() {
			return iestatitAtrumu;
		}
		
		public void parslegtAtrumu(int atr) {
			iestatitAtrumu = atr;
		}
}
		