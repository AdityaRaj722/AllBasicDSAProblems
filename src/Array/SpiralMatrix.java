package Array;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int n=matrix.length;
        int m=matrix[0].length;
        System.out.println("SpiralMatrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int ans[]=new int[n*m];
        int rowS=0,colS=0;
        int rowE=n-1;
        int colE=m-1;
        int k=0;
        while(rowS<=rowE && colS<=colE ){

            //right
            for(int i=colS;i<=colE;i++){
                ans[k++]=matrix[rowS][i];
            }
            rowS++;
            //down
            for(int i=rowS;i<=rowE;i++){
                ans[k++]=matrix[i][colE];
            }
            colE--;
            //left
            if(rowS <= rowE){
                for(int i=colE;i>=colS;i--){
                    ans[k++]=matrix[rowE][i];
                }
            }
            rowE--;
            //up
            if(colS <= colE){
                for(int i=rowE;i>=rowS;i--){
                    ans[k++]=matrix[i][colS];
                }
            }
            colS++;
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
