package pl.achozen.patterns.abstractfactorypattern;

import java.util.ArrayList;

import pl.achozen.patterns.abstractfactorypattern.enums.RobotNames;
import pl.achozen.patterns.abstractfactorypattern.enums.RobotTypes;
import pl.achozen.patterns.abstractfactorypattern.robots.interfaces.FightingRobots;
import pl.achozen.patterns.abstractfactorypattern.robots.interfaces.KitchenRobots;

public class DemoOfAbstractFactoryPattern {

    public static void main(String[] args) {

	@SuppressWarnings("unchecked")
	ArrayList<FightingRobots> fightingRobsArray = (ArrayList<FightingRobots>) generateAllRobotsOfConcreteTypeIntoArray(RobotTypes.FIGHTING);
	@SuppressWarnings("unchecked")
	ArrayList<KitchenRobots> kitchenRobsArray = (ArrayList<KitchenRobots>) generateAllRobotsOfConcreteTypeIntoArray(RobotTypes.KITCHEN);

	// executing fight method for all fighting robots
	for (FightingRobots robot : fightingRobsArray) {

	    robot.fight();

	}
	// executing fight method for all kitchen robots
	for (KitchenRobots robot : kitchenRobsArray) {

	    robot.work();

	}

    }

    static ArrayList<?> generateAllRobotsOfConcreteTypeIntoArray(RobotTypes type) {
	AbstractRobotFactory factoryOfFactories = FactoryProducer.getFactory(type);

	if (type == RobotTypes.FIGHTING) {
	    ArrayList<FightingRobots> concreteFightingRobotsArray = new ArrayList<>();
	    for (RobotNames.Fighting robot : RobotNames.Fighting.values()) {
		FightingRobots fightingRobot = factoryOfFactories.getFightingRobot(robot);

		concreteFightingRobotsArray.add(fightingRobot);

	    }
	    return concreteFightingRobotsArray;

	} else if (type == RobotTypes.KITCHEN) {
	    ArrayList<KitchenRobots> concreteKitchenRobotsArray = new ArrayList<>();
	    for (RobotNames.Kitchen robot : RobotNames.Kitchen.values()) {
		KitchenRobots kitchenRobot = factoryOfFactories.getKitchenRobot(robot);

		concreteKitchenRobotsArray.add(kitchenRobot);
	    }
	    return concreteKitchenRobotsArray;
	}
	return null;
    }

}
