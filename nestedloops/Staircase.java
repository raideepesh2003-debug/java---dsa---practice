package nestedloops;
import java.util.Scanner;
public class Staircase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            for(int j =n-i; j>=1; j--){
                System.out.print(" ");
            }
            for(int j = i; j>=1; j--){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
