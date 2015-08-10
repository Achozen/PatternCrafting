package pl.achozen.patterns.bridgepattern;

//Refined abstraction
public class ConcreteRemote extends RemoteControl {

    public ConcreteRemote(TV televisor) {

	super(televisor);
    }

    private int currentChannel;

    public void nextChannel() {
	currentChannel++;
	setChannel(currentChannel);
    }

    public void prevChannel() {
	currentChannel--;
	setChannel(currentChannel);
    }
}