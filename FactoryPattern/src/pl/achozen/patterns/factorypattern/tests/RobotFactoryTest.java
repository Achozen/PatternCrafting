package pl.achozen.patterns.factorypattern.tests;

import static pl.achozen.patterns.factorypattern.World.FRANKY;
import junit.framework.TestCase;

import org.junit.Test;

import pl.achozen.patterns.factorypattern.RobotFactory;
import pl.achozen.patterns.factorypattern.robots.Robot;

public class RobotFactoryTest extends TestCase {

    RobotFactory factory;

    protected void setUp() throws Exception {
	factory = new RobotFactory();
    }

    @Test
    public void testShouldCreateARobot() {
	Robot rob = factory.assembleRobot(FRANKY);
	assertNotNull(rob);

    }

    @Test
    public void testRobotShouldHaveCorrectProperties() {
	Robot rob = factory.assembleRobot(FRANKY).setHealth(50).setGunPower(100)
		.setMovingPower(150).setWeigth(200);
	assertTrue(rob.getHealth() == 50 && rob.getGunPower() == 100 && rob.getMovingPower() == 150
		&& rob.getWeigth() == 200);

    }

}
