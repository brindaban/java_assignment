import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
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



        assertTrue(mySecondMatrix.checkDataOfThePosition(9,0,0));
        assertTrue(mySecondMatrix.checkDataOfThePosition(5,1,1));
        assertTrue(myFirstMatrix.checkDataOfThePosition(9,2,2));
        assertTrue(myFirstMatrix.checkDataOfThePosition(4,1,0));
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

        assertTrue(resultMatrix.checkDataOfThePosition(10,0,0));
        assertTrue(resultMatrix.checkDataOfThePosition(10,1,0));
        assertTrue(resultMatrix.checkDataOfThePosition(10,2,2));
        assertTrue(myFirstMatrix.checkDataOfThePosition(1,0,0));
    }

    @Test
    public void multiplyTwoMatrixOfTwoCrossTwo(){
        int row = 2;
        int column = 2;
        int [] firstData = {1,2,3,4};
        int [] secondData = {2,3,1,6};

        Matrix myFirstMatrix = new Matrix(row,column,firstData);
        Matrix mySecondMatrix = new Matrix(row,column,secondData);

        Matrix resultMatrix = myFirstMatrix.multiplyMatrix(mySecondMatrix);

        assertTrue(resultMatrix.checkDataOfThePosition(4,0,0));
        assertTrue(resultMatrix.checkDataOfThePosition(15,0,1));
        assertTrue(resultMatrix.checkDataOfThePosition(10,1,0));
    }

    @Test
    public void multiplyTwoMatrixOfThreeCrossThree(){
        int row = 3;
        int column = 3;
        int [] firstData = {1,2,3,4,6,7,5,2,1};
        int [] secondData = {2,3,1,6,4,2,7,3,1};

        Matrix myFirstMatrix = new Matrix(row,column,firstData);
        Matrix mySecondMatrix = new Matrix(row,column,secondData);

        Matrix resultMatrix = myFirstMatrix.multiplyMatrix(mySecondMatrix);

        assertTrue(resultMatrix.checkDataOfThePosition(35,0,0));
        assertTrue(resultMatrix.checkDataOfThePosition(20,0,1));
        assertTrue(resultMatrix.checkDataOfThePosition(93,1,0));
    }

    @Test
    public void multiplyTwoMatrixOfDifferentOrder(){
        int [] firstData = {1,2,3,2,4,1};
        int [] secondData = {1,3,2,2,3,1};

        Matrix myFirstMatrix = new Matrix(2,3,firstData);
        Matrix mySecondMatrix = new Matrix(3,2,secondData);

        Matrix resultMatrix = myFirstMatrix.multiplyMatrix(mySecondMatrix);

        assertTrue(resultMatrix.checkDataOfThePosition(14,0,0));
        assertTrue(resultMatrix.checkDataOfThePosition(10,0,1));
        assertTrue(resultMatrix.checkDataOfThePosition(13,1,0));
    }

    @Test
    public void findDeterminentOfOneCrossOneMatrix(){
        int [] data = {4};

        Matrix myMatrix = new Matrix(1,1,data);
        int result = myMatrix.diterminent();
        assertEquals(4,result);
    }

    @Test
    public void findDeterminentOfTwoCrossTwoMatrix(){
        int [] data = {1,2,3,4};

        Matrix myMatrix = new Matrix(2,2,data);
        int result = myMatrix.diterminent();
        assertEquals(-2,result);
    }

    @Test
    public void findDeterminentOfThreeCrossThreeMatrix(){
        int [] data = {2,0,-2,0,6,-3,0,2,0};

        Matrix myMatrix = new Matrix(3,3,data);
        int result = myMatrix.diterminent();
        assertEquals(12,result);
    }

    @Test
    public void findDeterminentOfFourCrossFourMatrix(){
        int [] data = {3,0,2,-1,1,2,0,-2,4,0,6,-3,5,0,2,0};

        Matrix myMatrix = new Matrix(4,4,data);
        int result = myMatrix.diterminent();
        assertEquals(20,result);
    }
}
