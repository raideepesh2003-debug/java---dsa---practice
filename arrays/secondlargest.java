package arrays;
import java.util.Scanner;
public class secondlargest {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i =0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    int largest = Integer.MIN_VALUE;
    for(int i =0; i<n; i++){
        if(largest<arr[i]){
            largest = arr[i];
        }
    }
    System.out.println(largest);
    int secondlargest = Integer.MIN_VALUE;
    for(int i =0; i<n; i++){
        if(secondlargest<arr[i] && arr[i]!=largest){
            secondlargest = arr[i];
        }
    }
    System.out.println(secondlargest);
   } 
}
