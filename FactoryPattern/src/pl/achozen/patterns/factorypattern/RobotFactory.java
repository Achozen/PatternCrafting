package pl.achozen.patterns.factorypattern;

import pl.achozen.patterns.factorypattern.robots.Robot;
import pl.achozen.patterns.factorypattern.robots.concreterobots.BlitzCrank;
import pl.achozen.patterns.factorypattern.robots.concreterobots.C16;
import pl.achozen.patterns.factorypattern.robots.concreterobots.Franky;
import pl.achozen.patterns.factorypattern.robots.concreterobots.ManOWar;
import pl.achozen.patterns.factorypattern.robots.concreterobots.WeakJohn;

public class RobotFactory {

    public Robot assembleRobot(String robotName){
	
	switch (robotName) {
	  case "C16" :
	    return new C16().setName(robotName);
	  case "Franky":
	    return new Franky().setName(robotName);
	  case "ManOWar" :
	    return new ManOWar().setName(robotName);
	  case "WeakJohn":
	    return new WeakJohn().setName(robotName);
	  case "BlitzCrank":
	    return new BlitzCrank().setName(robotName);
	  default:
	    return null;
	}
	
    }
}
