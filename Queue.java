
public class Queue {
    Node first, last;

    public void enQueue(int d) {
        Node n = new Node(d);
        if (first != null) {
            last.next = n;
            last = n;
        } else {
            first = n;
            last = n;
        }
    }

    public Node deQueue() {
        if (first != null) {
            Node n = first;
            first = first.next;
            return n;
        }
        return null;
    }

    boolean isEmpty() {
        return (first == null) ;
    }
}
