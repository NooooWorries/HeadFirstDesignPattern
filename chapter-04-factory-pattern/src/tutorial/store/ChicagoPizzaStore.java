package tutorial.store;

import tutorial.ingredient.ChicagoIngredientFactory;
import tutorial.ingredient.NYPizzaIngredientFactory;
import tutorial.ingredient.PizzaIngredientFactory;
import tutorial.pizza.CheesePizza;
import tutorial.pizza.ClamPizza;
import tutorial.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }
        return pizza;
    }
}
