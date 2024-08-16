import java.util.*;
public class SixMethod{
    public static void main(String[]args){
        String s1="Hello";
        int len=s1.length();
        System.out.println(len);
        char ch=s1.charAt(1);
        System.out.println(ch);
        String sub=s1.substring(2);
        System.out.println(sub);
        boolean t1=s1.equals("Hello ");
        System.out.println(t1);
        String a=s1.concat("world");
        System.out.println(a);
        String b=s1.replace('l','r');
        System.out.println(b);
    }
}