import util.Input;

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();
        String userInput = input.getString();
        System.out.println(userInput);
        boolean yesOrNo = input.yesNo(userInput);
        System.out.println(yesOrNo ? "User said yes" : "User said no");


        int numberInput = input.getInt(1, 10);
        System.out.println(numberInput);

    }

}
