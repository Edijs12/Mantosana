package velo;

import java.awt.Image;
import java.net.URL;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Velosipeds {
	//atribūti
	private int sedeklaPoz;
	private double ritenaD, atrumsMS, cena;
	private String razotajs;
	ImageIcon bilde;
	Random rand = new Random();
	
	
	//konstruktors
	public Velosipeds(double ritenaD, int sedeklaPoz,
			double cena, String razotajs, String cels) {
		this.ritenaD = ritenaD;
		this.sedeklaPoz = sedeklaPoz;
		atrumsMS = kustibasAtrums();
		this.cena = cena;
		this.razotajs = razotajs;
		bilde = ieliktBildi(cels);
	}
	public double kustibasAtrums() {
		double celsM = rand.nextDouble()*(1000 - 1)+1;
		double laiksS = rand.nextDouble()*(60-10) + 10;
		return Math.round(celsM/laiksS); // v = s/t
	}
	
	public ImageIcon ieliktBildi(String cels) {
		if(!cels.endsWith(".png"))
			cels += ".png";
		
		URL resurss = getClass().getResource("/atteli/"+cels);
		if(resurss != null)
		return new ImageIcon(new ImageIcon(resurss).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
		
		
		else {
			JOptionPane.showMessageDialog(null,  "Nevar atrast bildi: "+cels, "Bridinajums",
					JOptionPane.WARNING_MESSAGE);
			return null;
		}
	}
	
	public ImageIcon apskatitBildi() {
		return bilde;
	}
	
	public double noteiktDiametru() {
		return ritenaD;
	}
	
	public int noteiktSedPoz() {
		return sedeklaPoz;
	}
	
	public String noteiktRazotaju() {
		return razotajs;
	}
	
	public double noteiktCenu() {
		return cena;
	}
	
	public double noteiktKustibasAtrumu() {
		return atrumsMS;
	}
	
	public String izvadit() {
		return "Riteņa ražotājs: "+noteiktRazotaju()
				+"\nRiteņa cena: "+noteiktCenu()+ "EUR\n"
				+"Riteņa lielums coilās: "+noteiktDiametru()
				+"\nSēdekļa pozīcijas: "+noteiktSedPoz()
				+"\nKustības ātrums: "+noteiktKustibasAtrumu()+"m/s\n";
	}
	
	public void reguletSedekli(int poz) {
		sedeklaPoz = poz;
	}
	
	public void mities (int minienuSk) {
		atrumsMS += (0.15 * minienuSk);
	}
	
	public void bremzet (int berze) {
		if(noteiktKustibasAtrumu() > 0) {
			atrumsMS -= (noteiktKustibasAtrumu() * 0.55) * berze;
		}
		if(noteiktKustibasAtrumu() < 0)
			atrumsMS = 0;
	}
	
	
}
