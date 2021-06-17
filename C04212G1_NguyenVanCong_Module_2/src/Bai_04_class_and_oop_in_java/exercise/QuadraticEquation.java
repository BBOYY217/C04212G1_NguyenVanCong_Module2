package Bai_04_class_and_oop_in_java.exercise;

import java.util.Scanner;
public class QuadraticEquation {
    public static Scanner sc = new Scanner(System.in);
    //    Khai báo các giá trị
    double a,b,c;
    double x1,x2;
    double delTa;
    public QuadraticEquation() {
    }
    public QuadraticEquation(double a ,double b , double c ) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //    Tính delta
    public double getDelTa() {
        delTa = (Math.pow(b, 2))-4*this.a*this.c;
        return delTa;
    }
    //    1 nghiệm duy nhất khi a = 0 và b khác 0
    public double oneExperiences() {
        x1 = -c/b;
        return x1;
    }
    //    trường hợp nghiệm kép
    public String Experiences() {
        return "{x1 = x2 = "+((-this.b)/2*this.a)+"}";
    }
    //    2 nghiệm phân biệt
    public void twoExperiences() {
        x1 = (-this.b+Math.sqrt(delTa))/(2*this.a);
        x2 = (-this.b-Math.sqrt(delTa))/(2*this.a);
        System.out.println("có 2 nghiệm phân biệt :"+x1+" va "+x2);

    }
    public static void main(String[] args) {

        System.out.println("nhập số a");
        double a = sc.nextDouble();
        System.out.println("nhập số b");
        double b = sc.nextDouble();
        System.out.println("nhập số c");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (a==0) {
            if (b==0) {
                System.out.println("co vo so nghiem");
            }else {
                System.out.println("co 1 nghiem duy nhat :"+quadraticEquation.oneExperiences());
            }
        }else if (quadraticEquation.getDelTa()<0) {
            System.out.println("phương trình vô nghiệm");
        }else if (quadraticEquation.getDelTa()==0) {
            System.out.println("phương trình vô số nghiệm: "+quadraticEquation.Experiences());
        }else {
            quadraticEquation.twoExperiences();
        }
    }

}