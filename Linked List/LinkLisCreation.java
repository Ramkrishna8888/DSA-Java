// Online Java Compiler (Editor)
// Write and run Java online using this editor.
class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = null;
    }

    Node(int data1){
        this.data = data1;
    }
}

class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Node first = new Node(arr[2], null);
        System.out.println(first.data);
    }
}
