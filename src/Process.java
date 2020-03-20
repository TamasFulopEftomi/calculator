import java.util.Scanner;

public class Process {

    private double firstNum;
    private double secondNum;
    private int operationNum;
    private Operation operation;
    private double result;
    private Scanner sc = new Scanner(System.in);

    public void run() {
        readNumber();
        do {
            readOperation();
            calculateResult();
            displayResult();
        } while (operationNum >= 1 && operationNum <= 4);
    }

    private void readNumber() {
        System.out.print("Please give in the first number: ");
        firstNum = sc.nextDouble();
        System.out.print("Please give in the second number: ");
        secondNum = sc.nextDouble();
    }

    private void readOperation() {
        System.out.println("Please give in the number of operation:\n1. summation\n2. subtraction\n3. " +
                "multiplication\n4. division\n0.exit");
        operationNum = sc.nextInt();
        operation = Operation.create(operationNum);
    }

    private void calculateResult() {
        result = operation.calculate(firstNum, secondNum);
    }

    private void displayResult() {
        System.out.print("First number: " + firstNum + ", second number: " + secondNum + ", operation: " + operation.toString()
        + ", result: " + result + ".\n");
    }
}
