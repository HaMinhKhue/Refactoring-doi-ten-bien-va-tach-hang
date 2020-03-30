public class Calculator {
    public static final char ADDITION='+';
    public static final char SUBSTRACTION='-';
    public static final char MUTIPLICATION='*';
    public static final char DIVISION='/';

    public static int calculate(int firstOperand, int secondOperator, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOperand + secondOperator;
            case SUBSTRACTION:
                return firstOperand - secondOperator;
            case MUTIPLICATION:
                return firstOperand * secondOperator;
            case DIVISION:
                if (secondOperator != 0)
                    return firstOperand / secondOperator;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}