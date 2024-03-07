package simplefactory;

public class Teste {
    public static void main (String[] args){
        Restaurant r = new Restaurant();
        r.orderBurger(BurgerTypes.BEEF);
    }
}
