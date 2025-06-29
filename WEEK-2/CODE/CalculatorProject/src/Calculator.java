public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Add: " + c.add(5, 3));
        System.out.println("Subtract: " + c.subtract(5, 3));
    }
}
