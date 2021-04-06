package tasks;

public class Task1 {
    public static int convert(int minutes) {
        return minutes * 60;
    }

    public static int points(int x2, int x3) {
        return x2 * 2 + x3 * 3;
    }

    public static int footballPoints(int win, int draw, int defeat) {
        return win * 3 + draw * 1;
    }

    public static boolean divisibleByFive(int number) {
        return number % 5 == 0;
    }

    public static boolean and(boolean a, boolean b) {
        return a && b;
    }

    public static int howManyWalls(int n, int w, int h) {
        return n / (w * h);
    }

    public static int squared(int b) {
        return  b * b;
    }

    public static boolean profitableGamble(float prob, int prize, int pay) {
        return prob * prize > pay;
    }

    public static int frames(int frame, int minutes) {
        return frame *  minutes * 60;
    }

    public static int mod(int a, int b) {
        while (a - b > 0) a -= b;
        return a;
    }
}
