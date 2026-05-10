package arrays;
import java.util.Scanner;
public class checknumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int x = 5;
        boolean found = false;
        for(int i =0; i<n ; i++){
            if(arr[i] == x){
                found = true;
                break;
            }
        }
       if(found){
               System.out.println("Found ");
            }else{
            System.out.println("not found");
            } 
    }
}
