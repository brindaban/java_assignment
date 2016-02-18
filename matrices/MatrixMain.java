class MatrixMain{
    public static void main(String[] args) {
        int row = 3;
        int column = 3;
        int [] firstData = {1,2,3,4,5,6,7,8,9};
        int [] secondData = {9,8,7,6,5,4,3,2,1};

        Matrix myFristMatrix = Matrix.allocateMatrix(row,column);
        Matrix mySecondMatrix = Matrix.allocateMatrix(row,column);

        myFristMatrix.storeData(firstData);
        mySecondMatrix.storeData(secondData);
        int[][] firstMatrix = myFristMatrix.getMatrix();
        int[][] secondMatrix = mySecondMatrix.getMatrix();
    }
}
