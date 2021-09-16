package Vehicle;

public class GarageTest {

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Truck();
        vehicles[0].setName("Ford Raptor");
        vehicles[1] = new Car();
        vehicles[1].setName("Aston Martin");
        vehicles[2] = new Motorcycle();
        vehicles[2].setName("Harley Davidson");

        Car2 mustang = new Car2();
        mustang.name = "Mustang";
        vehicles[1] = mustang;

        Garage theManSpace = new Garage();
        theManSpace.theGarageThatHoldsVehicles(vehicles);
        theManSpace.alarmCascade(vehicles);

//        Vehicle findVehicle = garage.findVehic


    }


}
