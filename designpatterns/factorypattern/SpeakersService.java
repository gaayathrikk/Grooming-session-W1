package designpatterns.factorypattern;

import designpatterns.factorypattern.Speakers.Speakers;

public class SpeakersService {
    public static void main(String[] args) {
        SpeakersFactory speakerFactory = new SpeakersFactory();
        Speakers speakers = speakerFactory.selectSpeakers("Bluetooth");
        speakers.switchingSpeaker();
    }
}
