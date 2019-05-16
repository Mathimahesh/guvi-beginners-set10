import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int val = 1,r = 0;
       while(a>0){
           r = a%10;
           a/=10;
           val*=r;
       }
       System.out.println(val);
       
    }
}
