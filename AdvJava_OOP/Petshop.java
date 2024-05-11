package AdvJava_OOP;

class Link {
    // *** Inner Class Starts ***/
    private class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }

        public void addNode(Node newNode) {
            if (this.next == null) {
                this.next = newNode;
            } else {
                this.next.addNode(newNode);
            }
        }

        public boolean containsNode(Object data) {
            if (data.equals(data)) {
                return true;
            }
            if (this.next != null) {
                return this.next.containsNode(data);
            } else {
                return false;
            }
        }

        public Object getNode(int index) {
            if (Link.this.foot++ == index) {
                return this.data;
            } else {
                return this.next.getNode(index);
            }
        }

        public void setNode(int index, Object data) {
            if (Link.this.count++ == index) {
                this.data = data;
            } else {
                this.next.setNode(index, data);
            }
        }

        public void removeNode(Node previous, Object data) {
            if (data.equals(data)) {
                previous.next = next;
            } else {
                this.next.removeNode(this, data);
            }
        }

        public void toArrayNode() {
            Link.this.retArray[Link.this.foot++] = this.data;
            if (this.next != null) {
                this.next.toArrayNode();
            }
        }

    }

    // *** Inner Class Ends ***/
    private Node root;
    private int count = 0;
    private int foot = 0;
    private Object[] retArray;

    public void add(Object data) {
        if (data == null) {
            return;
        }
        Node newNode = new Node(data);
        if (this.root == null) {
            this.root = newNode;
        } else {
            this.root.addNode(newNode);
        }
        this.count++;
    }

    public int size() {
        return this.count;
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public boolean contains(Object data) {
        if (data == null || this.root == null) {
            return false;
        }
        return this.root.containsNode(data);
    }

    public Object get(int index) {
        if (index > this.count) {
            return null;
        }
        this.foot = 0;
        return this.root.getNode(index);
    }

    public void set(int index, Object data) {
        if (index > this.count) {
            return;
        }
        this.root.setNode(index, data);
    }

    public void remove(Object data) {
        if (this.contains(data)) {
            if (data.equals(this.root.data)) {
                this.root = this.root.next;
            } else {
                this.root.next.removeNode(this.root, data);
            }
            this.count--;
        }
    }

    public Object[] toArray() {
        if (this.root == null) {
            return null;
        }
        this.foot = 0;
        this.retArray = new Object[this.count];
        this.root.toArrayNode();
        return this.retArray;
    }

    public void clear() {
        this.root = null;
        this.count = 0;
        this.foot = 0;
    }
}

interface Pet {
    public String getName();

    public int getAge();
}

class ThePetShop {
    private Link pets = new Link();

    public void addPet(Pet pet) {
        this.pets.add(pet);
    }

    public void removePet(Pet pet) {
        this.pets.remove(pet);
    }

    public Link search(String keyWord) {
        Link result = new Link();
        Object obj[] = this.pets.toArray();
        for (int x = 0; x < obj.length; x++) {
            Pet p = (Pet) obj[x];
            if (p.getName().contains(keyWord)) {
                result.add(p);
            }
        }
        return result;
    }
}

class Cat implements Pet {
    private String name;
    private int age;

    public Cat() {
        this.name = "";
        this.age = 0;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Cat)) {
            return false;
        }
        Cat c = (Cat) obj;
        if (this.name.equals(c.name) && this.age == c.age) {
            return true;
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return this.name + " " + this.age;
    }
}

class Dog implements Pet {
    private String name;
    private int age;

    public Dog() {
        this.name = "";
        this.age = 0;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Cat)) {
            return false;
        }
        Dog c = (Dog) obj;
        if (this.name.equals(c.name) && this.age == c.age) {
            return true;
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return this.name + " " + this.age;
    }
}

public class Petshop {
    public static void main(String[] args) {
        ThePetShop shop = new ThePetShop();
        shop.addPet(new Cat("Lexie", 1));
        shop.addPet(new Cat("Garfield", 2));
        shop.addPet(new Dog("Fido", 3));
        shop.addPet(new Dog("Rover", 4));
        Link all = shop.search("i");
        Object obj[] = all.toArray();
        for (int x = 0; x < obj.length; x++) {
            System.out.println(obj[x]);
        }
    }
}
