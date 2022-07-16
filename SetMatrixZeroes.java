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






// Approach 2
// time -> 2 * O(n * m)
// Space -> O(1)

class Solution {
    public void setZeroes(int[][] matrix) {
        int col0 = 1 , rows = matrix.length, cols = matrix[0].length;
        
        for(int i = 0; i < rows; i++){
            if(matrix[i][0] == 0) col0 = 0;
            for(int j = 1; j < cols; j++){
                if(matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;
            }
        }
        
        for(int i = rows - 1; i >= 0; i--){
            for(int j = cols - 1; j >= 1; j--){
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
            
            if(col0 == 0)
                matrix[i][0] = 0;
        }
    }
}