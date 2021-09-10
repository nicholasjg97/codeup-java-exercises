public class Quote {

    public static String randomQuote() {
        int animalNumber = (int) (Math.random() * 4) + 1;
        String quoteOne = "I don't really trust a sane person";
        String quoteTwo = "An undefined problem has an infinite number of solutions.";
        String quoteThree = "I take my wife everywhere, but she keeps finding her way back.";
        String quoteFour = "Illusion is the first of all pleasures.";

        if (animalNumber == 1) {
            return quoteOne;
        } else if (animalNumber == 2) {
            return quoteTwo;
        } else if (animalNumber == 3) {
            return quoteThree;
        } else if (animalNumber == 4) {
            return quoteFour;
        }
        return randomQuote();
    }

}
