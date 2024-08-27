package A2zDSA;

public class RotateMatrix90deg {
    public static void main(String[] args) {
        int[][] matrix={
                {4,6,8},
                {7,2,3},
                {12,45,78}
        };
        //   first we transpose the matrix
        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = i+1; j < matrix[i].length; j++) {
                if (i!=j){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
        System.out.println("transpose of matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("matrix after rotation 90 degree");
//        now reverse every row
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length-j-1; j++) {
               int temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-j-1];
                matrix[i][matrix.length-j-1]=temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
