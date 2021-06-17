package Bai_04_class_and_oop_in_java.exercise;

import Bai_05_advanced_programming_with_java.exercise.Circle;

public class StopWatch extends Circle {
    private long starTime;
    private long endTime;

    private static int number = 10;

    public static void getNumber(){
        getNumber2();
        System.out.println("number  = " );
    }
    public static void getNumber2(){
        System.out.println("number  = " );
    }

    public StopWatch() {
        this.starTime = System.currentTimeMillis();
    }

    public long start() {
        this.starTime = System.currentTimeMillis();
        return this.starTime;
    }



    public long stop() {
        this.endTime = System.currentTimeMillis();
        return this.endTime;
    }

    public void thuatToan() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public long getElapsedTime() {
        return this.endTime - this.starTime;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        StopWatch stopWatch = new StopWatch();
        System.out.println("thời gian bắt đầu :" + stopWatch.start());
        System.out.println("chạy thuật toán: ");
        stopWatch.thuatToan();
        System.out.println("DỪNG :" + stopWatch.stop());
        System.out.println("thời gian chạy :" + stopWatch.getElapsedTime());
    }
}