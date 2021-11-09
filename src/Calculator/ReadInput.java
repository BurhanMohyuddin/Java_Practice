package Calculator;

import java.util.Scanner;

public class ReadInput {
    public static String read(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the expression : ");

        String input = scanner.nextLine();
        scanner.close();
        return input;
    }
}
