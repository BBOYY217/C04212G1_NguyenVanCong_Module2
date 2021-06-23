package Bai_10_list.exercise.MyLinked;

public class LinkedTest {
    public static void main(String[] args) {
        MyLinked<String> animals = new MyLinked<>();
        // Thêm phần tử vào List
        animals.addFirst("Chó");
        animals.addFirst("Mèo");
        animals.addLast("Gà");
        animals.add(1, "Chuột");
        // Hiển thị
        for (int i = 0; i < animals.size(); i++) {
            String animal = (String)animals.get(i);
            System.out.println(animal.toString());
        }
        System.out.println("First: " + animals.getFirst());
        System.out.println("Last: " + animals.getLast());
        // Clear list
        animals.clear();
        System.out.println("List sau khi clear: ");
        for (int i = 0; i < animals.size(); i++) {
            String animal = (String)animals.get(i);
            System.out.println(animal.toString());
        }
        System.out.println("Size: " + animals.size());
    }
}
