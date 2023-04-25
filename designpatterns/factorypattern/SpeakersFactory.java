package designpatterns.factorypattern;

import designpatterns.factorypattern.Speakers.Bluetooth;
import designpatterns.factorypattern.Speakers.Soundbars;
import designpatterns.factorypattern.Speakers.Speakers;
import designpatterns.factorypattern.Speakers.Subwoofers;

public class SpeakersFactory {
	public Speakers selectSpeakers(String type)
	{
		if (type == null || type.isEmpty())
			return null;
		switch (type) {
		case "Bluetooth":
			return new Bluetooth();
		case "Soundbars":
			return new Soundbars();
		case "Subwoofers":
			return new Subwoofers();
		default:
			throw new IllegalArgumentException("Unknown type "+type);
		}
	}
}
