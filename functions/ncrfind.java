package functions;
import java.util.Scanner;
public class ncrfind {
    static long factorial(long n){
        long fact = 1;
        for(int i = 1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        long N = factorial(n);
        long R = factorial(r);
        long x = factorial(n-r);
        long ncr = (N)/(R*x);
        System.out.println(ncr);
    }
}
