package abstractp.abstractfactorydesignpattern;

public class AsusManufacturer extends Company {

    @Override
    public Gpu createGpu() {
        System.out.println("Fábrica GPU Asus");
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        System.out.println("Fábrica monitor Asus");
        return new AsusMonitor();
    }


}
