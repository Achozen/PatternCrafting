package pl.achozen.patterns.factorypattern.robots;

public abstract class Robot {

    public int getWeigth() {
	return weigth;
    }

    public Robot setWeigth(int weigth) {
	this.weigth = weigth;
	return this;
    }

    public int getMovingPower() {
	return movingPower;
    }

    public Robot setMovingPower(int movingPower) {
	this.movingPower = movingPower;
	return this;
    }

    public int getGunPower() {
	return gunPower;
    }

    public Robot setGunPower(int gunPower) {
	this.gunPower = gunPower;
	return this;
    }

    public String getName() {
	return name;
    }

    public Robot setName(String name) {
	this.name = name;
	return this;
    }

    public int getHealth() {
	return health;
    }

    public Robot setHealth(int health) {
	this.health = health;
	return this;
    }

    public int getAgility() {

	return movingPower / weigth;
    }

    private int weigth = 0;
    private int movingPower = 0;
    private int gunPower = 0;
    private String name = "defaultName";
    private int health = 0;
    private int agility = 0;

}
