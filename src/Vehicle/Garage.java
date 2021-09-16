package Vehicle;

public class Garage {

    public void theGarageThatHoldsVehicles(Vehicle[] vehicles) {

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getName() + " goes ");
            vehicle.makeNoise();
        }

    }

    public void alarmCascade(Vehicle[] vehicleAlarm) {
        for (Vehicle vehicle : vehicleAlarm) {
            System.out.println("HOONK HOONK");
        }
    }

    public Vehicle findVehicle(String name, Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getName().equalsIgnoreCase(name)) {
                return vehicle;
            }
        }
        Vehicle notHere = new Vehicle();
        notHere.setName(null);
        return notHere;
    }

}
