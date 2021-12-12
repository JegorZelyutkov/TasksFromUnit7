package itechart;

public class Bedroom {
    private final Bed bed;
    private final Lamp lamp;

    public Bedroom(String name,
                   Wall firstWall,
                   Wall secondWall,
                   Wall thirdWall,
                   Wall fourthWall,
                   Ceiling ceiling,
                   Bed bed,
                   Lamp lamp) {
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed() {
        System.out.println("The bed is being made");
        bed.make();
    }
}
