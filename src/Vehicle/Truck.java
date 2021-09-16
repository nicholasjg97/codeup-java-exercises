package Vehicle;

public class Truck extends Vehicle {

    public void makeNoise() {
        System.out.println("VROOM, VROOOM");
    }

    public void breakingDown() {
//        super.makeNoise();
        System.out.println("VROOooomm clank clank");
        System.out.println("*dashboard beeep*");
    }
}
