package factory;

public class VeggieBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        System.out.println("Solicita veggieburger");
        return new VeggieBurger();
    }
    
}
