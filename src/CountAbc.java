public class CountAbc {
    int countAbc(String str) {

        if (str.length() < 3) {
            return 0;
        }

        String firstThree = str.substring(0, 3);

        if (firstThree.equals("abc") || firstThree.equals("aba")) {
            return 1 + countAbc(str.substring(1));
        } else {

            return countAbc(str.substring(1));
        }
    }
}

public class CountAbcDemo {
    public static void main(String[] args) {

        CountAbc counter = new CountAbc();


        System.out.println("countAbc(\"abc\") → " + counter.countAbc("abc"));
        System.out.println("countAbc(\"abcxxabc\") → " + counter.countAbc("abcxxabc"));
        System.out.println("countAbc(\"abaxxaba\") → " + counter.countAbc("abaxxaba"));
    }
}