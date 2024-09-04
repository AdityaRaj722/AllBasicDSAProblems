package Array;

public class InsertionofArray {
    public static void main(String[] args) {
        int arr[]={1,7,8,9,5,2,3};
        int arr1[]={11,4,5,1,18};
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr1.length;j++){
                if(arr[i]==arr1[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
