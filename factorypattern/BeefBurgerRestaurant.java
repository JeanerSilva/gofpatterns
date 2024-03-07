package factorypattern;

public class BeefBurgerRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        System.out.println("BeefBurgerRestaurant solicita beef");
        return new BeefBurger();
    }

    
    
}
