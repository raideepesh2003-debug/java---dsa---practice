package basics;
import java.util.Scanner;
public class datatypes {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int sign = 1;
        if(x<0){
            sign = -1;
            x = -x;
        }
        int rev = 0;
        while (x > 0) {
            int lastdig = x % 10;
            rev = rev*10+lastdig;
            x = x / 10;
        }
        System.out.println("Reverse no.. "+sign*rev);
    }
}
