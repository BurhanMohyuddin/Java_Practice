package Calculator;

public class Divide implements Operate{
    @Override
    public Double getResult(Double... numbers) {
        Double result = numbers[0];

        try{
            for(int i = 1; i<numbers.length; i++){
                result /=numbers[i];
            }
        }catch (ArithmeticException e)
        {
            System.out.println("Divided by zero operation cannot possible");
        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(
//                    "Index out of size of the array");
//        }

        return result;
    }
}
