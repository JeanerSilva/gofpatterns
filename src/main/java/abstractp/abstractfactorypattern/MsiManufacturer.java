package abstractp.abstractfactorypattern;

public class MsiManufacturer extends Company {

    @Override
    public Component createComponent(ComponentTypes componentType) throws Exception {
        Component component = null;
        if (componentType.equals(ComponentTypes.MSIGPU)) {
            component = new MsiGpu();
        } else if (componentType.equals(ComponentTypes.MSIMONITOR)) {
            component = new MsiMonitor();
        } else {
            throw new Exception("Impossível fazer componente ASUS na fábrica de MSI");
        }
        return component;
    }

}
