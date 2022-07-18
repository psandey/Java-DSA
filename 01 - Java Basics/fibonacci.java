// WAP to print fibonacci series of n terms

import java.util.*;

class fibonacci {

    static void print(int n) {
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < n; i++) {
            n3 = n2 + n1;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of N");
        int n = input.nextInt();

        print(n);

        input.close();
    }
}
