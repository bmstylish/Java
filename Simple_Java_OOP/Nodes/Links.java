package Simple_Java_OOP.Nodes;

class Link {
    // ---------------------------//Inner class Node
    // begins//---------------------------//
    private class Node {
        private String data; // Data to save
        private Node next; // Next data to save in node

        public Node(String data) { // Every node must have a data
            this.data = data;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return this.next;
        }

        public String getData() {
            return this.data;
        }

        public void addNode(Node newNode) {
            if (this.next == null) { // the next of the current node is null
                this.next = newNode; // save the new node
            } else { // move on to the next node to save
                this.next.addNode(newNode);
            }
        }

        // Printing all nodes
        public void printNode() {
            System.out.println(this.data);
            if (this.next != null) {
                this.next.printNode();
            }
        }

        // Setting a new data in the node
        public String setNode(int index, String data) {
            if (Link.this.foot++ == index) {
                return this.data;
            } else {
                return this.next.setNode(index, data);
            }
        }

        // Removing a node that isn't root node
        public void removeNode(Node previous, String data) {
            if (data.equals(this.data)) {
                previous.next = this.next;
            } else {
                this.next.removeNode(this, data);
            }
        }

        // Check if the data is in the list
        public boolean contains(String data) {
            if (data.equals(this.data)) { // If the current data is the same as the data we want to find
                return true; // Return, does not check for the next node
            } else { // If the current data is not the same as the data we want to find
                if (this.next != null) { // If the next node is not null
                    return this.next.contains(data); // Check the next node
                } else { // If the next node is null
                    return false; // Return false, does not contain the data
                }
            }
        }

        // Turn data into a array
        public void toArrayNode() {
            Link.this.retArray[Link.this.foot++] = this.data;
            if (this.next != null) {
                this.next.toArrayNode();
            }
        }
    }

    // ----------------------------------------------------------------//Inner Node
    // Class
    // Ends//----------------------------------------------------------------//
    private int count;
    private Node root;
    private int foot = 0;
    private String[] retArray;

    public void add(String data) {
        if (data == null) {
            return;
        }
        Node newNode = new Node(data); // Setting the order of the Nodes
        if (this.root == null) { // Every list has one root
            this.root = newNode; // Sets the root to the new node
        } else { // Root already exists
            this.root.addNode(newNode); // Gives it to Node class to save
        }
        this.count++;
    }

    // Printing all nodes
    public void print() {
        if (this.root != null) {
            this.root.printNode();
        }
    }

    // Gets count of nodes
    public int getCount() {
        return this.count;
    }

    // Getting a node by index and data
    public String get(int index, String data) {
        if (index > this.count - 1) {
            return null;
        }
        this.foot = 0;
        return this.root.setNode(index, data);
    }

    // Check if the node is empty
    public boolean isEmpty() {
        return this.count == 0;
    }

    // Check if the data is in the list
    public boolean contains(String data) {
        if (data == null || this.root == null) {
            return false;
        }
        return this.root.contains(data);
    }

    // Removing a node
    public void remove(String data) {
        if (contains(data)) {
            if (data.equals(this.root.data)) {
                this.root = this.root.next;
            } else {
                this.root.next.removeNode(this.root, data);
            }
            this.count--;
        }
    }

    // Turn data into a array
    public String[] toArray() {
        if (this.root == null) {
            return null;
        }
        this.foot = 0;
        this.retArray = new String[this.count];
        this.root.toArrayNode();
        return this.retArray;
    }

    public void clear() {
        this.root = null;
        this.count = 0;
        this.foot = 0;
        this.retArray = null;
    }
}

public class Links {
    public static void main(String[] args) {
        Link link = new Link();
        link.add("hello");
        link.add("world");
        link.add("MLDN");
        link.add("End");
        link.print();

        System.out.println(link.contains("End"));
        System.out.println(link.contains("null"));
    }
}
