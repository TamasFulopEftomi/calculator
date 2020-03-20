public abstract class Operation implements IOperation {

    public static Operation create(int operationNum) {
        switch (operationNum) {
            case 1:
                return new OperationSummation();
            case 2:
                return new OperationSubtraction();
            case 3:
                return new OperationMultiplication();
            case 4:
                return new OperationDivision();
            default:
                System.exit(0);
        }
        return null;
    }

    @Override
    public abstract double calculate(double firstNum, double secondNum);

    }

