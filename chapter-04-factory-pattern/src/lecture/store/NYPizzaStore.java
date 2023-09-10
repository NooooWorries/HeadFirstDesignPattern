package lecture.store;

import lecture.pizza.ChicagoStyleCheesePizza;
import lecture.pizza.NYStyleCheesePizza;
import lecture.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        return new NYStyleCheesePizza();
    }
}
