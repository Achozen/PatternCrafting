package pl.achozen.patterns.abstractfactorypattern.concretefactories;

import pl.achozen.patterns.abstractfactorypattern.AbstractRobotFactory;
import pl.achozen.patterns.abstractfactorypattern.enums.RobotNames;
import pl.achozen.patterns.abstractfactorypattern.robots.concreterobots.FightingGretchen;
import pl.achozen.patterns.abstractfactorypattern.robots.concreterobots.FightingTom;
import pl.achozen.patterns.abstractfactorypattern.robots.concreterobots.FightingWally;
import pl.achozen.patterns.abstractfactorypattern.robots.interfaces.FightingRobots;
import pl.achozen.patterns.abstractfactorypattern.robots.interfaces.KitchenRobots;

//Factory of concrete robots
public class FightingRobotFactory extends AbstractRobotFactory {

    @Override
    public FightingRobots getFightingRobot(RobotNames.Fighting robotName) {
	switch (robotName) {
	case TOM:
	    return new FightingTom();
	case WALLY:
	    return new FightingWally();
	case GRETCHEN:
	    return new FightingGretchen();
	default:
	    break;
	}
	return null;
    }

    @Override
    public KitchenRobots getKitchenRobot(RobotNames.Kitchen robotName) {
	// TODO Auto-generated method stub
	return null;
    }

}
