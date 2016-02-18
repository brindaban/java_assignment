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



        assertEquals(9,mySecondMatrix.getDataOfThePosition(0,0));
        assertEquals(5,mySecondMatrix.getDataOfThePosition(1,1));
        assertEquals(9,myFirstMatrix.getDataOfThePosition(2,2));
        assertEquals(4,myFirstMatrix.getDataOfThePosition(1,0));
    }

    @Test
    public void addMatrix(){
        int row = 3;
        int column = 3;
        int [] firstData = {1,2,3,4,5,6,7,8,9};
        int [] secondData = {9,8,7,6,5,4,3,2,1};

        Matrix myFirstMatrix = new Matrix(row,column,firstData);
        Matrix mySecondMatrix = new Matrix(row,column,secondData);

        Matrix resultMatrix = myFirstMatrix.addMatrix(mySecondMatrix);

        assertEquals(10,resultMatrix.getDataOfThePosition(0,0));
        assertEquals(10,resultMatrix.getDataOfThePosition(1,0));
        assertEquals(10,resultMatrix.getDataOfThePosition(2,2));
        assertEquals(1,myFirstMatrix.getDataOfThePosition(0,0));
    }

    @Test
    public void multiplyTwoMatrix(){
        int row = 3;
        int column = 3;
        int [] firstData = {1,2,3,4,6,7,5,2,1};
        int [] secondData = {2,3,1,6,4,2,7,3,1};

        Matrix myFirstMatrix = new Matrix(row,column,firstData);
        Matrix mySecondMatrix = new Matrix(row,column,secondData);

        Matrix resultMatrix = myFirstMatrix.multiplyMatrix(mySecondMatrix);

        assertEquals(35,resultMatrix.getDataOfThePosition(0,0));
        assertEquals(20,resultMatrix.getDataOfThePosition(0,1));
        assertEquals(93,resultMatrix.getDataOfThePosition(1,0));



    }

}
