
package tutorial.beverage;

import tutorial.Size;

public class Decat extends Beverage {

    public Decat(Size size) {
        this.setSize(size);
    }

    public Decat() {
        description = "Decat";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
