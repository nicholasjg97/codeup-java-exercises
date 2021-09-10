public class Dog {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String sound;

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    private String age;

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void makeNoise() {
        System.out.println(Quote.randomQuote());
        System.out.println(name + " goes " + sound);
    }

//    public void dogAge() {
//        System.out.println(name + " is " + age + " years old");
//    }

//    public void dogType() {
//        System.out.println(name + " is a " + type);
//    }

    public Dog(String name, String sound) {
        this.name = name;
        this.sound = sound;

    }

}
