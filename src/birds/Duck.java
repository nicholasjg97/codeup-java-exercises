package birds;

public class Duck extends Bird {

    public void makeNoise() {
        System.out.println("Quack, quack");
    }

    public Duck() {
        super("Duck");
    }

    public void setName(String name) {
//        super.setName(name);
        super.name = name;
    }

    public Duck(String name) {
//        this.setName(name);
        super(name);
        System.out.println("A new duck has been created");
    }


}
