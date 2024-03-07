package abstractp.abstractfactorydesignpattern;

public class Test {
    
    public static void main(String[] args) throws Exception {
        Company msi = new MsiManufacturer();
        Gpu msigpu  = msi.createGpu();
        msigpu.assemble();
        Monitor msiMonitor = msi.createMonitor();
        msiMonitor.assemble();
        
        Company asus = new AsusManufacturer();
        Gpu asusGpu = asus.createGpu();
        asusGpu.assemble();
        Monitor asusMonitor = asus.createMonitor();
        asusMonitor.assemble();


        /* 
        MsiManufacturer msiMonitor = new MsiManufacturer();
        MsiManufacturer msiGpu = new MsiManufacturer();
        AsusManufacturer asusMonitor = new AsusManufacturer();
        AsusManufacturer asusGpu = new AsusManufacturer();

        msiMonitor.createMonitor().assemble();        
        msiGpu.createGpu().assemble();        
        asusMonitor.createMonitor().assemble();        
        asusGpu.createGpu().assemble();        
        */
    }
}
