class secondLargestElement {

    public static void main(String[] args) {

        int a[] = { 7, 2, 1, 6, 4 };

        int largest = 0;
        int secondlargest = -1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[largest]) {
                secondlargest = largest;
                largest = i;
            } else if (a[i] < a[largest]) {
                if (secondlargest == -1 || a[i] > a[secondlargest]) {
                    secondlargest = i;
                }
            }
        }
        System.out.println("Second Largest element found at position " + secondlargest);
        // System.out.println("Second Largest element is " + a[secondlargest]);
    }
}