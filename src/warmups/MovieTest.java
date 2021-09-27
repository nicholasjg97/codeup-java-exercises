package warmups;

public class MovieTest {

    public static void main(String[] args) {
        Comedy comedy = new Comedy("Unfunny movie", "Mr Big", false);
        System.out.println(comedy.getName() + " " + comedy.getDirector() + " " + comedy.funny);
        System.out.println(comedy.audienceReaction());
    }


    }


