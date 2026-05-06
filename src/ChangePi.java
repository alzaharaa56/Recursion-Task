public class ChangePi {

    String changePi(String str) {
        if (str.length() == 0) {
            return "";

    }
        if (str.startsWith("pi")) {

            return "3.14" + changePi(str.substring(2));

        }else {

            return str.charAt(0) + changePi(str.substring(1));
        }
    }
}

public class ChangePiDemo {
    public static void main(String[] args) {

        ChangePi changer = new ChangePi();


        System.out.println("changePi(\"xpix\") → " + changer.changePi("xpix"));
        System.out.println("changePi(\"pipi\") → " + changer.changePi("pipi"));
        System.out.println("changePi(\"pip\") → " + changer.changePi("pip"));


    }
}