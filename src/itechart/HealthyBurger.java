package itechart;

public class HealthyBurger extends  Hamburger {
    private String healthyExtra1Name;
    private String healthyExtra2Name;

    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String name, String meat, String breadRollType, double price) {
        super(name, meat, breadRollType, price);
    }

    public void addHealthyExtraAddition1(String addition1Name, double addition1Price) {
        this.healthyExtra1Name = addition1Name;
        this.healthyExtra1Price = addition1Price;
    }

    public void addHealthyExtraAddition2(String addition2Name, double addition2Price) {
        this.healthyExtra2Name = addition2Name;
        this.healthyExtra2Price = addition2Price;
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("No additional items can be added to a Healthy Burger.");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("No additional items can be added to a Healthy Burger.");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("No additional items can be added to a Healthy Burger.");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("No additional items can be added to a Healthy Burger.");
    }

    @Override
    public double itemizeHamburger() {
        return this.getPrice() + healthyExtra1Price + healthyExtra2Price;
    }
}
