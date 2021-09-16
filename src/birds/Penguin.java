package birds;

public class Penguin extends Bird {

    @Override
    public void makeNoise() {
        System.out.println("honk honk");
    }

    @Override
    public void move() {
        System.out.println("Waddle waddle");
    }

//    public void argumentativePenguinScientist(){
//        System.out.println("I do not believe we should call penguins " + this.ORDER);
//        System.out.println("In fact penguins are psittaciformes");
    // cannot do this: error message: cannot assign a value to final variable ORDER
//        this.ORDER = "Psittaciformes";
//    }
}
