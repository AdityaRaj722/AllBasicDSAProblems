package String;

public class Palindromecheck {
    public static void main(String[] args) {
        String s="madam";
        StringBuilder ss=new StringBuilder(s);
        ss.reverse();
        String a=ss.toString();
        if(s.equals(a)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
