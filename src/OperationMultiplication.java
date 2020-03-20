public class OperationMultiplication extends Operation {

    @Override
    public double calculate(double firstNum, double secondNum) {
        return firstNum * secondNum;
    }

    @Override
    public String toString() {
        return "multiplication";
    }
}
