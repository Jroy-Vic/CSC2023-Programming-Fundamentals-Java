
public class Node<E> {
    E value;
    Node next;

    public Node(E val, Node n) {
        this.value = val;
        this.next = n;
    }

    public Node(E val) {
        this(val, null);
    }

}
