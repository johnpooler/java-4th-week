package Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.qa.hashmapping.Morse;

public class MorseTest {
	
	Morse mt = new Morse();
	@Test
	public void morseTranslatorTest() {
		assertEquals("YOU CAN NOW LEAVE", mt.morseTranslator("-.-- --- ..- / -.-. .- -. / -. --- .-- / .-.. . .- ...- ."));
		assertEquals("YOU ARE A BEAST", mt.morseTranslator("-.-- --- ..- / .- .-. . / .- / -... . .- ... -"));
		assertEquals("YOU ARE A BEAST", mt.morseTranslator(".--- --- .... .- -. -. . ...     .-.. --- ...- . ...     -... .- -.-- . .-. -.     -- ..- -. .. -.-. ...."));
	

}
