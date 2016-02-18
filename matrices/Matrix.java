import java.util.Arrays;

class Matrix{
    private int row;
    private int column;
    private int [][] matrix;

    public Matrix(int rowSize,int columnSize,int[]data){
        row = rowSize;
        column = columnSize;
        matrix = new int[row][column];
        storeData(data);
    }

    private void storeData(int [] data){
        int rowCounter = 0;
        int columnCounter = 0;
        int counter = 0;
        while(counter<data.length){
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

    public Matrix addMatrix(int[][] addent){
        int []resultData = new int[row * column];
        int rowCounter = 0;
        int columnCounter = 0;
        int counter = 0;
        while(rowCounter<row){
            resultData[counter] = matrix[rowCounter][columnCounter]+addent[rowCounter][columnCounter];
            columnCounter++;
            counter++;
            if(columnCounter==column){
                columnCounter = 0;
                rowCounter++;
            }
        }
        return new Matrix(row,column,resultData);
    }

    // public Matrix multiplyMatrix(int [][] multiplier){
    //     int [] resultData = new
    // }
}
