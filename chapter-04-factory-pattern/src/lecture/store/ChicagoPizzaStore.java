package lecture.store;

import lecture.pizza.ChicagoStyleCheesePizza;
import lecture.pizza.Pizza;

public class ChicagoPizzaStore extends lecture.store.PizzaStore {
    @Override
    Pizza createPizza(String type) {
        return new ChicagoStyleCheesePizza();
    }
}
