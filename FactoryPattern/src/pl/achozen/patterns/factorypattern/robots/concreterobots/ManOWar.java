package pl.achozen.patterns.factorypattern.robots.concreterobots;

import pl.achozen.patterns.factorypattern.robots.Robot;
import pl.achozen.patterns.factorypattern.robots.interfaces.Fireable;
import pl.achozen.patterns.factorypattern.robots.interfaces.Moveable;

public class ManOWar extends Robot implements Fireable,Moveable {

    @Override
    public void fire() {

	System.out.println("Damage: ");
    }

    @Override
    public void move(int distance) {
	// TODO Auto-generated method stub
	
    }

}
