package LeetCode.ListNote;

/**
* @Description:    java类作用描述
* @Author:         kirago
* @CreateDate:     2020/2/29 3:43 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class RotatePic {

    public void rotatePic(int[][] matrix){

        int len = matrix[0].length;
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        for(int i=0;i<len;i++){
            for(int j=0,k=len-1;j<k;j++,k--){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = tmp;
            }
        }

    }

    public static void main(String[] args){
        int[][] matrx = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        RotatePic rotatePic = new RotatePic();
        rotatePic.rotatePic(matrx);
    }
}
