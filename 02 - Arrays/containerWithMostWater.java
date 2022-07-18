
class containerWithMostWater {

    public static int cal(int a[]) {
        int l = 0;
        int r = a.length - 1;
        int maxArea = 0;

        while (l < r) {
            // Calculating the max area

            int height = Math.min(a[l], a[r]);
            int distance = r - l;
            int area = height * distance;
            maxArea = Math.max(maxArea, area);

            // OR USE THIS
            // maxArea = Math.max(maxArea, Math.min(a[l], a[r]) * (r - l));

            if (a[l] < a[r])
                l++;

            else
                r--;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int a[] = { 1, 5, 4, 3 };
        int b[] = { 3, 1, 2, 4, 5 };

        System.out.println(cal(a));
        System.out.println(cal(b));
    }
}
