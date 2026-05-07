public class ParenBit {


    String parenBit(String str) {
        if (str.startsWith("(") && str.endsWith(")")) {
            return str;

        }
        if (!str.startsWith("(")) {
            return parenBit(str.substring(1));
        }


        if (!str.endsWith(")")) {
            return parenBit(str.substring(0, str.length() - 1));
        }

        return str;
    }
}




public class ParenBitDemo {
    public static void main(String[] args) {

        ParenBit extractor = new ParenBit();

        System.out.println("parenBit(\"xyz(abc)123\") → " + extractor.parenBit("xyz(abc)123"));
        System.out.println("parenBit(\"x(hello)\") → " + extractor.parenBit("x(hello)"));
        System.out.println("parenBit(\"(xy)1\") → " + extractor.parenBit("(xy)1"));
    }
    }