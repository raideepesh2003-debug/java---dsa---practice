package basics;
import java.util.Scanner;
public class cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int LHS = (a+b)*(a+b)*(a+b);
        int RHS = (a*a*a + b*b*b + 3*a*a*b + 3*b*b*a) ;
        System.out.println(LHS);
        System.out.println(RHS);
        if(LHS == RHS){
            System.out.println("VERIFIED");
        } else{
            System.out.println("NOT VERIFIED");
        }
    }
}
