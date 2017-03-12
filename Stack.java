
/*3.2 stack which, in addition to push and pop, also has a
function min
*/
public class Stack {
    Node top;
    int min;
    /*better
    int min =0;
    */
    int size =0;

    public Node pop() {
        if (top != null) {
            Node n = new Node(top.data);
            top = top.next;
            return n;
        }
        return null;
    }

    public void push(int d) {
        Node n = new Node(d);
        if (top != null) {
            if (min > d) {
                min = d;
            }
            n.next = top;
        } else {
            min = d;
        }
        top = n;
        size++;
    }
    /*better for min impl
    public void push(Node n){
        if(min > n.data){
           min = n.data;
        }
        if(top!=null){
            n.next = top;
        }else{
            top = n;
        }
    }*/
    

    public Node peek() {
        if (top != null) {
            Node n = new Node(top.data);
            return n;
        }
        return null;
    }

    boolean isEmpty() {
        if (top == null) {
            return true;
        }
        return false;
    }

    int getMin(){
        return min;
    }
}
