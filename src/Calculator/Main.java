package Calculator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        final String input = ReadInput.read();

        Queue<String> numbers;
        Queue<String> operators;

        String[] numberArr = input.split("[-+*/]");
        String[] operatorArr = input.split("[0-9]+");

        numbers = new LinkedList<String>(Arrays.asList(numberArr));
        operators = new LinkedList<String>(Arrays.asList(operatorArr));

        Double res = Double.parseDouble(Objects.requireNonNull(numbers.poll()));

        while(!numbers.isEmpty()){
            String opr = operators.poll();

            Operate operate;
            switch (Objects.requireNonNull(opr)) {
                case "+" :
                    operate = new Add();
                    break;

                case "-" :
                    operate = new Subtract();
                    break;

                case "*" :
                    operate = new Multiply();
                    break;

                case "/" :
                    operate = new Divide();
                    break;

                default:
                    continue;
            }

            Double num = Double.parseDouble(Objects.requireNonNull(numbers.poll()));

            res = operate.getResult(res , num);
        }
        System.out.println("Answer is : " + res);
    }

}
