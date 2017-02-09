

public class StackQueueProblems {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(4);
        s.push(3);
        s.push(1);
        s.push(2);

        System.out.print(s.peek().data);
        System.out.print("\n");
        int d = s.getMin();
        System.out.print("min val is " + d);
        System.out.print("\n");
        s.pop();
        System.out.print(s.top.data);
        System.out.print("\n");
        if (s.isEmpty()) {
            System.out.print("Is empty");
        } else {
            System.out.print("Is not empty");
        }
        System.out.print("\n");
        s.pop();
        s.pop();
        s.pop();
        if (s.isEmpty()) {
            System.out.print("Is empty");
        } else {
            System.out.print("Is not empty");
        }
        System.out.print("\n");
        Queue q = new Queue();
        q.enQueue(3);
        System.out.print("first " + q.first.data);
        System.out.print("\n");
        System.out.print("last " + q.last.data);
        System.out.print("\n");
        q.enQueue(4);
        q.enQueue(5);
        System.out.print("first " + q.first.data);
        System.out.print("\n");
        System.out.print("last " + q.last.data);
        System.out.print("\n");
        q.deQueue();
        System.out.print("first " + q.first.data);
        System.out.print("\n");
        System.out.print("last " + q.last.data);
        System.out.print("\n");

        if (q.isEmpty()) {
            System.out.print("Is empty");
        } else {
            System.out.print("Is not empty");
        }
        System.out.print("\n");
        q.deQueue();
        q.deQueue();
        if (q.isEmpty()) {
            System.out.print("Is empty");
        } else {
            System.out.print("Is not empty");
        }
        System.out.print("\n");

        /* 3.3.Implement a data structure SetOfStacks that mimics this. SetOf-
            Stacks should be composed of several stacks and should create a new stack once
            the previous one exceeds capacity. SetOfStacks.push() and SetOfStacks.
            pop () should behave identically to a single stack*/

        SetOfStacks stacks = new SetOfStacks();
        stacks.capacity = 3;
        stacks.push(1);
        stacks.push(2);
        stacks.push(3);
        stacks.push(4);
        stacks.push(5);
        stacks.push(6);
        stacks.push(7);
        stacks.push(8);
        stacks.push(9);
        stacks.push(10);
        stacks.push(11);

        System.out.print("\n");
        System.out.print("Number of stacks " + stacks.numberOfStacks);
        System.out.print("\n");

        Node l = stacks.pop();
        System.out.print("Poped " + l.data);
        System.out.print("\n");
        System.out.print("Number of stacks " + stacks.numberOfStacks);
        System.out.print("\n");

        l = stacks.pop();
        System.out.print("Poped " + l.data);
        System.out.print("\n");
        l = stacks.pop();
        System.out.print("Poped " + l.data);
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("Number of stacks " + stacks.numberOfStacks);
        System.out.print("\n");


        /* 3.5 Implement a MyQueue class which implements a queue using two stacks.*/
        QueueUsing2Stacks queue = new QueueUsing2Stacks();
        queue.enQueue1(1);
        queue.enQueue1(2);
        queue.enQueue1(3);
        Node n = queue.deQueue1();
        if (queue.isEmpty()) {
            System.out.print("Is empty");
        } else {
            System.out.print("dequeued: " + n.data);
        }
        System.out.print("\n");
        queue.deQueue1();
        queue.deQueue1();
        queue.deQueue1();
        n = queue.deQueue1();
        if (queue.isEmpty()) {
            System.out.print("Is empty");
        } else {
            System.out.print("dequeued: " + n.data);
        }

        Stack stack = new Stack();
        stack.push(1);
        stack.push(7);
        stack.push(2);
        stack.push(6);
        stack.push(5);

        Stack tempStack = sortStack(stack);
        System.out.print("\n ");
        while (!tempStack.isEmpty()) {
            System.out.print(tempStack.pop().data);
            System.out.print("\n ");
        }

        /* 3.7 Implement enqueue(), dequeueAny(), dequeueDog() and dequeueCat()*/

        AnimalQueue animalQueue = new AnimalQueue();
        AnimalNode a = new AnimalNode("Cat");
        animalQueue.enQueue(a);
        a = new AnimalNode("Cat");
        animalQueue.enQueue(a);
        a = new AnimalNode("Cat");
        animalQueue.enQueue(a);
        a = new AnimalNode("Dog");
        animalQueue.enQueue(a);
        a = new AnimalNode("Dog");
        animalQueue.enQueue(a);
        a = new AnimalNode("Dog");
        animalQueue.enQueue(a);
        a = new AnimalNode("Dog");
        animalQueue.enQueue(a);

        a = animalQueue.deQueueueAny();
        System.out.println("DequeAny "+a.type);

        a = animalQueue.deQueueueAny();
        System.out.println("DequeAny "+a.type);

        a = animalQueue.deQueueueCat();
        System.out.println("DequeCat "+a.type);

        a = animalQueue.deQueueueDog();
        System.out.println("DequeDog "+a.type);


    }

    /* 3.6 Sort a stack with greatest number as top.*/

    public static Stack sortStack(Stack s1) {
        Stack tempStack = new Stack();
        Node tempVar = null;
        while (!s1.isEmpty()) {
            tempVar = s1.pop();
            while (!tempStack.isEmpty() && tempVar.data < tempStack.peek().data) {
                s1.push(tempStack.pop().data);
            }
            tempStack.push(tempVar.data);
        }
        return tempStack;
    }
}