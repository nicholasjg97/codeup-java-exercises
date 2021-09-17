package interfacesAndAbstract.stringTransformer;

public class ReverseStringTransformer extends StringTransformer {

    public ReverseStringTransformer(String str){
        super(str);
    }

    @Override
    public String transform() {
        StringBuilder output = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i -= 1) {
            output.append(str.charAt(i));
        }
        return output.toString();
    }
}
