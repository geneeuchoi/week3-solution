package week03.sol;

public class SolMain {
    public static void main(String[] args) {
        Calculator calculator  = new Calculator(new AddOperation());
        System.out.println(calculator.calculate(50, 100));
        calculator.setOperation(new MultiplyOperation()); // 형변환
        System.out.println(calculator.calculate(10,10));
    }
}
