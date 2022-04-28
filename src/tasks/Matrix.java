package tasks;

public class Matrix<T> {

    T[][] array;
    T[][] array2;

    public Matrix(T[][] array, T[][] array2) {
        this.array = array;
        this.array2 = array2;
    }

    public T[][] getArray() {
        return array;
    }

    public T[][] getArray2() {
        return array2;
    }

    public static <T> void newArray(T[][] array, T[][] array2) {
        if (array instanceof Integer[][]){
            int [][] intArr = new int [array.length][array[0].length];

        }



    }
}
