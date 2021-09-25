public class Lizard {

    public String name;

    public Lizard(String name) throws IllegalArgumentException {
        if (name == null) {
            throw  new IllegalArgumentException();
        }
        this.name = name;
    }
}
