package Bai_10_list.exercise.MyList;


public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>(10);
        myList.addLast("Nhật");
        myList.addLast("Ha");
        myList.addLast("Diep");
        myList.addLast("Chien");
        myList.addLast("Phuc");
        myList.add(2,"chen");
        System.out.println("Before remove");
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));
        System.out.println(myList.get(3));
        System.out.println("After remove");
        myList.remove(2);
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));
        System.out.println(myList.get(3));
    }
}
