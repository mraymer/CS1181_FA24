public class MyLinkedList<E>{
    // List Nodes
    class Node<E> {
        public E data;
        public Node<E> next;
        public Node<E> prev;

        public Node(E item){
            this.data = item;
            next = null;
            prev = null;
        }
    }

    
    // Fields
    int size = 0;
    Node<E> head = null;
    Node<E> tail = null;

    // Methods
    public void addFirst(E item){

        if (head == null){
            head = tail = new Node<E>(item);
            size = 1;
        }

        else {
            Node<E> newNode = new Node<E>(item);
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            size++;
        }
    }

    public void addLast(E item){
        
        Node<E> newNode = new Node<>(item);

        // Empty list:
        if (head == null){
            head = tail = newNode;
        }
        
        // Non-empty list:
        else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }

        size++;

    }

    public String toString(){
        Node<E> current = head;
        String result = "[";

        while(current != null){
            result += current.data.toString();
            if (current.next != null){
                result += ", ";
            }
            current = current.next;
        }
        result += "]";

        return result;
    }
}