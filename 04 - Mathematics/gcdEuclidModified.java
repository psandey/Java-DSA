
class gcdEuclidModified {

    static int cal(int a, int b) {
        // System.out.println(a+" "+b);
        if (a < b)
            return cal(b, a);
        if (a % b == 0)
            return b;
        return cal(a % b, b);
    }

    public static void main(String[] args) {

        System.out.println(cal(12, 24));

    }
}