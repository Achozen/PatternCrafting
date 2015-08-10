package pl.achozen.patterns.bridgepattern;

public class Sony implements TV {
    public void on() {

	System.out.println(" sony tv is ON");
    }

    public void off() {
	System.out.println(" sony tv is OFF");
    }

    public void tuneChannel(int channel) {// Sony specific tuneChannel}}

	System.out.println(" sony tv current channel is " + channel);
    }
}