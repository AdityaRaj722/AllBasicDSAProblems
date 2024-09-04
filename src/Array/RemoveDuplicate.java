package Array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[]={4,7,8,5,2,1,4,7,9,7,5,7,4,1,4,7,3};
        System.out.println(arr.length);
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set.size());
    }
}
