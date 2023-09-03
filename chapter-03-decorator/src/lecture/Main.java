package lecture;

import lecture.beverage.Beverage;
import lecture.beverage.DarkRoast;
import lecture.beverage.Espresso;
import lecture.beverage.HouseBlend;
import lecture.decorator.Mocha;
import lecture.decorator.Soy;
import lecture.decorator.Whip;

public class Main {
    public static void main(String[] args) {
        // Beverage 1: Espresso without any condiment
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        // Beverage 2: Dark Roast with double mocha and one whip
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

        // Beverage 3: HouseBlend with soy, mocha and whip
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
    }
}
