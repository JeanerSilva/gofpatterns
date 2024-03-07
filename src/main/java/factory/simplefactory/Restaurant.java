package src.main.java.factory.simplefactory;

public class Restaurant {
    public Burger orderBurger(BurgerTypes burgerType){
        SimpleBurgerFactory factory = new SimpleBurgerFactory();
        Burger burger = factory.createBurger(burgerType);
        burger.prepare(burger);
        return burger;
    }
}
