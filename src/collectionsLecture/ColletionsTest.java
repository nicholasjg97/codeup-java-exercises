package collectionsLecture;

import java.util.ArrayList;

public class ColletionsTest {

    public static ArrayList<Integer> omit2s(ArrayList<Integer> numbers) {
        numbers.removeIf(number -> number == 2);
        return numbers;
    }

}
