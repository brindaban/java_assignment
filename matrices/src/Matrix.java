import java.util.Arrays;

class Matrix{
    private final int row;
    private final int column;
    private final int [][] matrix;

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

    public boolean checkDataOfThePosition(int expectedNo,int rowPosition,int columnPosition){
        return expectedNo == matrix[rowPosition][columnPosition];
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
        int [] resultData = new int[row * multiplier.column];
        int firstMatrixColumncounter = 0;
        int firstMatrixRowcounter = 0;
        int secondMatrixColumncounter = 0;
        int secondMatrixRowcounter = 0;
        int sum;

        for(int index = 0; index < row*multiplier.column; index++ ){
            sum = 0;
            for(int counter = 0; counter < column; counter++){
                sum += matrix[firstMatrixRowcounter][firstMatrixColumncounter] * multiplier.matrix[secondMatrixRowcounter][secondMatrixColumncounter];
                firstMatrixColumncounter++;
                secondMatrixRowcounter++;
            }
            resultData[index] = sum;
            firstMatrixColumncounter = secondMatrixRowcounter = 0;
            secondMatrixColumncounter = (index+1) % multiplier.column;
            firstMatrixRowcounter = (index+1) / multiplier.column;
        }
        return new Matrix(row,multiplier.column,resultData);
    }

    public int determinant(){
        return findDiterminent(matrix);
    }

    private int getSign(int index){
        if(index%2==0) return 1;
        return -1;
    }

    private int [][] getCofficentMatrix(int[][] totalMatrix,int index){
        int[][] resultMatrix = new int[totalMatrix.length-1][totalMatrix.length-1];
        for(int rowCounter=1; rowCounter<totalMatrix.length; rowCounter++){
            for(int columnCounter=0; columnCounter<totalMatrix.length; columnCounter++){
                if(index<columnCounter)
                   resultMatrix[rowCounter-1][columnCounter-1]=totalMatrix[rowCounter][columnCounter];
                if(index>columnCounter)
                    resultMatrix[rowCounter-1][columnCounter]=totalMatrix[rowCounter][columnCounter];
            }
        }
        return resultMatrix;
    }

    private int findDiterminent(int [][] currentMatrix){
        int result=0,signForPosition;
        if(currentMatrix.length==1) return currentMatrix[0][0];
        if(currentMatrix.length==2)
            return currentMatrix[0][0]*currentMatrix[1][1] - currentMatrix[0][1]*currentMatrix[1][0];
        for(int index=0;index<currentMatrix.length;index++){
            signForPosition = getSign(index);
            int [][] cofficentMatrix = getCofficentMatrix(currentMatrix,index);
            result += signForPosition * currentMatrix[0][index]*findDiterminent(cofficentMatrix);
        }
        return(result);
    }

    public Matrix transpose(){
        int [] resultMatrix = new int[row*column];
        int counter = 0;
        for(int columnCounter = 0; columnCounter<column; columnCounter++){
            for(int rowCounter = 0; rowCounter<row; rowCounter++){
                resultMatrix[counter] = matrix[rowCounter][columnCounter];
                counter++;
            }
        }
        return new Matrix(column,row,resultMatrix);
    }

    private int [][] getCofficentMatrix(int rowPosition, int columnPosition){
        int[][] cofficentMatrix = new int[row-1][column-1];
        for(int rowCounter=0; rowCounter<row; rowCounter++){
            for(int columnCounter=0; columnCounter<column; columnCounter++){
                if(rowPosition<rowCounter && columnPosition<columnCounter)
                   cofficentMatrix[rowCounter-1][columnCounter-1]=matrix[rowCounter][columnCounter];
                if(rowPosition>rowCounter && columnPosition<columnCounter)
                    cofficentMatrix[rowCounter][columnCounter-1]=matrix[rowCounter][columnCounter];
                if(rowPosition<rowCounter&&columnPosition>columnCounter)
                    cofficentMatrix[rowCounter-1][columnCounter]=matrix[rowCounter][columnCounter];
                if(rowPosition>rowCounter&&columnPosition>columnCounter)
                    cofficentMatrix[rowCounter][columnCounter]=matrix[rowCounter][columnCounter];
            }
        }
        return cofficentMatrix;

    }

    public int getSign(int rowPosition,int columnPosition){
        if((rowPosition+columnPosition)%2==0) return 1;
        return -1;
    }

    public Matrix adjoint(){
        int [] resultMatrix = new int[row*column];
        int counter = 0;
        for(int rowCounter = 0; rowCounter<row; rowCounter++){
            for(int columnCounter = 0; columnCounter<column; columnCounter++){
                resultMatrix[counter] = getSign(rowCounter,columnCounter)*findDiterminent(getCofficentMatrix(rowCounter,columnCounter));
                counter++;
            }
        }
        return new Matrix(column,row,resultMatrix).transpose();
    }
}
