package velo;

import java.io.File;

import javax.swing.JOptionPane;

public class Metodes {
	static String izveletiesBildi(String mape) {
	String cels = "", nosaukumi = "";
	File bilzuMape = new File(mape);
	File[] failuSaraksts = bilzuMape.listFiles();
	
	
	if(failuSaraksts != null) {
		for(int i=0; i<failuSaraksts.length; i++) {
			nosaukumi += failuSaraksts[i].getName()+"\n";
		}
		
		cels = (String) JOptionPane.showInputDialog(null,
				"Izvēlies bildi:\n"+nosaukumi, "Izvēle",
				JOptionPane.INFORMATION_MESSAGE);
	}
		
	return mape+File.separator+cels;
  }
}
