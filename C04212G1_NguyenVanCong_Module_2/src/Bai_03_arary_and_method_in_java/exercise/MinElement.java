package Bai_03_arary_and_method_in_java.exercise;

import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ đài của mảng ");
        int element = scanner.nextInt();

        int[] size = new int[element];

        for (int i = 0; i < size.length; i++) {
            System.out.println("nhập phần tử vào vị trí " + i);
            size[i] = scanner.nextInt();
        }
        int min = size[0];
        for (int i = 0; i < size.length; i++) {
            min = size[0];
            if (size[i] < min) {
                min = size[i];
            }
        }
        System.out.print("Phần tử nhỏ nhất trong mảng là: "+min);
    }
}
