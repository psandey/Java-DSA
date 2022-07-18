// GCD or HCF of two numbers

class gcd {

    static int cal(int a, int b) {
        System.out.println(a + " " + b);
        if (a == b)
            return a;
        if (a < b)
            return cal(b, a);
        return cal(a - b, b);
    }

    public static void main(String[] args) {

        System.out.println(cal(12, 24));

    }
}