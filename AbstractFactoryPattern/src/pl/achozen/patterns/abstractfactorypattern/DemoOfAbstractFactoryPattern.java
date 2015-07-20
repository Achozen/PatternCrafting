package pl.achozen.patterns.abstractfactorypattern;

import java.util.ArrayList;

import pl.achozen.patterns.abstractfactorypattern.enums.RobotNames;
import pl.achozen.patterns.abstractfactorypattern.enums.RobotTypes;
import pl.achozen.patterns.abstractfactorypattern.robots.interfaces.FightingRobots;

public class DemoOfAbstractFactoryPattern {

    public static void main(String[] args) {

	// Preparation of list of robots that implements FightingRobots
	// interface
	ArrayList<FightingRobots> fightingRobsArray = new ArrayList<FightingRobots>();

	// Creation of factory of fighting robots
	AbstractRobotFactory factoryOfFactories = FactoryProducer.getFactory(RobotTypes.FIGHTING);

	// obtaining all available robots from fighting robot factory and saving
	// them into list
	for (RobotNames.Fighting robot : RobotNames.Fighting.values()) {
	    FightingRobots fightingRobot = factoryOfFactories.getFightingRobot(robot);

	    fightingRobsArray.add(fightingRobot);

	}

	// executing fight method for all fighting robots
	for (FightingRobots robot : fightingRobsArray) {

	    robot.fight();

	}

    }
}
