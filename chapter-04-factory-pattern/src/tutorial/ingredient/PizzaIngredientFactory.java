package tutorial.ingredient;

import tutorial.ingredient.cheese.Cheese;
import tutorial.ingredient.clams.Clams;
import tutorial.ingredient.dough.Dough;
import tutorial.ingredient.pepperoni.Pepperoni;
import tutorial.ingredient.sauce.Sauce;
import tutorial.ingredient.veggies.Veggie;

public interface PizzaIngredientFactory {
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggie[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClams();
}
