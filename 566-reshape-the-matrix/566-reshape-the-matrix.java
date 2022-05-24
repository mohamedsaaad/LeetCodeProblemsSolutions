class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int orignialSize= mat.length * mat[0].length;
        if(orignialSize!= (r*c))
            return mat;

        int [] temp=new int[r*c];
        int index=0;
        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j <mat[0].length ; j++) {
                temp[index++]=mat[i][j];
            }
        }

        index=0;
        mat=new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j]=temp[index++];
            }
        }
        return mat;
        
    }
}