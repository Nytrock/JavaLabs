class Triple<T1, T2, T3> {
    T1 first;
    T2 second;
    T3 third;

    public Triple(T1 first, T2 second, T3 third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ", " + third + ")";
    }
}

class Action<T1, T2, T3 extends Character> extends Triple<T1, T2, T3> {
    public Action(T1 first, T2 second, T3 third) {
        super(first, second, third);
    }

    public double calculate() {
        double firstValue, secondValue;

        if (first.getClass() == Action.class)
            firstValue = ((Action<?, ?, ?>)first).calculate();
        else
            firstValue = (int) first;

        if (second.getClass() == Action.class)
            secondValue = ((Action<?, ?, ?>)second).calculate();
        else
            secondValue = (int) second;

        char operation = third;
        double result = 0;

        switch (operation) {
            case '+':
                result = firstValue + secondValue;
                break;
            case '-':
                result = firstValue - secondValue;
                break;
            case '/':
                result = firstValue / secondValue;
                break;
            case '*':
                result = firstValue * secondValue;
                break;
        }

        return result;
    }

    @Override
    public String toString() {
        return first.toString() + " " + second.toString() + " " + third;
    }
}

public class Final {
    public static void main(String[] args) {
        Action<?, ?, ?> action1 = new Action<>(1, 2, '+');
        Action<?, ?, ?> action2 = new Action<>(1, new Action<>(4, 4, '*'), '-');
        Action<?, ?, ?> action3 = new Action<>(new Action<>(10, 2, '/'),
                new Action<>(4, 4, '*'), '-');

        calculateAction(action1);
        calculateAction(action2);
        calculateAction(action3);
    }

    public static void calculateAction(Action<?, ?, ?> action) {
        String rpn = action.toString();
        System.out.println("rpn: " + rpn + ", tuple: (" + rpn + "), result = " + action.calculate());
    }
}
