
class Factorial {

    int factorial(int n) {

        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public class FactorialDemo {
        public static void main(String[] args) {

            Factorial factObj = new Factorial();
        }
        }
}

