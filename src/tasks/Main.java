package tasks;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        /**
         * Задача 2
         * Напишите общий метод, который возвращает минимальное значение из
         * трех переданных параметров.
         */
        System.out.println("********Task 2********");
        System.out.println("Минимальное число int : " + minValue(1, 10, 2));
        System.out.println("Минимальное число double : " + minValue(1.5, 1.1, 2.8));
        System.out.println("Минимальное количество мимволов в строке : " + minValue("sa", "ahig", "begssvsvg"));

        /**
         * Задача 4
         * Реализуйте общий метод для поиска максимального значение в массиве.
         */
        System.out.println("********Task 4********");

        //создаем массив интов
        Integer[] arr = new Integer[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        //создаем массив double
        Double[] arrDouble = new Double[10];
        for (int i = 0; i < arrDouble.length; i++) {
            double temp = ((double) (Math.random() * 100)) * Math.pow(10, 3);
            double result = Math.ceil(temp) / 1000;

            arrDouble[i] = result;
        }
        for (double x : arrDouble) {
            System.out.print(x + " ");
        }
        System.out.println();

        //Создаем массив String
        String[] arrString = {"Artem", "Tatsiana", "Alexei", "Natalia"};
        for (String x : arrString) {
            System.out.print(x + " ");
        }
        System.out.println();

        //вызываем общий метод maxValueArray
        System.out.println(maxValueArray(arr));
        System.out.println(maxValueArray(arrDouble));
        System.out.println(maxValueArray(arrString));


        System.out.println("********Task 4********");
        /**
         * Задача 8
         * Создайте общий класс Matrix. Реализуйте следующее:
         * ■ заполнение матрицы с клавиатуры;
         * ■ заполнение матрицы случайными числами;
         * ■ арифметические операции +, -, *, / по правилам
         * работа с матрицами;
         * ■ поиск максимального и минимального элемента;
         * ■ расчет среднего значения;
         */
    }

    public static <E> E maxValueArray(E[] arr) {

        E max = null;

        if (arr instanceof Integer[]) {
            Arrays.sort(arr);
            max = arr[arr.length - 1];

        } else if (arr instanceof Double[]) {
            Arrays.sort(arr);
            max = arr[arr.length - 1];

        } else if (arr instanceof String[]) {
            String str = (String) arr[0];
            int lengthStringMax = String.valueOf(str).length(); //количество символов в максимальном слове
            int index = 0; // индекс максимального слова
            for (int i = 1; i < arr.length; i++) {
                int temp = String.valueOf((String) arr[i]).length();
                if (lengthStringMax < temp) {
                    lengthStringMax = temp;
                    index = i;
                }
            }
            max = arr[index];
        }
        return max;
    }


    // Task 2
    public static <E> E minValue(E t1, E t2, E t3) {
        E result;
        // Integer
        if (t1 instanceof Integer && t2 instanceof Integer && t3 instanceof Integer) {
            result = (E) new Integer(Math.min(Math.min((Integer) t1, (Integer) t2), (Integer) t3));
            return result;

            // String
        } else if (t1 instanceof String && t2 instanceof String && t3 instanceof String) {
            //Сравнение по алфавиту
            if (((String) t1).compareTo((String) t2) < 0 &&
                    ((String) t1).compareTo((String) t3) < 0) {
                System.out.println("Сравнение по афавиту строк : " + (String) t1);
            } else if (((String) t2).compareTo((String) t1) < 0 &&
                    ((String) t2).compareTo((String) t3) < 0) {
                System.out.println("Сравнение по афавиту строк : " + (String) t2);
            } else {
                System.out.println("Сравнение по афавиту строк : " + (String) t3);
            }

            //находим длинну строк
            int strT1 = (int) String.valueOf(t1).length();
            int strT2 = (int) String.valueOf(t2).length();
            int strT3 = (int) String.valueOf(t3).length();

            int minLength = Math.min(Math.min(strT1, strT2), strT3);//Сравнение по длинне строки
            return minLength == strT1 ? t1 : minLength == strT2 ? t2 : t3;//возвращаем минимальную строку
        } else if (t1 instanceof Double && t2 instanceof Double && t3 instanceof Double) {
            result = (E) new Double(Math.min(Math.min((Double) t1, (Double) t2), (Double) t3));
            return result;
        }

        throw new IllegalArgumentException("Error");
    }
}
