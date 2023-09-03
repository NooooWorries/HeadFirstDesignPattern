package tutorial.beverage;

import tutorial.Size;

public class Espresso extends Beverage {

    public Espresso(Size size) {
        description = "Espresso";
        this.setSize(size);
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
