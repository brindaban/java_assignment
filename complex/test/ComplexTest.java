import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexTest{
    @Test
    public void createAComplexNumber(){
        Complex a = new Complex(3,2);
        assertEquals(3,a.getRealNo());
        assertEquals(2,a.getImaginaryNo());
        assertEquals("3+2i",a.toString());
        Complex b = new Complex(0,-2);
        assertEquals("-2i",b.toString());
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
    public void divideTwoComplexNoWhichWillGiveARealNoResul(){
        Complex a = new Complex(1,4);
        Complex b = new Complex(1,4);
        Complex c = a.divide(b);
        assertEquals(1,c.getRealNo());
        assertEquals(0,c.getImaginaryNo());
        assertEquals("1",c.toString());
    }

    @Test
    public void divideTwoComplexNoWhichWillGiveATotalComplexNo(){
        Complex a = new Complex(-5,14);
        Complex b = new Complex(1,4);
        Complex c = a.divide(b);
        assertEquals(3,c.getRealNo());
        assertEquals(2,c.getImaginaryNo());
        assertEquals("3+2i",c.toString());
    }

    @Test
    public void giveConjugate(){
        Complex a = new Complex(-5,14);
        Complex conjugatedMatrix = a.conjugate();
        assertEquals("-5-14i",conjugatedMatrix.toString());
    }

    @Test
    public void giveDistanceOfTheComplexNoInPolarCordinatesFromOrigin(){
        Complex a = new Complex(4,-3);
        double distanceFromOrigin = a.getDistanceFromOriginInPolarCordinate();
        assertEquals(5.0,distanceFromOrigin,1.1);
    }
}
