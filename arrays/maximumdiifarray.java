package arrays;
import java.util.Scanner;
public class maximumdiifarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for(int i =0; i<n; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        int max = 0;
        for(int i =0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("maximum diff " + (max-min));
    }
}
