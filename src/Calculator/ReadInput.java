package Calculator;

import java.util.Scanner;

public class ReadInput {
    public static String read(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the expression : ");

//        String val;
//        while(true){
//            if(scanner.hasNextInt()){
//                val = scanner.nextLine();
//                break;
//            }else{
//                System.out.println("Invalid amount, enter again.");
//                scanner.nextLine();
//            }
//        }
//        scanner.close();
//        return val;

        String input = scanner.nextLine();
        scanner.close();
        return input;
    }
}
