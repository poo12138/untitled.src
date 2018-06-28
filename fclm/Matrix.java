package fclm;

public class Matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        boolean flag=false;
        int coms;
        int len=matrix.length;
        if(len==0)
            coms=0;
        else
            coms=matrix[0].length;

        int row=0;
        int com=coms-1;
        if(matrix!=null&&len>0&&coms>0)
        while(row<len&&com>=0){
            if(matrix[row][com]==target) {
                flag = true;
                break;
            }

            else if(matrix[row][com]<target){
                row++;
            }
            else{
                com--;
            }
        }else {
            return flag;
        }
        return flag;
    }
}
