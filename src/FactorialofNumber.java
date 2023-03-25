class FactorialofNumber {
    public static void factorial(int n) {
        int num=1;
        for (int i =1; i<=n ; i++) {
            num = num * i;
        }
        System.out.println("Factorial of a " +num);
    }

    public static void main(String[] args) {
        factorial(5);
    }
}

