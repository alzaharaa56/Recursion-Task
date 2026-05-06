
class PairStar {


    String pairStar(String str) {

        if (str.length() <= 1) {
            return str;
        }


        char firstChar = str.charAt(0);
        char nextChar = str.charAt(1);

        if (firstChar == nextChar) {
            return firstChar + "*" + pairStar(str.substring(1));
        } else {

            return firstChar + pairStar(str.substring(1));
}
