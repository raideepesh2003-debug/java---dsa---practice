package basics;
import java.util.Scanner;
public class celsiusF {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int C = sc.nextInt();
        long cf = ((C*9)/5) + 32 ; 
        System.out.println("CF " + cf);
    }
}
