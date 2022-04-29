package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Matrix<T> {

    T[][] array;
    T[][] array2;

    public Matrix() {
    }

    public T[][] getArray() {
        return array;
    }

    public T[][] getArray2() {
        return array2;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "array=" + Arrays.toString(array) +
                ", array2=" + Arrays.toString(array2) +
                '}';
    }

    // метод сумирует, отнимает, умножает и делит значения в матрице
    public void newMatrix(T[][] array, T[][] array2) {

        if (array instanceof Integer[][]) {
            Integer[][] sumMatrix = new Integer[array.length][array[0].length];
            Integer[][] diffMatrix = new Integer[array.length][array[0].length];
            Integer[][] multMatrix = new Integer[array.length][array[0].length];
            Double[][] divMatrix = new Double[array.length][array[0].length];
            for (int i = 0; i < sumMatrix.length; i++) {
                for (int j = 0; j < sumMatrix[i].length; j++) {
                    sumMatrix[i][j] = (Integer) array[i][j] + (Integer) array2[i][j];
                    diffMatrix[i][j] = (Integer) array[i][j] - (Integer) array2[i][j];
                    multMatrix[i][j] = (Integer) array[i][j] * (Integer) array2[i][j];
                    divMatrix[i][j] = Double.valueOf((Integer) array[i][j]) / Double.valueOf((Integer) array2[i][j]);
                }
            }
            System.out.println("сумма матриц :");
            printMatrix((T[][]) sumMatrix);
            System.out.println("разность матриц :");
            printMatrix((T[][]) diffMatrix);
            System.out.println("умножение матриц :");
            printMatrix((T[][]) multMatrix);
            System.out.println("деление матриц :");
            printMatrix((T[][]) divMatrix);
        } else if (array instanceof Double[][]) {
            Double[][] sumMatrix = new Double[array.length][array[0].length];
            Double[][] diffMatrix = new Double[array.length][array[0].length];
            Double[][] multMatrix = new Double[array.length][array[0].length];
            Double[][] divMatrix = new Double[array.length][array[0].length];
            for (int i = 0; i < sumMatrix.length; i++) {
                for (int j = 0; j < sumMatrix[i].length; j++) {
                    sumMatrix[i][j] = (Double) array[i][j] + (Double) array2[i][j];
                    diffMatrix[i][j] = (Double) array[i][j] - (Double) array2[i][j];
                    multMatrix[i][j] = (Double) array[i][j] * (Double) array2[i][j];
                    divMatrix[i][j] = (Double) array[i][j] / (Double) array2[i][j];
                }
            }
            System.out.println("сумма матриц :");
            printMatrix((T[][]) sumMatrix);
            System.out.println("разность матриц :");
            printMatrix((T[][]) diffMatrix);
            System.out.println("умножение матриц :");
            printMatrix((T[][]) multMatrix);
            System.out.println("деление матриц :");
            printMatrix((T[][]) divMatrix);
        } else if (array instanceof String[][]) {
            String[][] sumMatrix = new String[array.length][array[0].length];
            for (int i = 0; i < sumMatrix.length; i++) {
                for (int j = 0; j < sumMatrix[i].length; j++) {
                    sumMatrix[i][j] = (String) array[i][j] + "__" + (String) array2[i][j];
                }
            }
            System.out.println("сумма матриц :");
            printMatrix((T[][]) sumMatrix);
        }
    }

    //этот метод сетит две матрицы одного типа и одинакового размера
    public void setArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Выберете тип матрицы \n" +
                "1 - int \n" +
                "2 - double \n" +
                "3 - String");
        String str = reader.readLine();
        if (str.equals("1")) {
            Integer[][] array = new Integer[2][3];
            Integer[][] array2 = new Integer[array.length][array[0].length];
            int count = array.length * array[0].length;
            System.out.println("заполните матрицу int из " + count + " элементов");
            //заполняем матрицу с клавиатуры
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    String temp = reader.readLine();
                    array[i][j] = Integer.parseInt(temp);
                }
            }

//            // заполняем матрицу рандомом (потом необходимо удалить)
//            for (int i = 0; i < array.length; i++) {
//                for (int j = 0; j < array[i].length; j++) {
//                    array[i][j] = (int) (Math.random() * 100);
//                }
//            }

            // заполняем матрицу рандомом
            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array2[i].length; j++) {
                    array2[i][j] = (int) (Math.random() * 100);
                }
            }
            this.array = (T[][]) array;
            this.array2 = (T[][]) array2;
            // если выбрали double
        } else if (str.equals("2")) {
            Double[][] doubleArr = new Double[2][3];
            Double[][] doubleArr2 = new Double[doubleArr.length][doubleArr[0].length];
            int count = doubleArr.length * doubleArr[0].length;
            //Заполняем double матрицу с клавиатуры
            System.out.println("заполните матрицу double из " + count + " элементов");
            //заполняем матрицу с клавиатуры
            for (int i = 0; i < doubleArr.length; i++) {
                for (int j = 0; j < doubleArr[i].length; j++) {
                    String temp = reader.readLine();
                    doubleArr[i][j] = Double.parseDouble(temp);
                }
            }

            //заполняем double матрицу 1 рандомом
//            for (int i = 0; i < doubleArr.length; i++) {
//                for (int j = 0; j < doubleArr[i].length; j++) {
//                    // число double с округленное до сотых
//                    double temp = Math.ceil(((double) (Math.random() * 100)) * Math.pow(10, 2)) / 100;
//                    doubleArr[i][j] = temp;
//                }
//            }

            //заполняем double матрицу рандомом
            for (int i = 0; i < doubleArr2.length; i++) {
                for (int j = 0; j < doubleArr2[i].length; j++) {
                    // число double округленное до сотых
                    double temp = Math.ceil(((double) (Math.random() * 100)) * Math.pow(10, 2)) / 100;
                    doubleArr2[i][j] = temp;
                }
            }
            this.array = (T[][]) doubleArr;
            this.array2 = (T[][]) doubleArr2;
        } else if (str.equals("3")) { // если выбрали String
            String[][] stringArr = new String[2][3];
            String[][] stringArr2 = new String[stringArr.length][stringArr[0].length];
            int count = stringArr.length * stringArr[0].length;

            // заполняем String матрицу с клавиатуры
            System.out.println("заполните матрицу String из " + count + " элементов");
            for (int i = 0; i < stringArr.length; i++) {
                for (int j = 0; j < stringArr[i].length; j++) {
                    String imputStr = reader.readLine();
                    stringArr[i][j] = imputStr;
                }
            }

            // заполняем String матрицу рандомом
            for (int i = 0; i < stringArr2.length; i++) {
                for (int j = 0; j < stringArr2[i].length; j++) {
                    StringBuilder sb = new StringBuilder();
                    //заполняем SB символами A-Z
                    for (int k = 0; k < (int) (Math.random() * 10 + 1); k++) {
                        char ch = (char) ((Math.random() * (90 - 65) + 65));
                        sb.append(ch);
                    }
                    stringArr2[i][j] = sb.toString();
                }
            }
            this.array = (T[][]) stringArr;
            this.array2 = (T[][]) stringArr2;
        }
    }

    //Этот метод распечатывает массив
    public void printMatrix(T[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


}
