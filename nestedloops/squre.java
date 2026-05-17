package nestedloops;
import java.util.Scanner;;
public class squre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            for(int j =0; j<=n; j++){
              if(i==1 || j==0 || i==n|| j==n){
                System.out.print("*");
              }else{
                System.out.print(" ");
              }
            }
            System.out.println();
        }
    }
}
