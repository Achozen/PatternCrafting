package pl.achozen.patterns.factorypattern;

import java.util.Random;

import pl.achozen.patterns.factorypattern.robots.Robot;

public class DuelArena {

    public void startTheBattle(Robot rob1, Robot rob2) {

	Random rand = new Random();
	String winner = "";
	int round = 0;

	while (rob1.getHealth() > 0 && rob2.getHealth() > 0) {
	    round++;
	    System.out.println("\nRunda nr " + round + " !!!");
	    if (rob1.getAgility() * rand.nextInt() > rob2.getAgility() * rand.nextInt()) {
		rob2.setHealth(rob2.getHealth() - rob1.getGunPower());
		System.out.println(rob1.getName() + " atakuje za " + rob1.getGunPower());
	    } else {
		rob1.setHealth(rob1.getHealth() - rob2.getGunPower());
		System.out.println(rob2.getName() + " atakuje za " + rob2.getGunPower());
	    }

	}
	if (rob1.getHealth() > rob2.getHealth())
	    winner = rob1.getName();
	else
	    winner = rob2.getName();

	System.out.println("Zwyciezyl " + winner);
    }

}
