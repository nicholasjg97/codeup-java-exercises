package interfacesAndAbstract.stringTransformer;

import interfacesAndAbstract.stringTransformer.StringTransformer;

public class UpperCaseStringTransformer extends StringTransformer {

    public UpperCaseStringTransformer(String str) {
        super(str);
    }

    @Override
    public String transform() {
        return getStr().toUpperCase();
    }
}
