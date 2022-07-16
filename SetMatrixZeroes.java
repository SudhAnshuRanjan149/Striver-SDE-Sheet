// Array Question 1

// Approach 1

class Solution {
    public void setZeroes(int[][] matrix) {
        
        boolean [][] boolarray = new boolean[matrix.length][matrix[0].length];
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0 && boolarray[i][j] == false){
                    setZeroFuntion(matrix,i,j,boolarray);
                    boolarray[i][j] = true;
                }
            }
        }
        
        System.out.println(matrix);
    }
    
    
    public void setZeroFuntion(int [][] matrix,int row,int col,boolean [][] boolarray){
        
        //set zeros in rows
        for(int cols = 0; cols < matrix[0].length;cols++){
            if(matrix[row][cols] != 0){
                matrix[row][cols] = 0;
                boolarray[row][cols] = true;
            }
        }
        
        //set zeros in cols
        for(int rows = 0; rows < matrix.length; rows++){
             if(matrix[rows][col] != 0){
                matrix[rows][col] = 0;
                boolarray[rows][col] = true;
            }
        }
    }
}