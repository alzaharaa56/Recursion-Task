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

        System.out.println("triangle(0) → " + triObj.triangle(0));
        System.out.println("triangle(1) → " + triObj.triangle(1));
        System.out.println("triangle(2) → " + triObj.triangle(2));


    }
}


