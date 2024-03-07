package factory.simplefactory;

class Burger {
    private int produtcId;

    public void prepare(Burger burger){
        produtcId++;
        System.out.println("Prepara o que é comum a todos hamburgers" + produtcId);
    }
}