package factory.factorypattern;
public abstract class Restaurant {
    public Burger orderBurger(){
        Burger burger = createBurger();
        burger.prepare(burger);
        return burger;
    }
    public abstract Burger createBurger();
}
