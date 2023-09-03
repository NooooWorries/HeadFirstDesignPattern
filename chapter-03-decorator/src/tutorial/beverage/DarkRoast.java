package tutorial.beverage;

import tutorial.Size;

public class DarkRoast extends Beverage {

    public DarkRoast(Size size) {
        this.setSize(size);
    }

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
