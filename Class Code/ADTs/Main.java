import java.util.PriorityQueue;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(9);
        s.push(5);
        s.push(12);
        System.out.println(s.pop());
        s.push(11);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());     
        //System.out.println(s.pop());

        System.out.println("Priority queue:");
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.offer(12);
        q.offer(22);
        q.offer(5);
        q.offer(16);
        q.offer(35);
        q.offer(2);

        System.out.println(q);

        while (!q.isEmpty()){
            System.out.println(q.poll());
        }

    }
}