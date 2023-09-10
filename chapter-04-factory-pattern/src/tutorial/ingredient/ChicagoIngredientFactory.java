package tutorial.ingredient;

import tutorial.ingredient.cheese.Cheese;
import tutorial.ingredient.cheese.Mozzarella;
import tutorial.ingredient.clams.Clams;
import tutorial.ingredient.clams.FrozenClams;
import tutorial.ingredient.dough.Dough;
import tutorial.ingredient.dough.ThickCrustDough;
import tutorial.ingredient.pepperoni.Pepperoni;
import tutorial.ingredient.pepperoni.SlicedPepperoni;
import tutorial.ingredient.sauce.PlumTomatoSauce;
import tutorial.ingredient.sauce.Sauce;
import tutorial.ingredient.veggies.BlackOlives;
import tutorial.ingredient.veggies.Eggplant;
import tutorial.ingredient.veggies.Spinach;
import tutorial.ingredient.veggies.Veggie;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Veggie[] createVeggies() {
        return new Veggie[]{new Spinach(), new Eggplant(), new BlackOlives()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
