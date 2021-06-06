package Bai_03_arary_and_method_in_java.exercise;
import java.util.Scanner;
public class AddElement {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Nhập các phần tử của mảng: \n");
        
        int n = scanner.nextInt();
        int [] arr = new int [n];

        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.print("Nhập phần tử mới vào mảng = ");
        int k = scanner.nextInt();
        // sắp xếp dãy số theo thứ tự tăng dần
        sortASC(arr);
        System.out.print("Sắp xếp mảng tăng dần: ");
        show(arr);
        System.out.printf("\nChèn phần tử %d vào mảng.", k);
        arr = insert(arr, k);
        System.out.print("\nMảng sau khi chèn: ");
        show(arr);
    }
    public static void sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static int [] insert(int [] arr, int k) {
        int arrIndex = arr.length - 1;
        int tempIndex = arr.length;
        int [] tempArr = new int [tempIndex + 1];
        boolean inserted = false;

        for (int i = tempIndex; i >= 0; i--) {
            if (arrIndex > -1 && arr[arrIndex] > k) {
                tempArr[i] = arr[arrIndex--];
            } else {
                if (!inserted) {
                    tempArr[i] = k;
                    inserted = true;
                } else {
                    tempArr[i] = arr[arrIndex--];
                }
            }
        }
        return tempArr;
    }

    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
