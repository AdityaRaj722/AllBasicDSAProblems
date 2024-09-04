package Array;

import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={1, 2, 5, 4, 7, 8, 9, 3, 2, 9, 7, 8, 6, 2, 1, 5, 6};
        int l=0;
        int sl=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>l){
                sl=l;
                l=arr[i];
            }else if(arr[i]>sl && arr[i]!=l){
                arr[i]=sl;
            }
        }

        System.out.println(sl);
    }
}
