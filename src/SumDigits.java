public class SumDigits {

    int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }

        int lastDigit = n % 10;

        return lastDigit + sumDigits(n / 10);
    }


}



class SumDigitsDemo {
    public static void main(String[] args) {

        SumDigits calculator = new SumDigits();


        System.out.println("sumDigits(126) → " + calculator.sumDigits(126));
        System.out.println("sumDigits(49) → " + calculator.sumDigits(49));
        System.out.println("sumDigits(12) → " + calculator.sumDigits(12));
    }
}
