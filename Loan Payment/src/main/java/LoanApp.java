import java.util.Scanner;

public class LoanApp {

        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.println("Enter the amount of the loan: ");
            int amount = scanner.nextInt();
            int months = 4;

            for(int i = 1; i < months; i++){
                int monthsRemaining=i;
                amount = amount * 90 / 100;
                System.out.println("Monthly payment " + i +" remaining: $" + amount);

            }
        }
    }
