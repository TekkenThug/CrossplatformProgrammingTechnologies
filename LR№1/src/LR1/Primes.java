package LR1;

// Определение простых чисел от 2 до 100
public class Primes {

    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    // Определение, простое число или нет
    public static boolean isPrime(int n) {
        for(int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
