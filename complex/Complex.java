class Complex{
    private int real;
    private int imaginary;

    public Complex(int realNo, int imaginaryNo){
        real = realNo;
        imaginary = imaginaryNo;
    }

    public int getRealNo(){
        return real;
    }

    public int getImaginaryNo(){
        return imaginary;
    }

    public String toString(){
        if(imaginary==0)
            return real+"";
        if(real == 0)
            return imaginary+"i";
        if(imaginary<0)
            return real+""+imaginary+"i";
        return real+"+"+imaginary+"i";
    }

    public Complex add(Complex addent){
        int anotherRealNo = real + addent.real;
        int anotherImaginaryNo = imaginary + addent.imaginary;
        return new Complex(anotherRealNo,anotherImaginaryNo);
    }

    public Complex substract(Complex addent){
        int anotherRealNo = real - addent.real;
        int anotherImaginaryNo = imaginary - addent.imaginary;
        return new Complex(anotherRealNo,anotherImaginaryNo);
    }

    public Complex multiply(Complex multiplier){
        int anotherRealNo = real*multiplier.real - imaginary*multiplier.imaginary;
        int anotherImaginaryNo = real*multiplier.imaginary + imaginary*multiplier.real;
        return new Complex(anotherRealNo,anotherImaginaryNo);
    }

    public Complex divide(Complex multiplier){
        Complex numerator = multiply(new Complex(multiplier.real , -multiplier.imaginary));
        int denominator = multiplier.multiply(new Complex(multiplier.real , -multiplier.imaginary)).real;
        int anotherRealNo = numerator.real/denominator;
        int anotherImaginaryNo = numerator.imaginary/denominator;
        return new Complex(anotherRealNo,anotherImaginaryNo);
    }

    public Complex conjugate(){
        return new Complex(real,-imaginary);
    }

    public double getDistanceFromOriginInPolarCordinate(){
        double distance;
        distance = Math.sqrt((real*real)+(imaginary*imaginary));
        return distance;
    }
}
