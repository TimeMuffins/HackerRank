import java.util.*;
import java.text.NumberFormat;

public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale Locale_IN = new Locale("en", "IN");

        String us     = (NumberFormat.getCurrencyInstance(Locale.US)).format(payment);
        String india  = NumberFormat.getCurrencyInstance(Locale_IN).format(payment);
        String china  = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}