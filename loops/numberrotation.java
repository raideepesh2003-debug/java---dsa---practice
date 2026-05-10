package loops;
import java.util.Scanner;
public class numberrotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt(); 
        int num = n;
        int count =0;
        
        while(num>0){
           num = num/10;
           count++;
        }
       // System.out.println(count);
       k = k%count;
        if(k<0){
        k = k + count;
        }
        //System.out.println(k);
        int x = (int)Math.pow(10, k);
        
            int lastdig = n%x;
             n = n/x;
             int ans = lastdig*(int)Math.pow(10, count - k)  + n; 
    System.out.println(ans + " ");
    }
}