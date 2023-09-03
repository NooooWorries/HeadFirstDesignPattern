package tutorial;

import tutorial.beverage.Beverage;
import tutorial.beverage.DarkRoast;
import tutorial.beverage.Espresso;
import tutorial.beverage.HouseBlend;
import tutorial.decorator.Mocha;
import tutorial.decorator.Soy;
import tutorial.decorator.Whip;

public class Main {
    public static void main(String[] args) {
        // Beverage 1: Espresso without any condiment
        Beverage espresso = new Espresso(Size.TALL);
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        // Beverage 2: Dark Roast with double mocha and one whip
        Beverage darkRoast = new DarkRoast(Size.VENTI);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

        // Beverage 3: HouseBlend with soy, mocha and whip
        Beverage houseBlend = new HouseBlend(Size.TALL);
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
    }
}
