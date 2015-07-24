package pl.achozen.patterns.adapterpattern;

import java.util.ArrayList;

import pl.achozen.patterns.adapterpattern.adapter.KitchenRobotToWarriorAdapter;
import pl.achozen.patterns.adapterpattern.interfaces.Fightable;
import pl.achozen.patterns.adapterpattern.robots.FightingRobot;
import pl.achozen.patterns.adapterpattern.robots.KitchenRobot;

public class AdapterPatternDemo {
    public static void main(String[] args) {

	// Adapter pattern is an approach that helps us to make two different
	// interfaces
	// compatible with each other.
	// By creating an adapter that implements interface Fightable
	// we're able to operate on incompatible object of KitchenRobot class
	// in the same way as we operate on FightingRobot object

	ArrayList<Fightable> fightTable = new ArrayList<Fightable>();

	FightingRobot fightingRobot = new FightingRobot();

	KitchenRobot kitchenRobot = new KitchenRobot();

	fightTable.add(fightingRobot);
	// fightTable.add(kitchenRobot); -> this would not work but thanks to
	// adapter we can manage with that.

	Fightable adaptedForFightKitchenRobot = new KitchenRobotToWarriorAdapter(kitchenRobot);
	fightTable.add(adaptedForFightKitchenRobot);

	// now we can check the adapted functionality

	for (Fightable tab : fightTable) {

	    tab.fight();
	}
    }

}
