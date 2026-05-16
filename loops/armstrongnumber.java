package loops;
import java.util.Scanner;
public class armstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int sum = 0;
        while(num>0){
            int lastdig = num%10;
            sum = sum+(lastdig*lastdig*lastdig);
            num/=10;
        }
        if(n == sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Non armstrong");
        }
    }
}
