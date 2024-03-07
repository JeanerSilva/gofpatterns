package abstractp.factorymethod;

public class Test {
    
    public static void main(String[] args) {
        MsiManufacturer msigpu = new MsiManufacturer();
        msigpu.createGpu().assemble();
    }
}
