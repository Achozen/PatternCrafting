package pl.achozen.patterns.builderpattern;

public class Robot {

    private final String name;// required
    private final int power;
    private final int speed;
    private final int weight;

    public void introduce() {

	System.out.println("Hello my name is " + name + "\nMy power is " + power + "\nMy speed is "
		+ speed + "\nMy weight is " + weight);

    }

    private Robot(RobotBuilder builder) {

	this.name = builder.builderName;
	this.power = builder.builderPower;
	this.speed = builder.builderSpeed;
	this.weight = builder.builderWeight;
    }

    public static class RobotBuilder {

	private String builderName;
	private int builderPower = 0;
	private int builderSpeed = 0;
	private int builderWeight = 5;

	public RobotBuilder(String name) {
	    builderName = name;
	}

	public RobotBuilder setPower(int power) {
	    builderPower = power;
	    return this;
	}

	public RobotBuilder setSpeed(int speed) {
	    builderSpeed = speed;
	    return this;
	}

	public RobotBuilder setWeight(int weight) {
	    builderWeight = weight;
	    return this;
	}

	Robot build() {

	    return new Robot(this);
	}
    }

}
