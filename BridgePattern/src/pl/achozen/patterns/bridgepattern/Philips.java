package pl.achozen.patterns.bridgepattern;

public class Philips implements TV {
    public void on() {
	// Philips specific on
	System.out.println(" Philips tv is ON");
    }

    public void off() {
	// Philips specific off
	System.out.println(" Philips tv is OFF");
    }

    public void tuneChannel(int channel) {
	// Philips specific tuneChannel
	System.out.println(" Philips channel is " + channel);
    }

}
