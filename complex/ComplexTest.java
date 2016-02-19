import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.Arrays;

public class ComplexTest{
    @Test
    public void createAComplexNumber(){
        Complex a = new Complex(3,2);
        assertEquals(3,a.getRealNo());
        assertEquals(2,a.getImaginaryNo());
        assertEquals("3+2i",a.toString());
    }

    @Test
    public void addTwoComplexNo(){
        Complex a = new Complex(3,2);
        Complex b = new Complex(1,4);
        Complex c = a.add(b);
        assertEquals("4+6i",c.toString());
        assertEquals(4,c.getRealNo());
        assertEquals(6,c.getImaginaryNo());
    }

    @Test
    public void substractTwoComplexNo(){
        Complex a = new Complex(3,2);
        Complex b = new Complex(1,4);
        Complex c = a.substract(b);
        assertEquals("2-2i",c.toString());
        assertEquals(2,c.getRealNo());
        assertEquals(-2,c.getImaginaryNo());
    }

    @Test
    public void multiplyTwoComplexNo(){
        Complex a = new Complex(3,2);
        Complex b = new Complex(1,4);
        Complex c = a.multiply(b);
        assertEquals(-5,c.getRealNo());
        assertEquals(14,c.getImaginaryNo());
        assertEquals("-5+14i",c.toString());
    }

    @Test
    public void divideTwoComplexNo(){
        Complex a = new Complex(1,4);
        Complex b = new Complex(1,4);
        Complex c = a.divide(b);
        assertEquals(1,c.getRealNo());
        assertEquals(0,c.getImaginaryNo());
        // assertEquals("-5+14i",c.toString());
    }
}
