package tutorial;

import tutorial.pizza.Pizza;
import tutorial.store.ChicagoPizzaStore;
import tutorial.store.NYPizzaStore;
import tutorial.store.PizzaStore;

public class Main {
    public static void main(String[] args) {
        // Factory Pattern
        Pizza pizza = null;

        PizzaStore nyPizzaStore = new NYPizzaStore();
        pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(pizza.toString());

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        pizza = chicagoPizzaStore.orderPizza("clam");
        System.out.println(pizza.toString());
    }
}