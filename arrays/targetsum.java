package arrays;
import java.util.Scanner;
public class targetsum {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
     int arr[] = new int[n];
    for(int i =0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("Enter your check number ");
    int k = sc.nextInt();
    boolean target = false;
    for(int i =0; i<n; i++){
        for(int j =i+1; j<n; j++){
            if(arr[i] + arr[j] == k){
                target = true;
                break;
            }
        }
        if(target)break;
    }
    if(target){
        System.out.println("True");
    }else{
        System.out.println("false");
    }
   } 
}
