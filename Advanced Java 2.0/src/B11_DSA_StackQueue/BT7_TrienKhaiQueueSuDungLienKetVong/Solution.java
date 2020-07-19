package B11_DSA_StackQueue.BT7_TrienKhaiQueueSuDungLienKetVong;

public class Solution {
    static class Node {
        int data;
        Node link;
    }

    static class Queue {
        Node front, rear;
    }

    public static void enQueue(Queue q, int value) {
        Node newNode = new Node();
        newNode.data = value;

        if (q.front == null) {
            q.front = newNode;
        } else {
            q.rear.link = newNode;
        }
        q.rear = newNode;
        q.rear.link = q.front;
    }

    public static int deQueue(Queue q) {

        Node frontTmp = q.front;

        if (q.front == null) {
            return Integer.MIN_VALUE;
        } else if (q.front == q.rear) {
            q.front = null;
            q.rear = null;
        } else {
            q.rear.link = q.front.link;
            q.front = q.front.link;
        }

        return frontTmp.data;
    }

    public static void displayQueue(Queue q) {
        Node tmpNode = q.front;

        System.out.println("Circle queue: ");
        while (tmpNode.link != q.front) {
            System.out.print(tmpNode.data + " ");
            tmpNode = tmpNode.link;
        }

        System.out.println();
    }

    public static void main(String args[]) {
        // Create a queue and initialize front and rear
        Queue q = new Queue();

        // Inserting elements in Circular Queue
        enQueue(q, 14);
        enQueue(q, 22);
        enQueue(q, 6);

        // Display elements present in Circular Queue
        displayQueue(q);

        // Deleting elements from Circular Queue
        System.out.println("Deleted value = " + deQueue(q));
        System.out.println("Deleted value = " + deQueue(q));

        // Remaining elements in Circular Queue
        displayQueue(q);

        enQueue(q, 9);
        enQueue(q, 20);
        displayQueue(q);
    }
}
