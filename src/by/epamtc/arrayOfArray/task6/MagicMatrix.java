package by.epamtc.arrayOfArray.task6;

import java.util.Arrays;
import java.util.Scanner;

public class MagicMatrix {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter n");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];


        //инициализируем массив всех чисел, из которых будет состоять маг матрица
        int[] array = new int[n * n];
        for (int i = 0; i < n * n; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));


        //какой сумме должна равняться каждая сторона
        int sum = (n * (n * n + 1)) / 2;
        System.out.println(sum);


        int[] matr = new int[n];

        String str1 = "\u041F";
        String str2 = "\u0021";
        String str3 = "\u04F0a";
        byte[] bytes1 = str1.getBytes();
        byte[] bytes2 = str2.getBytes();
        byte[] bytes3 = str3.getBytes();
        System.out.println();
        for (byte b : bytes2) {
            System.out.print(Integer.toBinaryString(b) + " ");
        }
        System.out.println();
        for (byte b : bytes1) {
            System.out.print(Integer.toBinaryString(b) + " ");
        }
        System.out.println();

        for (int i = 0; i < bytes3.length; i++) {
            if (i != bytes3.length - 1) {
                System.out.print(Integer.toBinaryString(bytes3[i]).substring(24) + " ");
            } else {
                System.out.println(Integer.toBinaryString(bytes3[i]));
            }
        }
        System.out.println("______________");

        String str4 = "人人都爱喝可乐";
        System.out.println(str4);

        for (int i = 0; i < str4.codePointCount(0, str4.length()); i++) {
            int index = str4.offsetByCodePoints(0, i);
            int code = str4.codePointAt(index);
            int[] mas = {code};
            System.out.println(i + "-й сивол: " + Integer.toHexString(code)
                    + " " + new String(mas, 0, mas.length));
        }
        System.out.println(str4.length());

        System.out.println("______________");
        String str5 = "\uD835 \uDD0A"; //на самом деле 1 символ
        System.out.println(str5);
        System.out.println(str5.length());
        System.out.println(str5.codePointCount(0, str5.length()));


    }
}
