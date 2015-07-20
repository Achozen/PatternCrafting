package pl.achozen.patterns.abstractfactorypattern.robots.concreterobots;

import pl.achozen.patterns.abstractfactorypattern.robots.interfaces.FightingRobots;

public class FightingTom implements FightingRobots {

    @Override
    public void fight() {
	// TODO Auto-generated method stub
	System.out.print("Fighting Tom is fighting\n");
    }

}
