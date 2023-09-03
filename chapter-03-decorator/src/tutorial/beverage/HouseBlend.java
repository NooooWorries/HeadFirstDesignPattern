package tutorial.beverage;

import tutorial.Size;

public class HouseBlend extends Beverage {

    public HouseBlend(Size size) {
        setSize(size);
    }

    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
