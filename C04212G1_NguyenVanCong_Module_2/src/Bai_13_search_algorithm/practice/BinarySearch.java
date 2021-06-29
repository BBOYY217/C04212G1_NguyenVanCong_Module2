package Bai_13_search_algorithm.practice;

public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    public static void main(String[] args) {
        int result = binarySearch(list, 0);
        if (result >= 0) {
            System.out.println("tìm ra phần tử cần tìm tại vị trí: " + result);
        } else {
            System.out.println("Không tìm thấy phần tử đó trong mảng");
        }

    }

    static int binarySearch(int[] list, int value) {
        int left = 0;
        int right = list.length - 1;

        while (right >= left) {
            int mid = (left + right) / 2;
            if (value == list[mid]) {
                return mid;
            } else if (value < list[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
