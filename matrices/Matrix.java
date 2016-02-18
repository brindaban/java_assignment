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

    public int getDataOfThePosition(int row,int column){
        return matrix[row][column];
    }

    public Matrix addMatrix(Matrix addent){
        int []resultData = new int[row * column];
        int rowCounter = 0;
        int columnCounter = 0;
        int counter = 0;
        while(rowCounter<row){
            resultData[counter] = matrix[rowCounter][columnCounter]+addent.matrix[rowCounter][columnCounter];
            columnCounter++;
            counter++;
            if(columnCounter==column){
                columnCounter = 0;
                rowCounter++;
            }
        }
        return new Matrix(row,column,resultData);
    }

    public Matrix multiplyMatrix(Matrix multiplier){
        int [] resultData = new int[row * column];
        int firstMatrixColumncounter = 0;
        int firstMatrixRowcounter = 0;
        int secondMatrixColumncounter = 0;
        int secondMatrixRowcounter = 0;

        int sum;
        for(int index = 0; index < row*column; index++ ){
            sum = 0;
            for(int counter = 0; counter < column; counter++){
                sum += matrix[firstMatrixRowcounter][firstMatrixColumncounter] * multiplier.matrix[secondMatrixRowcounter][secondMatrixColumncounter];
                firstMatrixColumncounter++;
                secondMatrixRowcounter++;
            }
            resultData[index] = sum;
            firstMatrixColumncounter = secondMatrixRowcounter = 0;
            secondMatrixColumncounter = (index+1) % column;
            firstMatrixRowcounter = (index+1)/column;
        }
        return new Matrix(row,column,resultData);
    }
}
