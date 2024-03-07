package factorypattern;

public class BeefBurger extends Burger {

    @Override
    public void prepare(Burger burger) {
        super.prepare(burger);
        System.out.println("Prepara BeefBurger");
    }

    
    
}
