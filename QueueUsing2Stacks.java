public class QueueUsing2Stacks {
    Stack newStack, oldStack;

    public QueueUsing2Stacks() {
        newStack = new Stack();
        oldStack = new Stack();
    }

    public void enQueue1(int d) {
        newStack.push(d);
    }

    public Node deQueue1() {
        shiftStack();
        return oldStack.pop();
    }

    public void shiftStack() {
        if (oldStack.isEmpty()) {
            while (!newStack.isEmpty()) {
                oldStack.push(newStack.pop().data);
            }
        }
    }

    public boolean isEmpty() {
        if (newStack.isEmpty() && oldStack.isEmpty()) {
            return true;
        }
        return false;
    }

}

