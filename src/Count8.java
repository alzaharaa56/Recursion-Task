public class Count8 {
    int count8(int n) {
        if (n == 0) {
            return 0;

        }

        int lastDigit = n % 10;


        int secondLastDigit = (n / 10) % 10;

        if (lastDigit == 8 && secondLastDigit == 8) {
            return 2 + count8(n / 10);
        }
        else if (lastDigit == 8) {
            return 1 + count8(n / 10);
        }
        else {
            return count8(n / 10);
        }
}
