package ro.fasttrackit.reCurs15.recursive;

public class SumNumbers {
    public int sum(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return sum(n - 1) + n;
        }
    }
}
