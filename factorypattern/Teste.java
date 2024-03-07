package factory;

public class Teste {
    public static void main (String[] args){
        Restaurant beefREsto = new BeefBurgerRestaurant();
        Burger beefBurger = beefREsto.orderBurger();
        System.out.println(beefBurger);
    }
}
