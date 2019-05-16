import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int celsius = sc.nextInt();
       double kelvin = celsius + 273.15;
       System.out.println(Math.round(kelvin));
    }
}
