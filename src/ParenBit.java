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
}