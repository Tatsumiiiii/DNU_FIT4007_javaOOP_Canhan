package part7.methods;

public class Example21ReverseArray {
    public static void printArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Mang rong");
            return;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static int[] reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return arr;
    }
}
