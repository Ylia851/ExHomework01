public class task02 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int[] arrDis = disOfArr(arr1, arr2);
        System.out.println(Arrays.toString(arrDis));
    }

    private static int[] disOfArr(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            throw new RuntimeException("Some arrays is null");
        }
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Arrays length isn't equal");
        }
        int[] arr = new int[arr1.length];
        for (int i = 0; 1 < arr1.length; i++) {
            arr[i] = arr1[i] / arr2[i];
        }
    }
}
