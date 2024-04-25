package week03.sol;

public class Calculator {

    double result;
    //포함관계 (only AbstractOperation)
    AbstractOperation operation;

    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }

    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    public double calculate(int firstNumber, int secondNumber) {
        result = operation.operate(firstNumber, secondNumber);
        return result;
    }
}
