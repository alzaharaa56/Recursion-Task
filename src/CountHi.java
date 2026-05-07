public class CountHi {
    int countHi(String str) {
        if (str.length() < 2) {
            return 0;

        }

        if (str.substring(0, 2).equals("hi")) {

            return 1 + countHi(str.substring(2));

        }
        else {

            return countHi(str.substring(1));
        }
    }
}



public class CountHiDemo {
    public static void main(String[] args) {

        CountHi counter = new CountHi();

        System.out.println("countHi(\"xxhixx\") → " + counter.countHi("xxhixx"));
        System.out.println("countHi(\"xhixhix\") → " + counter.countHi("xhixhix"));
        System.out.println("countHi(\"hi\") → " + counter.countHi("hi"));
    }
    }
