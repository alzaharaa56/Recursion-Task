public class EndX {

    String endX(String str) {
        if (str.length() == 0) {
            return "";
        }

        char firstChar = str.charAt(0);

        String rest = endX(str.substring(1));

        if (firstChar == 'x') {
            return rest + "x";
        } else {

            return firstChar + rest;
        }
    }
}



public class EndXDemo {
    public static void main(String[] args) {

        EndX mover = new EndX();

        System.out.println("endX(\"xxre\") → " + mover.endX("xxre"));
        System.out.println("endX(\"xxhixx\") → " + mover.endX("xxhixx"));
        System.out.println("endX(\"xhixhix\") → " + mover.endX("xhixhix"));


    }

}