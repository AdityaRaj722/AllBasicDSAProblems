package Array;

public class CountOccurance {
    public static void main(String[] args) {
        int arr[]={1,2,5,4,7,8,9,3,2,9,7,8,6,2,1,5,6};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int occr[]=new int[max+1];
        for(int i=0;i<max;i++){
            occr[arr[i]]++;
        }
        for (int i = 0; i < occr.length; i++) {
            if (occr[i] > 0) {
                System.out.println(i + " occurs " + occr[i] + " times");
            }
        }
    }
}
