package LR1;

// Нахождение палиндромов
public class Palindrome {

    public static void main(String[] args) {
        String[] text = {"java", "Palindrome", "madam", "racecar", "apple", "kayak", "song", "noon"};

        for(int i = 0; i < text.length; i++) {
            String s = text[i];
            if (isPalindrome(s)) {
                System.out.println("Слово " + s + " палиндром.");
            } else {
                System.out.println("Слово " + s + " не палиндром.");
            }
        }
    }

    // Проверка на палиндром
    public static boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }

    // Создание перевернутой строки
    public static String reverseString(String inputString) {
        String outputString = "";

        for (int i = inputString.length() - 1; i >= 0; i--) {
            outputString += inputString.charAt(i);
        }

        return outputString;
    }
}
