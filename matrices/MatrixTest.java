import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.Arrays;


public class MatrixTest {

    @Test
    public void storeDataInMatrix(){
        int row = 3;
        int column = 3;
        int [] firstData = {1,2,3,4,5,6,7,8,9};
        int [] secondData = {9,8,7,6,5,4,3,2,1};

        Matrix myFirstMatrix = new Matrix(row,column,firstData);
        Matrix mySecondMatrix = new Matrix(row,column,secondData);

        int[][] firstMatrix = myFirstMatrix.getMatrix();
        int[][] secondMatrix = mySecondMatrix.getMatrix();

        assertEquals(9,secondMatrix[0][0]);
        assertEquals(5,secondMatrix[1][1]);
        assertEquals(9,firstMatrix[2][2]);
        assertEquals(4,firstMatrix[1][0]);
    }

    @Test
    public void addMatrix(){
        int row = 3;
        int column = 3;
        int [] firstData = {1,2,3,4,5,6,7,8,9};
        int [] secondData = {9,8,7,6,5,4,3,2,1};

        Matrix myFirstMatrix = new Matrix(row,column,firstData);
        Matrix mySecondMatrix = new Matrix(row,column,secondData);

        Matrix resultMatrix = myFirstMatrix.addMatrix(mySecondMatrix.getMatrix());

        assertEquals(10,resultMatrix.getMatrix()[0][0]);
        assertEquals(10,resultMatrix.getMatrix()[1][0]);
        assertEquals(10,resultMatrix.getMatrix()[2][2]);
        assertEquals(1,myFirstMatrix.getMatrix()[0][0]);
    }

    // @Test
    // public void multiplyTwoMatrix(){
    //     int row = 3;
    //     int column = 3;
    //     int [] firstData = {1,2,3,4,6,7,5,2,1};
    //     int [] secondData = {2,3,1,6,4,2,7,3,1};
    //
    //     Matrix myFirstMatrix = new Matrix(row,column,firstData);
    //     Matrix mySecondMatrix = new Matrix(row,column,secondData);
    //
    //     Matrix resultMatrix = myFirstMatrix.multiplyMatrix(mySecondMatrix.getMatrix());
    //
    //     assertEquals(93,resultMatrix.getMatrix()[1][0]);
    //
    // }

}
