public class NoX {
    String noX(String str) {
        if (str.length() == 0) {
            return "";

        }
        char firstChar = str.charAt(0);

        String rest = noX(str.substring(1));

        if (firstChar == 'x') {
            return rest;
        } else {

            return firstChar + rest;
        }
    }

}


class NoXDemo {
    public static void main(String[] args) {

        NoX remover = new NoX();


        System.out.println("noX(\"xaxb\") → " + remover.noX("xaxb"));
        System.out.println("noX(\"abc\") → " + remover.noX("abc"));
        System.out.println("noX(\"xx\") → " + remover.noX("xx"));
    }
}

