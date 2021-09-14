import java.util.Random;

public class ServerNameGenerator {

    public static String[] adjectives = {"Attractive", "Better", "Brainy", "Clumsy", "Crazy", "Delightful", "Fantastic", "Jittery", "Outstanding", "Wicked"};
    public static String[] nouns = {"Door", "Car", "Cologne", "Bat", "Truck", "Ice", "Snow", "Flower", "House", "Computer"};

    // method that will return random element from an array of strings
    public static String randomElement(String[] randomInput) {
        Random input = new Random();
        int randomIndex = input.nextInt(randomInput.length);
        return randomInput[randomIndex];
    }

    public static void main(String[] args) {
        System.out.println(randomElement(adjectives) + "-" + randomElement(nouns));
    }




}
