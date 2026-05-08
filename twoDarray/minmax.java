package twoDarray;
import java.util.Scanner;

public class minmax {
    public static int maximaMinima(int[][] mat) {
        //Write code here
        int n = mat.length;
        for(int i =0; i<n; i++){
            int min = mat[i][0];
            int col = 0;
            for(int  j =1; j<n; j++){
                if(mat[i][j]<min){
                    min = mat[i][j];
                    col=j;
                }
            }
            boolean largest = true;
            for(int k =0; k<n; k++){
                if(mat[k][col]>min){
                    largest = false;
                    break;
                }
            }
            if(largest){
                return min;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        int result = maximaMinima(matrix);
        System.out.println(result);
        sc.close();
    }
}