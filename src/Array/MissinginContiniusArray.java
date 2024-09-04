package Array;

public class MissinginContiniusArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,7};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int a=n+1;
        int total=(a*(a+1))/2;
        int ans=total-sum;
        System.out.println(ans);
    }
}
