package abstractp.abstractfactorypattern;

public abstract class Company extends Exception {
    public abstract Component createComponent(ComponentTypes component) throws Exception; //factory method
}
