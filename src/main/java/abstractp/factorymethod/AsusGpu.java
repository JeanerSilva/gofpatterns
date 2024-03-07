package abstractp.factorymethod;

public class AsusGpu extends Gpu
 {

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Asus");
    }
    
}
