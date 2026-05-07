public class Triangle {

    int triangle(int n) {
        if (n == 0) {
            return 0;

        }
        return n + triangle(n - 1);
    }

}

public class TriangleDemo {
    public static void main(String[] args) {

        Triangle triObj = new Triangle();


    }
}


