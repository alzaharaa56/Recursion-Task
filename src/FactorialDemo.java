
class Factorial {


    int factorial(int n) {

        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}


public class FactorialDemo {
    public static void main(String[] args) {

        Factorial factObj = new Factorial();


        System.out.println("Factorial of 1: " + factObj.factorial(1));
        System.out.println("Factorial of 2: " + factObj.factorial(2));
        System.out.println("Factorial of 3: " + factObj.factorial(3));
    }
}
