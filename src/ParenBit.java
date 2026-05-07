public class ParenBit {


    String parenBit(String str) {
        if (str.startsWith("(") && str.endsWith(")")) {
            return str;

    }
        if (!str.startsWith("(")) {
            return parenBit(str.substring(1));
        }
}