package itechart;

public class DeluxeBurger  extends  Hamburger{
    public DeluxeBurger(String name, String meat, String breadRollType) {
        super(name, meat, breadRollType, 19.10);
        super.addHamburgerAddition1("Bacon", 10);
        super.addHamburgerAddition2("Chips", 5);
        super.addHamburgerAddition3("Drink", 4);
        super.addHamburgerAddition1("Sauce", 1);
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("No additional items can be added to a Deluxe Burger.");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("No additional items can be added to a Deluxe Burger.");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("No additional items can be added to a Deluxe Burger.");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("No additional items can be added to a Deluxe Burger.");
    }
}
