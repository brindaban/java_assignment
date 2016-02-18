import java.util.Arrays;

class Matrix{
    private int row;
    private int column;
    private int [][] matrix;

    private Matrix(int rowSize,int columnSize){
        row = rowSize;
        column = columnSize;
        matrix = new int[row][column];
    }

    public static Matrix allocateMatrix(int rowSize,int columnSize){
        return new Matrix(rowSize,columnSize);
    }

    // public void storeData(int [][] data){
    //     matrix = data;
    // }

    public void storeData(int [] data){
        int rowCounter = 0;
        int columnCounter = 0;
        int counter = 0;
        while(rowCounter<row){
            matrix[rowCounter][columnCounter] = data[counter];
            counter++;
            columnCounter++;
            if(columnCounter==column){
                columnCounter = 0;
                rowCounter++;
            }
        }
    }

    public int[][] getMatrix(){
        return matrix;
    }
}
