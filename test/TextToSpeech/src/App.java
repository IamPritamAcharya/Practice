
import com.sun.speech.freetts.VoiceManager;
import com.sun.speech.freetts.Voice;

public class App {
    public static void main(String[] args) {
        System.setProperty("freetts.voices","com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        Voice voice = VoiceManager.getInstance().getVoice("kevin16");
        Voice  []voicelist = VoiceManager.getInstance().getVoices();
        for (int i = 0; i < voicelist.length; i++) {
            System.out.println("Voice: " + voicelist[i].getName());
        }
        if (voice != null) {
            voice.allocate();
            System.out.println("Voice rate: "+ voice.getRate());
            System.out.println("Voice pitch: "+ voice.getPitch());
            System.out.println("Voice volume: "+ voice.getVolume());

            boolean status = voice.speak("Hello this is text to speech tutorial");
            System.out.println("Staus: " + status);
            voice.deallocate();
        } else System.out.println("Error in getting voices");

    }
}
