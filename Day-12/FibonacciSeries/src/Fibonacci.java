public class Fibonacci {

    public Fibonacci() {}

    public int printFibonacciNumber(int range) {

        if (range == 0) return 0;
        else if (range == 1) return 1;

        return (printFibonacciNumber(range - 1) + printFibonacciNumber(range - 2));

    }

    public void printFibonacciSeries(int range) {

        for (int i = 0; i < range; i++) {

            System.out.print(printFibonacciNumber(i) + " ");

        }

    }



}
