class MatrixMain{
    public static void main(String[] args) {
        int row = 3;
        int column = 3;
        int [] firstData = {1,2,3,4,5,6,7,8,9};
        int [] secondData = {9,8,7,6,5,4,3,2,1};

        Matrix myFirstMatrix = new Matrix(row,column,firstData);
        Matrix mySecondMatrix = new Matrix(row,column,secondData);

        int[][] firstMatrix = myFirstMatrix.getMatrix();
        int[][] secondMatrix = mySecondMatrix.getMatrix();
    }
}
