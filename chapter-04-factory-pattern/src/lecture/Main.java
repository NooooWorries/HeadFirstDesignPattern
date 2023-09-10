package lecture;

import lecture.pizza.Pizza;
import lecture.store.ChicagoPizzaStore;
import lecture.store.NYPizzaStore;
import lecture.store.PizzaStore;

public class Main {
    public static void main(String[] args) {
        // Simple Factory
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}