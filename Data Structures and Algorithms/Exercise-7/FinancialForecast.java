import java.util.Scanner;

public class FinancialForecast {

    public static double forecast(int years, double amount, double rate) {
        if (years == 0) {
            return amount;
        }
        return forecast(years - 1, amount, rate) * (1 + rate);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter growth rate (e.g., 0.1 for 10%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        double result = forecast(years, amount, rate);
        System.out.printf("After %d years, the forecasted value is Rs%.2f%n", years, result);

        sc.close();
    }
}
