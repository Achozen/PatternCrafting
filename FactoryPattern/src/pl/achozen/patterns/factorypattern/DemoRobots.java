package pl.achozen.patterns.factorypattern;

import java.util.ArrayList;

import pl.achozen.patterns.factorypattern.robots.Robot;

public class DemoRobots {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	World world = new World();

	world.spawnRobot("Franky", 10, 100, 10, 10);
	world.spawnRobot("ManOWar", 20, 100, 21, 43);

	ArrayList<Robot> robots = world.getSpawnedRobots();
	introduction(robots);

	DuelArena arena = new DuelArena();
	arena.startTheBattle(robots.get(0), robots.get(1));

	introduction(robots);

	// world.spawn10Robots();

    }

    public static void introduction(ArrayList<Robot> robots) {

	for (Robot robot : robots) {
	    System.out.println("\nHello ! my name is " + robot.getName() + "\n" + "Attributs :\n"
		    + "Gun Power: " + robot.getGunPower() + "\nHealth: " + robot.getHealth()
		    + "\nSpeed: " + robot.getMovingPower() + "\nWeight: " + robot.getWeigth());
	}

    }

    // System.out.println(world.getSpawnedRobots().toString());

}
