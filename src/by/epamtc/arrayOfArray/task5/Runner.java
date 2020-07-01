package by.epamtc.arrayOfArray.task5;

import by.epamtc.arrayOfArray.PrinterMatrix;

import java.util.List;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        int[][] matrix1= new int[][]{{2,0,-1},{0,-2,2}};
        int [][]matrix2= new int [][]{{4,1,0},{3,2,1},{0,1,0}};
        int[][] result = MatrixOperations.matrixMulMatrix(matrix1, matrix2);
        PrinterMatrix.arrayPrint(result);
        

    }
}
