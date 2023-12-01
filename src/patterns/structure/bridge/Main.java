package patterns.structure.bridge;

import patterns.structure.bridge.plataforms.Facebook;
import patterns.structure.bridge.plataforms.IPlatform;
import patterns.structure.bridge.plataforms.TwitchTV;
import patterns.structure.bridge.plataforms.YouTube;
import patterns.structure.bridge.transmissions.AdvancedLive;

public class Main {
    public static void main(String[] args) {
        startLive(new YouTube());
        startLive(new TwitchTV());
        startLive(new Facebook());
    }

    public static void startLive(IPlatform platform){
        System.out.println("Transmissão avançada...aguarde");
        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broadcasting();
        advancedLive.comments();
        advancedLive.subtitles();
        advancedLive.result();
    }
}
