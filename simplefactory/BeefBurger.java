package factoryold;

public class BeefBurger extends Burger {

    @Override
    public void prepare(Burger burger) {
        // TODO Auto-generated method stub
        super.prepare(burger);
        System.out.println("Prepara vegetariano");
    }

    
    
}
