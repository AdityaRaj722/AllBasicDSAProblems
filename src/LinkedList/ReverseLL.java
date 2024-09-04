package LinkedList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseLL {
    public static void print(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("NULL");
    }
    public static void reverse(Node head){
        Node curr=head;
        List<Integer> list=new ArrayList<>();
        while(curr!=null){
            list.add(curr.data);
            curr=curr.next;
        }
        Collections.reverse(list);
        Node ans=head;
        for(int a:list){
            ans.data=a;
            ans=ans.next;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(5);
        head.next=new Node(6);
        head.next.next=new Node(7);
        head.next.next.next=new Node(9);
        head.next.next.next.next=new Node(10);
        print(head);
        reverse(head);
        print(head);
    }
}
