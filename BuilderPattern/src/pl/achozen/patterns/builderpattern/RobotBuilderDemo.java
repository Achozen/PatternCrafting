package pl.achozen.patterns.builderpattern;

public class RobotBuilderDemo {

    public static void main(String[] args) {

	final Robot robotse = new Robot.RobotBuilder("John").setPower(50).setSpeed(60)
		.setWeight(10).build();
	robotse.introduce();
    }

}
