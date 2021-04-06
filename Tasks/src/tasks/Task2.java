package tasks;

public class Task2 {
    public static int oppositeHouse(int house, int streetLength) {
        return streetLength * 2 - (house - 1);
    }

    public static String nameShuffle(String str) {
        String[] words = str.split(" ");
        return words[1] + " " + words[0];
    }

    public static float discount(int price, int percent) {
        return price - (price * (percent / 100));
    }

    public static int differenceMaxMin(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(max <= arr[i]){
                max = arr[i];
            }

            if(min >= arr[i]){
                min = arr[i];
            }
        }

        return max - min;
    }

    public static int equal(int a, int b, int c) {
        if (a == b && a == c) {
            return 3;
        } else if (a == b || b == c || a == c) {
            return 2;
        }
        return 0;
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static int programmers(int a, int b, int c) {
        int max = a;
        int min = a;

        if (b > max) max = b;
        if (c > max) max = c;

        if (b < min) min = b;
        if (c < min) min = c;

        return max - min;
    }

    public static boolean getXO(String str) {
        String[] arr = str.split("");
        int countX  = 0;
        int countO = 0;

        for (String item : arr) {
            if (item == "x") countX++;
            if (item == "o") countO++;
        }

        return countO == countX ? true : false;
    }

    public static String bomb(String str) {
        return str.toLowerCase().contains("bomb") ? "DUCK!" : "Relax, there's no bomb.";
    }

    public static boolean sameAscii(String str1, String str2) {
        int sum1 = 0;
        int sum2 = 0;


        for (int i = 0; i < str1.length(); i++) {
            char character = str1.charAt(i);
            int ascii = (int) character;
            sum1 += ascii;
        }

        for (int i = 0; i < str2.length(); i++) {
            char character = str2.charAt(i);
            int ascii = (int) character;
            sum2 += ascii;
        }

        return sum1 == sum2 ? true : false;
    }
}
