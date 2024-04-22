package Nodes;

class Node {
    private String data;
    private Node next;

    // Creates a new node with the given data
    public Node(String data) {
        this.data = data;
    }

    // Sets the reference to the next node
    public void setNext(Node next) {
        this.next = next;
    }

    // Returns the reference to the next node
    public Node getNext() {
        return this.next;
    }

    // Sets the data of the node to next data
    public void setData(String data) {
        this.data = data;
    }

    // Returns the data of the node
    public String getData() {
        return this.data;
    }
}

public class Nodes {
    public static void main(String[] args) {
        Node root = new Node("root");
        Node node1 = new Node("node1");
        Node node2 = new Node("node2");

        root.setNext(node1);
        node1.setNext(node2);
        print(root);

        // Node currentNode = root;
        // while (currentNode != null) {
        // System.out.println(currentNode.getData());
        // currentNode = currentNode.getNext();
        // }
    }

    public static void print(Node current) {
        if (current == null) {
            return;
        }
        System.out.println(current.getData());
        print(current.getNext());
    }
}
