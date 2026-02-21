class SumEvenRecursion {

    static int sumEven(int n) {
        if (n <= 0) {
            return 0;
        }

        if (n % 2 == 0) {
            return n + sumEven(n - 2);
        } else {
            return sumEven(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sum of even numbers = " + sumEven(n));
    }
}

 