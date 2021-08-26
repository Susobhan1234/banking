import java.util.*;
import java.text.*;

public class CurrencyFormate2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat nu = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nu.format(payment);

        NumberFormat iu = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        String india = iu.format(payment);

        NumberFormat cu = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = cu.format(payment);

        NumberFormat f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = f.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
