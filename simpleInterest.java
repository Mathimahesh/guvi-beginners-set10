import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int P = sc.nextInt();
       int T = sc.nextInt();
       int R = sc.nextInt();
       double r = (double)R/100;
       double value = P*(1+r*T);
       double interest = P-value;
       double A = Math.abs(interest);
       System.out.println(Math.round(A));
        
       
       
    }
}
