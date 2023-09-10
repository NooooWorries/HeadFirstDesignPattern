package tutorial.ingredient;

import tutorial.ingredient.cheese.Cheese;
import tutorial.ingredient.cheese.ReggianoCheese;
import tutorial.ingredient.clams.Clams;
import tutorial.ingredient.clams.FreshClams;
import tutorial.ingredient.dough.Dough;
import tutorial.ingredient.dough.ThinCrustDough;
import tutorial.ingredient.pepperoni.Pepperoni;
import tutorial.ingredient.pepperoni.SlicedPepperoni;
import tutorial.ingredient.sauce.MarinaraSauce;
import tutorial.ingredient.sauce.Sauce;
import tutorial.ingredient.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        return new Veggie[]{ new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
