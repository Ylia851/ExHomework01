import java.util.Arrays;

public class task01 {
    public static void main(String[] args){
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int[] arrDif = difOfArr(arr1, arr2);
        System.out.println(Arrays.toString(arrDif));
    }

    private static int[] difOfArr(int[] arr1, int[] arr2){
        if(arr1 == null || arr2 == null){
            throw new RuntimeException("Some arrays is null");
        }
    }

}