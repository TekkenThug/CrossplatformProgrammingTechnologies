package tasks;

import java.util.ArrayList;

public class Task3 {
    public static Object[][] millionsRounding(Object[][] cities) {
        for (Object[] city : cities) {
            city[1] = (int) city[1] / 1000000;
        }

        return cities;
    }

    public static double[] otherSides(int a) {
        double[] answer = new double [2];

        answer[0] = a * 2;
        answer[1] = Math.sqrt(answer[0] * answer[0] - a * a);

        return answer;
    }

    public static String rps(String a, String b) {
        if ((a.equals("paper") && b.equals("rock")) ||
                (a.equals("scissors") && b.equals("paper")) ||
                (a.equals("rock") && b.equals("scissors"))
        ) {
            return "Player 1 wins";
        } else if ((b.equals("paper") && a.equals("rock")) ||
                (b.equals("scissors") && a.equals("paper")) ||
                (b.equals("rock") && a.equals("scissors"))
        ) {
            return "Player 2 wins";
        } else {
            return "TIE";
        }
    }

    public static int warOfNumbers(int[] numbers) {
        int odd = 0;
        int even = 0;

        for(int number : numbers) {
            if (number % 2 == 0) even += number;
            else odd += number;
        }

        return Math.max(odd, even) - Math.min(odd, even);
    }

    public static String reverseCase(String str) {
        String[] arr = str.split("");

        for(String symbol : arr) {
            char[] c = symbol.toCharArray();

            if (Character.isLowerCase(c[0])) {
                symbol = symbol.toUpperCase();
            } else {
                symbol = symbol.toLowerCase();
            }
        }

        return String.join("", arr);
    }

    public static String inatorInator(String str) {
        String[] vowels = new String[] {"a", "e", "i", "o", "u"};
        int length = str.length();

        String[] arr = str.split("");

        for (String letter : vowels) {
            if (arr[length - 1].equals(letter)) {
                return str + "-inator " + String.valueOf(length) + "000";
            }
        }
        return str + "inator " + String.valueOf(length) + "000";
    }

    public static boolean doesBrickFit(int a, int b, int c, int w, int h) {
        int SHole = w * h;

        int A = a * b;
        int B = b * c;
        int C = c * a;

        if (A > SHole && B > SHole && C > SHole) {
            return false;
        }

        return true;
    }

    public static double totalDistance(double liters, double rate, int passengers, boolean conditioner) {
        if (passengers > 0) {
            rate += (0.05 * passengers);
        }

        if (conditioner) {
            rate = rate * 0.1;
        }

        return liters / rate * 100;
    }

    public static double mean(int[] arr) {
        double average = 0;
        for (int number : arr) {
            average += number;
        }

        return average / (arr.length);
    }

    public static boolean parityAnalysis(int number) {
        String[] str = String.valueOf(number).split("");
        int sum = 0;

        for (String symbol : str) {
            sum += Integer.getInteger(symbol);
        }

        if ((number % 2 == 0 && sum % 2 == 0) || (number % 2 != 0 && sum % 2 != 0)) {
            return true;
        }

        return false;
    }
}
