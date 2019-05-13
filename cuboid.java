import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        System.out.print((2*(l*w+w*h+h*l)));
        System.out.print(" "+(l*w*h));
        
      
    }
}
