package arrays;
import java.util.Scanner;
     public class mathoperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter array size ");
        int n = scanner.nextInt();
        int[] arr = new int [n];
        System.out.println("enter array element");
        for(int i =0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        int sum =0;
        int max = Integer.MIN_VALUE;
        for(int e : arr){
           sum += e;
           if(max<e){
            max = e;
           }
        }
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
              min = arr[i];
            }
        }
        System.out.println("sum  "+ sum + " ");
        System.out.println("avg  "+sum/arr.length + " ");
        System.out.println("max  "+max+ " ");
        System.out.println("min  "+min+ " ");
    }
}

       
    
 