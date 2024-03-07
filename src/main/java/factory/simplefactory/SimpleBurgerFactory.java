package src.main.java.factory.simplefactory;

public class SimpleBurgerFactory {
    public Burger createBurger(BurgerTypes burgerType){
        Burger burger = null;
        if (burgerType == BurgerTypes.BEEF) {
        burger = new BeefBurger();
        } else if (burgerType == BurgerTypes.VEGGIE) {
            burger = new VeggieBurger();
        }
        return burger;
    }
    
}
