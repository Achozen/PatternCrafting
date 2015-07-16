package pl.achozen.patterns.factorypattern;

import java.util.ArrayList;
import java.util.Random;

import pl.achozen.patterns.factorypattern.robots.Robot;

public class World {

    public static final String FRANKY = "Franky";
    public static final String MANOWAR = "ManOWar";
    public static final String C16 = "C16";
    public static final String WEAKJOHN = "WeakJohn";

    ArrayList<Robot> robotPool = new ArrayList<Robot>();
    RobotFactory robotFactory = new RobotFactory();

    public void spawn10Robots() {

	Random rand = new Random();
	for (int i = 0; i < 10; i++) {

	    robotPool.add(robotFactory.assembleRobot(generateRandomRobotName(rand)));

	}

    }

    public void spawnRobot(String robotType, int gunPower, int health, int movingSpeed, int weigth) {

	Robot robot = robotFactory.assembleRobot(robotType).setWeigth(weigth)
		.setMovingPower(movingSpeed).setGunPower(gunPower).setHealth(health);
	robotPool.add(robot);

    }

    private String generateRandomRobotName(Random rand) {

	int randomNumber = rand.nextInt((4 - 1) + 1) + 1;

	if (randomNumber == 1)
	    return FRANKY;
	if (randomNumber == 2)
	    return MANOWAR;
	if (randomNumber == 3)
	    return C16;
	if (randomNumber == 4)
	    return WEAKJOHN;

	return null;

    }

    public ArrayList<Robot> getSpawnedRobots() {

	return robotPool;

    }

}
