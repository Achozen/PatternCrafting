package pl.achozen.patterns.adapterpattern.robots;

import pl.achozen.patterns.adapterpattern.interfaces.Fightable;

public class FightingRobot implements Fightable {

    @Override
    public void fight() {
	// TODO Auto-generated method stub
	System.out.println("Yaaar im fighting !!!");

    }

    void warriorName() {

	System.out.println("My name is WarriorMan");

    }

}
