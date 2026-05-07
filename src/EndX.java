public class EndX {

    String endX(String str) {
        if (str.length() == 0) {
            return "";
        }

        char firstChar = str.charAt(0);

        String rest = endX(str.substring(1));
}
