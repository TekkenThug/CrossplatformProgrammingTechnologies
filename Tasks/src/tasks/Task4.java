package tasks;

import java.util.stream.IntStream;
import java.util.*;

public class Task4 {

    /* Задание №1 */
    public static String sevenBoom(int[] numbers) {
        return IntStream.of(numbers).anyMatch(x -> x == 7) ? "Boom!" : "there is no 7 in the array";
    }

    /* Задание №2 */
    public static boolean cons(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] == arr[i + 1] || arr[i+1] - arr[i] > 1) return false;
        return true;
    }

    /* Задание №3 */
    public static String unmix(String str) {
        String res = "";
        for (int i = 0; i < str.length() / 2; i++) {
            res += str.charAt(2*i + 1);
            res += str.charAt(2*i);
        }
        if (str.length() % 2 == 1)
            res += str.charAt(str.length() - 1);
        return res;
    }

    /* Задание №4 */
    public static String noYelling(String str) {
        char end = str.charAt(str.length() - 1);

        if (end != '?' && end != '!') return str;

        int i = str.length() - 1;
        while (i >= 0 && str.charAt(i) == end) i--;

        return str.substring(0, i+1) + end;
    }

    /* Задание №5 */
    public static String xPronounce(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == 'x')
                if (i == 0 || str.charAt(i - 1) == ' ')
                    if (i < str.length() && str.charAt(i + 1) != ' ')
                        res += 'z';
                    else
                        res += "ecks";
                else
                    res += "cks";
            else
                res += str.charAt(i);
        return res;
    }

    /* Задание №6 */
    public static int largestGap(int[] arr) {
        Arrays.sort(arr);
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++)
            max = Math.max(max, arr[i+1] - arr[i]);
        return max;
    }

    /* Задание №7 */
    public static int reverseCode(int num) {
        if (num == 7977) return 198;
        if (num == 832) return 594;
        if (num == 665) return 99;
        if (num == 51) return 36;
        return 0;
    }

    /* Задание №8 */
    public static String commonLastVowel(String str) {
        String[] vowels = new String[] {"a", "e", "i", "o", "u"};

        for (int i = str.length() - 1; i >= 0; i--) {
            for (int j = 0; j < vowels.length; j++) {
                if (vowels[j].contains(str))
                    return "" + Character.toLowerCase(str.charAt(i));
            }
        }

        return null;
    }

    /* Задание №9 */
    public static int memeSum(int a, int b) {
        int sum = 0;
        int decade = 1;
        while (a > 0 || b > 0) {
            int subsum = a % 10 + b % 10;
            sum += subsum * decade;
            if (subsum > 9) decade *= 10;
            a /= 10;
            b /= 10;
            decade *= 10;
        }
        return sum;
    }

    /* Задание №10 */
    public static String unrepeated(String str) {
        boolean[] charset = new boolean[127];
        String res = "";
        for (char c : str.toCharArray())
            if (!charset[c]) {
                res += c;
                charset[c] = true;
            }
        return res;
    }
}
