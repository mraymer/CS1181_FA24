import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list1 = new MyLinkedList<>();
        list1.addLast(7);
        list1.addLast(9);
        list1.addFirst(1);
        list1.addLast(10);
        System.out.println(list1);


        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(3);
        list2.add(9);
        list2.add(17);
        list2.add(2, 11);
        list2.add(4, 22);
        list2.add(10, 500);
        System.out.println(list2);
    }
}
