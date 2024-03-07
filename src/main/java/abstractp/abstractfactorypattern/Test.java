package abstractp.abstractfactorypattern;

public class Test {
    
    public static void main(String[] args) throws Exception {
        MsiManufacturer msiMonitor = new MsiManufacturer();
        msiMonitor.createComponent(ComponentTypes.MSIGPU).assemble();        
    }
}
