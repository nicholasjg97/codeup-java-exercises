package Vehicle;

public class Vehicle {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("Vroom vroom");
    }

    public Vehicle() {

    }

    public Vehicle(String name) {
        this.name = name;
    }
}
