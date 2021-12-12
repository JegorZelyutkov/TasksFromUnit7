package itechart;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        return "The car " + name + "'s engine is starting";
    }

    public String accelerate() {
        return "The car " + name + " is accelerating";
    }

    public String brake() {
        return "The car " + name + " is braking";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
