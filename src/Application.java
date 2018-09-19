import vehicle.Airplane;
import vehicle.Truck;

public class Application {

    public static void main(String[] args) {

        System.out.println("--- truck ---");
        Truck truck = new Truck(300, 0);
        truck.drive();
        truck.fillTruck(280);
        System.out.println(truck.getCapacity());
        truck.fillTruck(21);
        System.out.println(truck.getType());

        System.out.println("--- plane ---");
        Airplane plane = new Airplane(0, "MB123");
        System.out.println(plane.getMileage());
        System.out.println(plane.isInAir());
        plane.fly();
        System.out.println(plane.getType());
        plane.land();
        plane.drive(2);
        System.out.println(plane.getMileage());

        //Hetzelfde
        System.out.println(plane);
        System.out.println(plane.toString());

    }

}
