package abstractp.factorymethod;

public abstract class Company {
    public Gpu assembleGpu () {
        Gpu gpu = createGpu();
        gpu.assemble();
        return gpu;
    }

    public abstract Gpu createGpu(); //factory method
}
