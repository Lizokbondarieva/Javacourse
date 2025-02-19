package homework1;

public class Calculate {
    int a = 10;
    int b = 2;

    public int add() {
        return a + b;
    }

    public int minus() {
        return a - b;
    }

    public int multiply() {
        return a * b;
    }

    public int divide() {
        return a / b;
    }

    public static void main(String[] args) {
        Calculate cal = new Calculate();
        System.out.println(cal.add());
        System.out.println(cal.minus());
        System.out.println(cal.multiply());
        System.out.println(cal.divide());
    }
}

