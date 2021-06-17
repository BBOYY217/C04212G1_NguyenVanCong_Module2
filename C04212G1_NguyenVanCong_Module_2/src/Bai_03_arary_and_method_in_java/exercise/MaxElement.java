package Bai_03_arary_and_method_in_java.exercise;

import java.util.Scanner;

public class MaxElement {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập độ dài của mảng");
        int rows = scanner.nextInt();
        System.out.println("Nhập độ dài cột của mảng");
        int cols = scanner.nextInt();
        int[][] aRay = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Nhập phần tử tại vị trí " + i + " " + j);
                aRay[i][j] = scanner.nextInt();
            }
        }
        System.out.println("giá trị lớn nhất là :" + maxArr(aRay));
    }

    public static int maxArr(int[][] arr) {
        int max = 0;
        for (int[] each : arr) {
            for (int each2 : each) {
                if (each2 > max) {
                    max = each2;
                }
            }
        }
        return max;
    }
}
