
class StrCount {


    int strCount(String str, String sub) {

        if (str.length() < sub.length()) {
            return 0;
        }


        if (str.substring(0, sub.length()).equals(sub)) {

            return 1 + strCount(str.substring(sub.length()), sub);
        } else {

            return strCount(str.substring(1), sub);
        }
    }
}


public class StrCountDemo {
    public static void main(String[] args) {

        StrCount counter = new StrCount();


        System.out.println("strCount(\"catcowcat\", \"cat\") → " + counter.strCount("catcowcat", "cat"));
        System.out.println("strCount(\"catcowcat\", \"cow\") → " + counter.strCount("catcowcat", "cow"));
        System.out.println("strCount(\"catcowcat\", \"dog\") → " + counter.strCount("catcowcat", "dog"));
    }
}

