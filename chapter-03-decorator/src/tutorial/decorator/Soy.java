package tutorial.decorator;

import tutorial.Size;
import tutorial.beverage.Beverage;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Size getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        switch (getSize()) {
            case GRANDE:
                return 0.15 + beverage.cost();
            case VENTI:
                return 0.2 + beverage.cost();
            default:
                return 0.1 + beverage.cost();
        }
    }

    @Override
    public String getDescription() {
        return "Soy " + beverage.getDescription();
    }
}
