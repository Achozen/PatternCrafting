package pl.achozen.patterns.abstractfactorypattern.concretefactories;

import pl.achozen.patterns.abstractfactorypattern.AbstractRobotFactory;
import pl.achozen.patterns.abstractfactorypattern.enums.RobotNames;
import pl.achozen.patterns.abstractfactorypattern.robots.concreterobots.KitchenJack;
import pl.achozen.patterns.abstractfactorypattern.robots.concreterobots.KitchenMolly;
import pl.achozen.patterns.abstractfactorypattern.robots.concreterobots.KitchenSuzy;
import pl.achozen.patterns.abstractfactorypattern.robots.interfaces.FightingRobots;
import pl.achozen.patterns.abstractfactorypattern.robots.interfaces.KitchenRobots;

// Factory of concrete robots
public class KitchenRobotFactory extends AbstractRobotFactory {

    @Override
    public FightingRobots getFightingRobot(RobotNames.Fighting robotName) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public KitchenRobots getKitchenRobot(RobotNames.Kitchen robotName) {
	switch (robotName) {
	case JACK:
	    return new KitchenJack();
	case MOLLY:
	    return new KitchenMolly();
	case SUZY:
	    return new KitchenSuzy();
	default:
	    break;
	}
	return null;
    }

}
