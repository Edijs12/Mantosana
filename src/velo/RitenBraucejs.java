package velo;

import java.io.IOException;
import java.nio.charset.MalformedInputException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class RitenBraucejs {

	public static void main(String[] args) throws MalformedInputException,
	UnsupportedAudioFileException, IOException, LineUnavailableException {
		BernuRitenis test = new BernuRitenis(true ,true,
				20, 3 ,230, "Pepco", null);
		while(true) {
			test.zvanit();
		}
		

	}

}