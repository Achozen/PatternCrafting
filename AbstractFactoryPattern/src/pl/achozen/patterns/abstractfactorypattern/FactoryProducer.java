package pl.achozen.patterns.abstractfactorypattern;

import pl.achozen.patterns.abstractfactorypattern.concretefactories.FightingRobotFactory;
import pl.achozen.patterns.abstractfactorypattern.concretefactories.KitchenRobotFactory;
import pl.achozen.patterns.abstractfactorypattern.enums.RobotTypes;

//Factory of factories
public class FactoryProducer {

    public static AbstractRobotFactory getFactory(RobotTypes choice) {
	switch (choice) {
	case FIGHTING:
	    return new FightingRobotFactory();
	case KITCHEN:
	    return new KitchenRobotFactory();
	default:
	    break;
	}
	return null;
    }
}
