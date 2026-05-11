package twoDarray;
import java.util.*;

class Solution {
        public boolean isToeplitzMatrix(int[][] matrix, int m, int n) {
          // write code here
          boolean toeplitz = true;
          for(int i =1; i<m; i++){
            for(int j =1; j<n; j++){
                if(matrix[i][j] != matrix[i-1][j-1]){
                    toeplitz = false;
                    break;
                }
            }
          }
          return toeplitz;
       }
}

public class toeplitz {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] A = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        Solution Obj = new Solution();
        boolean ans = Obj.isToeplitzMatrix(A,m,n);
        System.out.println(ans);
    }
}