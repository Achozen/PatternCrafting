package pl.achozen.patterns.factorypattern.robots.concreterobots;

import pl.achozen.patterns.factorypattern.robots.Robot;
import pl.achozen.patterns.factorypattern.robots.interfaces.Moveable;


//Weak John can walk, he's to weak to handle a weapon... He's basicly cannon fodder
public class WeakJohn extends Robot implements Moveable {

    @Override
    public void move(int distance) {
	// TODO Auto-generated method stub
	
	
	
    }
       
}
