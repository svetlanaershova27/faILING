public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        int result;
        try { if (b == 0){
            throw new ArithmeticException("вы поделили на ноль");
        }} catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
            //перехватываем, и, если не получилось,
            // Сообщаем, что произошло
        } result = a/b;
        return result;
    }
}
