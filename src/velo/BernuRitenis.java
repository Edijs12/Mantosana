package velo;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

public class BernuRitenis extends Velosipeds {
	
	private boolean paligRiteni, zvanins;

	public BernuRitenis(boolean paligRiteni, boolean zvanins, double ritenaD, int sedeklaPoz, double cena, String razotajs, String cels) {
		super(ritenaD, sedeklaPoz, cena, razotajs, cels);
		this.paligRiteni = paligRiteni;
		this.zvanins = zvanins;
	}
	
	public void darbsArPaligRit(boolean darbiba) {
		if(darbiba && !paligRiteni) {
			paligRiteni = true;
			JOptionPane.showMessageDialog(null, "Palīgriteņi pievienoti!",
					"Paziņojums", JOptionPane.INFORMATION_MESSAGE);
		}else if(!darbiba && paligRiteni) {
			paligRiteni = false;
					JOptionPane.showMessageDialog(null, "darbība nav iespējama!",
							"Paziņojums", JOptionPane.INFORMATION_MESSAGE);
		}
	}
		
		public void zvanit() throws MalformedURLException,
		UnsupportedAudioFileException, IOException, LineUnavailableException {
			if(irZvanins()) {
				File f = new File("skanais"+File.separator+"ring.wav");
				AudioInputStream ais =
				AudioSystem.getAudioInputStream(f.getAbsoluteFile());
				Clip clip = AudioSystem.getClip();
				clip.open(ais);
				clip.start();
				
			}else
				JOptionPane.showMessageDialog(null, 
						"Nav zvaniņš!", 
						"Paziņojums", 
						JOptionPane.INFORMATION_MESSAGE);
		}
		public boolean irZvanins() {
			return zvanins;
	}
		public boolean irPaligriteni() {
			return paligRiteni;
		}
		
		public String izvadit() {
			return "Riteņa ražotājs: "+noteiktRazotaju()
			+"\nRiteņa cena: "+noteiktCenu()+ "EUR\n"
			+"Riteņa lielums coilās: "+noteiktDiametru()
			+"\nSēdekļa pozīcijas: "+noteiktSedPoz()
			+"\nKustības ātrums: "+noteiktKustibasAtrumu()+"m/s\n"
			+"\nPaligriteņi: "+((irPaligriteni()) ? "Ir" : "Nav")+"\n"
			+"\nZvaniņš: "+((irZvanins()) ? "Ir" : "Nav")+"\n";

  }
}
