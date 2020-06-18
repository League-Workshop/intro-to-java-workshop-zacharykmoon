package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
			speak("spell mandlebrot");
			//JOptionPane.showMessageDialog(null, "spell mandlebrot" );
		// 2. Catch the user's answer in a String
			String answer = JOptionPane.showInputDialog("");

		// 3. If the user spelled the word correctly, speak "correct"
			if (answer == "mandlebrot") {
				speak("correct");
			}
			else {
				// 4. Otherwise say "wrong"
				speak("wrong");
			}
		

		// 5. repeat the process for other words
			speak("spell imperial");
			//JOptionPane.showMessageDialog(null, "spell mandlebrot" );
		// 2. Catch the user's answer in a String
			String word = JOptionPane.showInputDialog("spell the word");

		// 3. If the user spelled the word correctly, speak "correct"
			if (word == "imperial") {
				speak("correct");
			}
			else {
				// 4. Otherwise say "wrong"
				speak("wrong");
			}
	}

	static void speak(String words) {
		
		if (System.getProperty("os.name").contains("Windows")) {
			String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
					+ words + "');\"";
			try {
				Runtime.getRuntime().exec(cmd).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				Runtime.getRuntime().exec("say " + words).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}


