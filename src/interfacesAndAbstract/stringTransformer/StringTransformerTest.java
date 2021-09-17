package interfacesAndAbstract.stringTransformer;

public class StringTransformerTest {

    public static void main(String[] args) {
        StringTransformer string1 = new ReverseStringTransformer("codeup");
        StringTransformer string2 = new UpperCaseStringTransformer("codeup");
        StringTransformer[] strings = {string1, string2};
        for (StringTransformer string : strings) {
            System.out.println(string.transform());
        }
    }

}
