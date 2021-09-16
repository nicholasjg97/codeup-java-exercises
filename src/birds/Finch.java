package birds;

public class Finch extends Bird {

    @Override
    public void makeNoise() {
        // call the super class makeNoise method
        super.makeNoise();
        //then add extra custom code after running th superClass code
        System.out.println("Chirp chirp");
    }

    public Finch() {
        System.out.println("A new finch has been created.");
    }
}
