public class BunnyEars1 {




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


    class BunnyEarsDemo {
        public static void main(String[] args) {

            BunnyEars earsObj = new BunnyEars();


            System.out.println("bunnyEars2(0) → " + earsObj.bunnyEars(0));
            System.out.println("bunnyEars2(1) → " + earsObj.bunnyEars(1));
            System.out.println("bunnyEars2(2) → " + earsObj.bunnyEars(2));
        }
    }


