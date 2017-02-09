import java.util.ArrayList;
import java.util.LinkedList;

public class AnimalQueue {
    AnimalNode firstAnimal;
    AnimalNode lastNode;

    public void enQueue(AnimalNode a) {
        if (firstAnimal != null) {
            lastNode.next = new AnimalNode(a.type);
            lastNode = lastNode.next;
        } else {
            firstAnimal = new AnimalNode(a.type);
            lastNode = firstAnimal;
        }
    }

    public AnimalNode deQueueueAny() {
        if (firstAnimal != null) {
            AnimalNode n = firstAnimal;
            firstAnimal = firstAnimal.next;
            return n;
        }
        return null;
    }

    public AnimalNode deQueueueCat() {
        AnimalNode tempNode = firstAnimal;
        while (tempNode.type != "Cat" && tempNode != null) {
            tempNode = tempNode.next;
        }
        return tempNode;
    }

    public AnimalNode deQueueueDog() {
        AnimalNode tempNode = firstAnimal;
        while (tempNode.type != "Dog" && tempNode != null) {
            tempNode = tempNode.next;
        }
        return tempNode;
    }

}
