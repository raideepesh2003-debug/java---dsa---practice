package loops;
import java.util.Scanner;
public class printdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int rev = 0;
        int count = 0;
        while(num%10 == 0){
            count++;
            num = num/10;
        }
        while(n>0){
        int lastdig = n%10;
          rev = rev*10 + lastdig;
          n /= 10;
        }
        while(rev>0){
            int lastDig = rev%10;
            rev = rev/10;
            System.out.println(lastDig);
        }
        System.out.println(count);
        for(int i =1; i<=count; i++){
            System.out.println("0");
        }
    }
}
