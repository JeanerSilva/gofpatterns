package src.main.java.factory.factorypattern;

public class VeggieBurger extends Burger {

    @Override
    public void prepare(Burger burger) {
        super.prepare(burger);
        System.out.println("Prepara VeggieBurger");
    }
    
}