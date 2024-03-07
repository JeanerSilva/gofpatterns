package abstractp.abstractfactorypattern;

public class AsusManufacturer extends Company {

    @Override
    public Component createComponent(ComponentTypes componentType) throws Exception {
        Component component = null;
        if (componentType.equals(ComponentTypes.ASUSGPU)) {
            component = new AsusGpu();
        } else if (componentType.equals(ComponentTypes.ASUSMONITOR)) {
            component = new AsusMonitor();
        } else {
            throw new Exception("Impossível fazer componente ASUS na fábrica de MSI");
        }
        return component;
    }
}
