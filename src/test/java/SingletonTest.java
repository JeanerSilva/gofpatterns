
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import factory.factorypattern.BeefBurgerRestaurant;
import factory.factorypattern.Burger;
import factory.factorypattern.Restaurant;
import singleton.singletonbasic.Singleton;

public class SingletonTest {
    @Test
    public void testInstanciaUnica() {
        Singleton s1 = Singleton.getInstance("dado original");    
        Singleton s2 = Singleton.getInstance("Novo dado");    
        assertEquals(s1, s2);
        assertEquals(s1.getData(), s2.getData());
     }
    
     @Test
    public void criaInstancia() {
        Singleton s1 = Singleton.getInstance("dado original");    
        assertNotNull(s1);
    }

    @Test
    public void criaBeefBurger() {
        Restaurant beefREsto = new BeefBurgerRestaurant();
        Burger beefBurger = beefREsto.orderBurger();
        assertNotNull(beefBurger);
    }

}