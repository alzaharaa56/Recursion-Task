public class ChangePi {

    String changePi(String str) {
        if (str.length() == 0) {
            return "";

    }
        if (str.startsWith("pi")) {

            return "3.14" + changePi(str.substring(2));

        }
    }
}
