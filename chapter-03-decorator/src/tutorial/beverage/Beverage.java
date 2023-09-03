package tutorial.beverage;

import tutorial.Size;

public abstract class Beverage {
    String description = "Unknown Beverage";
    private Size size;

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}
