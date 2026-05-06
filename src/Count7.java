public class Count7 {

    int count7(int n) {

        if (n == 0) {
            return 0;
    }
        int lastDigit = n % 10;

        int remaining = n / 10;

        if (lastDigit == 7) {

            return 1 + count7(remaining);
        }else {

            return count7(remaining);
        }
    }
}

class Count7Demo {
    public static void main(String[] args) {
        Count7 counter = new Count7();

        System.out.println("count7(717) → " + counter.count7(717));
        System.out.println("count7(7) → " + counter.count7(7));
        System.out.println("count7(123) → " + counter.count7(123));

    }
}
