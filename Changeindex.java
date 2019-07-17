import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            b[i] = a[i];
        }
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                System.out.print(i+" ");
                break;
            }
        }
        
    }
}
