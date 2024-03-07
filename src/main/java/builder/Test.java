package builder;

public class Test {
    public static void main (String[] args){
        CarBuilder builder = new CarBuilder();
        builder.id(2122)
            .brand("Bugatti")
            .model("Chiron")
            .color("blue");

        Car car = builder.build();
        System.out.println(car);

        Director director = new Director();
        CarBuilder builder2 = new CarBuilder();
        director.buildBuggati1(builder2);
        Car car2 = builder2.build();
        System.out.println(car2);

    }
}
