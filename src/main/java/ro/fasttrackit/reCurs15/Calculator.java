package ro.fasttrackit.reCurs15;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int impartit(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public int inmultit(int a, int b) {
        return a * b;
    }
}
