import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int r = 0;
       String val = "";
       while(n>0){
           r = n%10;
           n /=10;
           val += Integer.toString(r);
       }
       System.out.println(val);
       
    }
}
