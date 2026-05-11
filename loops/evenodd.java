package loops;
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your odd number ");
        int n = sc.nextInt();
        // odd numbers
        for(int i =1; i<=n; i = i+2){
            System.out.println(i);
        }
        //even numbers
        System.out.println("Enter your even number ");
        int m = sc.nextInt();
        for(int i= 2; i<=m; i = i+2){
            System.out.println(i);
        }
    }
}
