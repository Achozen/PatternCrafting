package pl.achozen.patterns.abstractfactorypattern;

import pl.achozen.patterns.abstractfactorypattern.enums.RobotNames;
import pl.achozen.patterns.abstractfactorypattern.robots.interfaces.FightingRobots;
import pl.achozen.patterns.abstractfactorypattern.robots.interfaces.KitchenRobots;

public abstract class AbstractRobotFactory {

    public abstract FightingRobots getFightingRobot(RobotNames.Fighting robotName);

    public abstract KitchenRobots getKitchenRobot(RobotNames.Kitchen robotName);

}
