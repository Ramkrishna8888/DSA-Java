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
    public static Node LinkedLisToArr(int[] arr){
    Node head = new Node(arr[0]);
    Node mover = head;
    for(int i = 1; i<arr.length; i++){
        Node temp = new Node(arr[i]);
        mover.next = temp; // making connection with prev node
        mover = temp; // mover is containing new node rn
      }
    return head;
  }  
    
    public static void main(String[] args) {     
        int[] arr = {15,2,3,4,5,6};
        Node head = LinkedLisToArr(arr);
        System.out.println(head.data);
    }
}
