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
    }
}
    }
