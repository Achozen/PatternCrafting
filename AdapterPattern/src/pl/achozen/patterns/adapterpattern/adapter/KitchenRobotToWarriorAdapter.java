package pl.achozen.patterns.adapterpattern.adapter;

import pl.achozen.patterns.adapterpattern.interfaces.Fightable;
import pl.achozen.patterns.adapterpattern.robots.KitchenRobot;

public class KitchenRobotToWarriorAdapter implements Fightable {
    KitchenRobot robot;

    public KitchenRobotToWarriorAdapter(KitchenRobot robot) {

	this.robot = robot;

    }

    @Override
    public void fight() {
	// TODO Auto-generated method stub
	robot.blend();

    }

}
