package Array;

import java.util.*;

public class kthLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int arr[]={1, 2, 5, 4, 7, 8, 9, 3, 2, 9, 7, 8, 6, 2, 1, 5, 6};
        Set<Integer> s=new HashSet<>();
        for(int a:arr){
            s.add(a);
        }
        List<Integer> list=new ArrayList<>(s);
        Collections.sort(list);
//        Collections.reverse(list);
        int n=list.size();
        System.out.println(list.get(n-k));
    }
}
