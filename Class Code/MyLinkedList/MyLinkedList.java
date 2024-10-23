public class MyLinkedList<E>{
    // List Nodes
    class Node<E> {
        public E data;
        public Node<E> next;

        public Node(E item){
            this.data = item;
            next = null;
        }
    }

    
    // Fields
    int size = 0;
    Node<E> head = null;

    // Methods
    public void addFirst(E item){
        Node<E> newNode = new Node<E>(item);
        newNode.next = head;

        head = newNode;
        size++;
    }

    public void addLast(E item){
        Node<E> current = head;

        // Find the last list element
        while (current.next != null){
            current = current.next;
        }
        current.next = new Node<E>(item);
        size++;

    }
}