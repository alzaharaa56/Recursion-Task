public class CountX {
    int countX(String str) {

        if (str.length() == 0) {
            return 0;
        }

        char firstChar = str.charAt(0);

        String remaining = str.substring(1);
        if (firstChar == 'x') {
            return 1 + countX(remaining);
        } else {
            return countX(remaining);
        }

    }
}

class CountXDemo {
    public static void main(String[] args) {

        CountX counter = new CountX();



        System.out.println("countX(\"xxhixx\") → " + counter.countX("xxhixx"));
        System.out.println("countX(\"xhixhix\") → " + counter.countX("xhixhix"));
        System.out.println("countX(\"hi\") → " + counter.countX("hi"));


    }
}
