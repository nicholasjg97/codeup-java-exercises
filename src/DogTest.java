public class DogTest {

    public static void main(String[] args) {

        Dog elvis = new Dog("Elvis", "Woof");
//        elvis.name = "Elvis";
//        elvis.sound = "Woof";
//        elvis.age = "2 years";
//        elvis.type = "labrador retriever";
        elvis.makeNoise();
//        elvis.dogAge();
//        elvis.dogType();
        System.out.println(elvis.getName() + " can go " + elvis.getSound());

    }

}
