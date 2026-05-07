public class Count11 {

    int count11(String str) {


        if (str.length() < 2) {
            return 0;

        }
        if (str.substring(0, 2).equals("11")) {

            return 1 + count11(str.substring(2));
        }else {

            return count11(str.substring(1));
        }
    }
}




public class Count11Demo {
    public static void main(String[] args) {

        Count11 counter = new Count11();

    }
    }
