public class UniquePath1 {
    public static void main(String[] args){
        int m=7, n=3;
        int[][] matrix = new int[m][n];

        System.out.println("Unique Path1 : " + solve(m,n,matrix));
    }

    public static int solve(int m, int n, int[][] matrix) {

        //1. check
        if(m==0 || n==0) return 0;
        if(matrix==null) return 0;
        if(matrix.length==0) return 0;

        matrix[0][0]=1;
        //2. insert the number of cases in the path as a matrix element
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                //2-1. if element in the matrix, is zero then it's not passed way
                if(matrix[i][j]==0){
                    getNumberOfCases(i, j, matrix);
                }
            }
        }

        return matrix[m-1][n-1];
    }

    public static void getNumberOfCases(int i, int j, int[][] matrix){
        int[][] directions = {
            {-1, 0},
            {0, -1}
        };

        for(int[] direction : directions){
            int x=i+direction[0];
            int y=j+direction[1];
            if(x >= 0 && y >= 0) matrix[i][j]+=matrix[x][y];
        }
    }
}
