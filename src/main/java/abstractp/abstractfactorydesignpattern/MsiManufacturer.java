package abstractp.abstractfactorydesignpattern;

public class MsiManufacturer extends Company {

    @Override
    public Gpu createGpu() {
        System.out.println("Fábrica MSI GPU");
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        System.out.println("Fábrica MSI Monitor");
        return new MsiMonitor();
    }



}
