package velo;

public class kalnuRitenis extends Velosipeds {
 //atributi
	private int iestatitAtrumu;
	private boolean atsperes;
	
		public kalnuRitenis(int iestatitAtrumu, boolean atsperes, double ritenaD, int sedeklaPoz, double cena, 
			String razotajs, String cels) {
		super(ritenaD, sedeklaPoz, cena, razotajs, cels);
		this.iestatitAtrumu = iestatitAtrumu;
		this.atsperes = atsperes;
		
	}
		
		//Metodes
		public int noteiktAtrumu() {
			return iestatitAtrumu;
		}
		
		public void parslegtAtrumu(int atr) {
			iestatitAtrumu = atr;
		}
		
		public String izvadit() {
			return "Riteņa ražotājs: "+noteiktRazotaju()
			+"\nRiteņa cena: "+noteiktCenu()+ "EUR\n"
			+"Riteņa lielums coilās: "+noteiktDiametru()
			+"\nSēdekļa pozīcijas: "+noteiktSedPoz()
			+"\nKustības ātrums: "+noteiktKustibasAtrumu()+"m/s\n"
			+"\nIestatītais ātrums: "+noteiktAtrumu()
			+"\nPapildus amortizācija: "+((atsperes) ? "Ir" : "Nav")+"\n";
			
			

		}
}
		