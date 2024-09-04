package Array;

public class MergeSortedArray {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 5, 8, 9};
        int arr2[] = {2, 4, 7, 8};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int arr[] = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        // Merging the arrays
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }

        // Adding remaining elements of arr1
        while (i < n1) {
            arr[k++] = arr1[i++];
        }

        // Adding remaining elements of arr2
        while (j < n2) {
            arr[k++] = arr2[j++];
        }

        // Printing the merged array
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
