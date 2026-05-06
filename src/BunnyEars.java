public class BunnyEars {
    int bunnyEars2(int n) {

        if (n == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return 3 + bunnyEars2(n - 1);
        } else {
            return 2 + bunnyEars2(n - 1);
        }
    }
}

public class BunnyEarsDemo {
    public static void main(String[] args) {

        BunnyEars earsObj = new BunnyEars();

        System.out.println("Total ears with 0 bunnies: " + earsObj.bunnyEars2(0));
        System.out.println("Total ears with 1 bunny: " + earsObj.bunnyEars2(1));
        System.out.println("Total ears with 2 bunnies: " + earsObj.bunnyEars2(2));
    }
}
