package loops;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int rev = 0;
        while(n>0){
         int lastdig = n%10;
         rev = rev*10 + lastdig;
         n /=10;
        }
        if(rev == num){
            System.out.println("True ");
        }else{
            System.out.println("False ");
        }
    }
}
