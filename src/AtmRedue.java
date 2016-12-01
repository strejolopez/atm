import java.util.Scanner;

/**
 * Created by strejolopez on 12/1/16.
 */
public class AtmRedue {

    public static void main(String[] args) throws Exception {
        //Create our scanner for input
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome customer");

        System.out.println("What is your name");
        String name = input.nextLine();
        if (name.equals("")) {
            throw new Exception("Error: Try again");
        }
        //Asking to choose an option
        System.out.println("Choose an option: Check Balance/Cancel/Withdraw Funds");
        String option = input.nextLine();

        if(option.equalsIgnoreCase("Check Balance")) {
            System.out.println("Your balance is $100");
        }
        else if(option.equalsIgnoreCase("Cancel")) {
            System.out.println("Thank you and please come again.");
        }
        else is(option.)






    }
}
