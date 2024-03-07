package prototype.simpleprototype;

public class Car implements Prototype {

    private final String brand;
    private final String model;
    private final String color;

    public Car(Car car) {
        this.brand = car.brand;
        this.model = car.model;
        this.color = car.color;
    }

    @Override
    public String toString() {
        return "car - model: " + model;
    }

    @Override
    public Car clone()  {
        return new Car(this);
    }
}
