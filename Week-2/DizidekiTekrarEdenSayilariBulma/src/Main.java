import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 2, 4, 8, 16, 20};

        Set<Integer> seenNumbers = new HashSet<>();
        Set<Integer> repeatedEvenNumbers = new HashSet<>();

        for (int number : numbers) {
            // Çift sayı kontrolü
            if (number % 2 == 0) {
                // Eğer sayı daha önce görüldüyse ve çift ise
                if (!seenNumbers.add(number)) {
                    repeatedEvenNumbers.add(number);
                }
            }
        }

        System.out.println("Tekrar eden çift sayılar: " + repeatedEvenNumbers);
    }
}
