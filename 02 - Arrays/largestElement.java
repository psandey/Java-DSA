
class largestElement {

    public static void main(String[] args) {

        int a[] = { 4, 1, 7, 2, 3 };

        int n = a.length;

        int max = 0;
        // int ele = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] > a[max]) {
                // ele = a[i];
                max = i;
            }
        }
        System.out.println("Largest element found at position " + max);
        // System.out.println("Largest element is " + ele);
    }
}