package tutorial.pizza;


import tutorial.ingredient.cheese.Cheese;
import tutorial.ingredient.clams.Clams;
import tutorial.ingredient.dough.Dough;
import tutorial.ingredient.pepperoni.Pepperoni;
import tutorial.ingredient.sauce.Sauce;
import tutorial.ingredient.veggies.Veggie;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Pepperoni pepperoni;
    Veggie[] veggies;
    Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Pizza " + name;
    }
}
