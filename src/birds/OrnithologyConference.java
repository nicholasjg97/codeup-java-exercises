package birds;

public class OrnithologyConference {

    public static void main(String[] args) {
        Ornithologist drCrook = new Ornithologist();
        Bird blueJay = new Bird("Blue-Jay");
        drCrook.changeBirdName("Cardinal", blueJay);

    }

}
