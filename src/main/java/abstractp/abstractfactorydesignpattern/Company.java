package abstractp.abstractfactorydesignpattern;

public abstract class Company extends Exception {
    public abstract Gpu createGpu(); //factory method
    public abstract Monitor createMonitor(); 
}
