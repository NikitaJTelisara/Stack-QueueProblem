import java.util.ArrayList;

public class SetOfStacks {
    ArrayList<Stack> stacks = new ArrayList<Stack>();
    int numberOfStacks = 0;
    int capacity;

    public void push(int d) {
        Stack s = getLastStack();
        if (s != null && !isFull(s)) {
            s.push(d);
        } else {
            Stack s1 = new Stack();
            numberOfStacks++;
            s1.push(d);
            stacks.add(s1);
        }
    }

    public Node pop() {
        Stack s = getLastStack();
        Node n = s.pop();
        if (s.isEmpty()) {
            stacks.remove(s);
            numberOfStacks--;
        }
        return n;
    }

    public Stack getLastStack() {
        if (stacks.size() == 0) {
            return null;
        }
        return (stacks.get(stacks.size() - 1));
    }

    public boolean isFull(Stack s) {
        if (s.size == capacity) {
            return true;
        }
        return false;
    }
}
