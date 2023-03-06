package ArrayList;

import java.util.ArrayList;
import java.util.List;
public class ArrayListExmaple {
    public static void main(String[] args) {
        //  Create an Arraylist of String
        List<String> vehicle = new ArrayList<>();

        //  Adding new elements
        vehicle.add("Mercedes");
        vehicle.add("Volwagen");
        vehicle.add("Honda");
        vehicle.add("Bugatti");
        vehicle.add("Ferrari");

        System.out.println(vehicle);

        //  Retrieve the elements at a given index
        String firstVehicle = vehicle.get(0);
        String lastVehicle = vehicle.get(vehicle.size()-1);

        System.out.println("First of array: "+firstVehicle);
        System.out.println("Last of array: "+lastVehicle);

        vehicle.set(3,"Hahaha");
        System.out.println("After set(3): "+vehicle);

        // Remove the element from array
        vehicle.remove(2);
        System.out.println("After remove(2): "+vehicle);

    }
}
