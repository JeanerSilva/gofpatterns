package builder;

// tipo um seed
public class Director {
    public void buildBuggati1(CarBuilder builder) {
        builder.brand("Bugatti")
        .color("blue")
        .id(1)
        .model("1")
        .build();
    }

    public void buildLambo1(CarBuilder builder) {
        builder.brand("Lamborguini")
        .color("orange")
        .id(1)
        .model("2")
        .build();
    }
}
