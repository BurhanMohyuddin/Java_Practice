package ATM;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account{
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    HashMap<Integer , Integer> data = new HashMap<Integer, Integer>();

    public void getLogin() throws IOException {
        int x = 1;
        do{
            try {
                data.put(952141 , 9285);
                data.put(345678 , 1275);

                System.out.println("Enter your customer number : ");
                setCustomerNumber(input.nextInt());

                System.out.println("Enter your pin number : ");
                setPinNumber(input.nextInt());
            }catch (Exception e){
                System.out.println("\n" + "Invalid Character. Only Numbers." + "\n");
                x = 2;
            }

            int cn = getCustomerNumber();
            int pn = getPinNumber();

            if(data.containsKey(cn) && data.get(cn) == pn)
            {
                getAccountType();
            }else{
                System.out.println("\n" + "Wrong Customer Number or Pin Number. " + "\n");
            }
        }while (x==1);
    }

    public void getAccountType(){
        System.out.println("Please select the account");

        System.out.println("Press 1- Checking Account");
        System.out.println("Press 2- Saving Account");
        System.out.println("Press 3- Exit" + "\n");

        int val = input.nextInt();

        switch(val){
            case 1:
                getChecking();
                break;

            case 2:
                getSaving();
                break;

            case 3:
                System.out.println("Thank you for using ATM..!");
                break;

            default:
                System.out.println("\n" + "Invalid Choice. " + "\n");
        }

    }

    public void getChecking(){
        System.out.println("Checking Account");

        System.out.println("Press 1- To Check Balance");
        System.out.println("Press 2- To Withdrawl");
        System.out.println("Press 3- To Deposit");
        System.out.println("Press 4- To Exit");
        System.out.println("Choice : ");
        int val = input.nextInt();

        switch (val){
            case 1:
                System.out.println("Account Balance : " + moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;

            case 2:
                getCheckingWithdrawlInput();
                getAccountType();
                break;

            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;

            case 4:
                System.out.println("Thank you for using this ATM");
                break;

            default:
                System.out.println("\n" + "Invalid Choice. " + "\n");
                getChecking();
        }
    }

    public void getSaving(){
        System.out.println("Saving Account : ");

        System.out.println("Press 1- To View Balance");
        System.out.println("Press 2- To Withdrawl");
        System.out.println("Press 3- To Deposit");
        System.out.println("Press 4- To Exit");
        System.out.println("Choice : ");
        int val = input.nextInt();

        switch (val){
            case 1:
                System.out.println("Saving Account Balance : " + moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;

            case 2:
                getSavingWithdrawlInput();
                getAccountType();
                break;

            case 3:
                getSavingDepositInput();
                getAccountType();
                break;

            case 4:
                System.out.println("Thank you for using this ATM");
                break;

            default:
                System.out.println("\n" + "Invalid Choice. " + "\n");
                getChecking();
        }
    }
}
