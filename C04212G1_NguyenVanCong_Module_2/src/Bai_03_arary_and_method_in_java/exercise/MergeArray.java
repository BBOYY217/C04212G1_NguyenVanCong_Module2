package Bai_03_arary_and_method_in_java.exercise;

import java.util.Scanner;

public class MergeArray {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int i;
        System.out.println("nhập độ dài mảng 1");
        int size1 = scanner.nextInt();
        System.out.println("nhập độ dài mảng 2");
        int size2 = scanner.nextInt();

        int size3 = size1 + size2;
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        int[] arr3 = new int[size3];

        for (i = 0; i < arr1.length; i++) {
            System.out.println("nhập phần tử mảng 1 " + " tại vị trí " + i);
            arr1[i] = scanner.nextInt();
            arr3[i] = arr1[i];
        }

        for (i = 0; i < arr2.length; i++) {
            System.out.println("nhập phần tử mảng 2 " + " tại vị trí " + i);
            arr2[i] = scanner.nextInt();
            arr3[arr1.length + i] = arr2[i];
        }

        for (i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}
