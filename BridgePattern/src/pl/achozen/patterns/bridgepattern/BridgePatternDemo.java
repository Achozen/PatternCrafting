package pl.achozen.patterns.bridgepattern;

public class BridgePatternDemo {

    public static void main(String[] args) {
	Sony sonyTv = new Sony();
	ConcreteRemote sonyController = new ConcreteRemote(sonyTv);
	sonyController.nextChannel();
	sonyController.prevChannel();
	sonyController.prevChannel();
	sonyController.off();

	Philips pphilipsTv = new Philips();
	ConcreteRemote philipsController = new ConcreteRemote(pphilipsTv);
	philipsController.nextChannel();
	philipsController.prevChannel();
	philipsController.prevChannel();
	philipsController.off();

    }

}
