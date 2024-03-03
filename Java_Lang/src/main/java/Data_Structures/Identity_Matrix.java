package Data_Structures;
/*
Question
Given an N/N sized matrix of numbers.
Find the maximum size of the Identity Matrix in the lower right corner.

An Identity Matrix is a square matrix in which all the elements of the
main diagonal are 1’s and all other elements are 0's.

Examples of expected behavior:

For the following matrix, the output is 1:
2 3 4 5
6 7 8 9
2 3 4 0
3 3 3 1

For the following matrix, the output is 2:
2 3 4 5
3 3 3 3
6 7 1 0
2 3 0 1

For the following matrix, the output is 3:
4 3 9 0 2
1 2 3 4 5
6 3 1 0 0
7 6 0 1 0
3 2 0 0 1
*/

public class Identity_Matrix {
    public static int findIdentityMatrix(int [][] matrix, int size){
        int counter = 0;
        for (int i = (size - 1); i >= 0; --i){
            if (1 == matrix[i][i]){
                for (int j = 1; j <= counter; ++j){
                    if (0 != matrix[i][i + j] && 0 != matrix[i + j][i]){
                        return counter;
                    }
                }
                ++ counter;
            } else {
                break;
            }
        }
        return counter;
    }
}
