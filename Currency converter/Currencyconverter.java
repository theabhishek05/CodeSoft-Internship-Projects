import java.util.Scanner;
import java.util.HashMap;

public class Currencyconverter {


    private static HashMap<String, Double> rates = new HashMap<>();

    public static void main(String[] args){
        rates.put("USD", 1.0);
        rates.put("EUR", 0.96);
        rates.put("INR", 83.12);
        rates.put("JPY", 150.01);

        Scanner sc= new Scanner(System.in);

        System.out.println("Available currencies: USD, EUR, INR, JPY");
        System.out.print("Enter base currency (e.g., USD): ");
        String baseCurrency =  sc.next().toUpperCase();

        System.out.print("Enter the target currency (e.g., INR): ");
        String targetCurrency = sc.next().toUpperCase();


        if (!rates.containsKey(baseCurrency) || !rates.containsKey(targetCurrency)){
            System.out.println("Invalid currency code entered.");
            return;
        }

         System.out.print("Enter the amount to convert: ");
        double amount = sc.nextDouble();

        double  baseToUSD = amount /rates.get(baseCurrency);
        double convertedAmount = baseToUSD * rates.get(targetCurrency);

        System.out.printf("Converted amount: %.2f %s%n", convertedAmount, targetCurrency);
    }
}
