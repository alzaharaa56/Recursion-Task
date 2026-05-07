public class BunnyEars {
    int bunnyEars(int n) {
        if (n == 0) {
            return 0;
        }

        return 2 + bunnyEars(n - 1);
    }

}

public class BunnyEarsDemo {
    public static void main(String[] args) {

        BunnyEars earsObj = new BunnyEars();

        System.out.println("bunnyEars(0) → " + earsObj.bunnyEars(0));
        System.out.println("bunnyEars(1) → " + earsObj.bunnyEars(1));
        System.out.println("bunnyEars(2) → " + earsObj.bunnyEars(2));
    }
}
