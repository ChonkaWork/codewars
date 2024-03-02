package six;

public class NodeMania {
    static class Node {
        public final int data;
        public Node next;

        Node(int data) {
            this.data = data;
        }

        public static Node build(int... values) {
            Node head = new Node(values[0]);
            Node current = head;
            for (int i = 1; i < values.length; i++) {
                current.next = new Node(values[i]);
                current = current.next;
            }
            return head;
        }
    }

    public static Integer searchKFromEnd(Node linkedList, int k) {
        Node current = linkedList;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        if (k > count) {
            return null;
        }
        for (int i = 0; i < count - k; i++) {
            linkedList = linkedList.next;
        }
        return linkedList.data;
    }
}
