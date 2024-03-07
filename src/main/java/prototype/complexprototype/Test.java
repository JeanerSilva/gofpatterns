package prototype.complexprototype;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main (String[] args){

        List<Vehicle> vehicles = new ArrayList<>();    

        vehicles.add(new Car());
        vehicles.add(new Bus());
        vehicles.add(new Car());

        List<Vehicle> copyList = new ArrayList<>();

        for (Vehicle vehicle : vehicles) {
            copyList.add((Vehicle) vehicle.clone());
        }
    }
}
