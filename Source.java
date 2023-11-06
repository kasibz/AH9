class Node<T> {
    T val;
    Node<T> next;
    
    public Node(T val) {
      this.val = val;
      this.next = null;
    }
  }
  
  class Source {
    public static <T> Node<T> reverseList(Node<T> head) {
      // todo
      Node<T> temp = null;
      Node<T> prev = null;
      Node<T> current = head;
      while (current != null) {
        // temporarily store next node
        temp = current.next;
        // move pointer to next node behind
        current.next = prev;
        // walk the previous node and current node ahead
        prev = current;
        current = temp;

      }
      // set the new head to prev which its next will be at the end of the original
      head = prev;
      return head;
    }
    
    public static void main(String[] args) {
        Node<String> x = new Node<>("x");
        Node<String> y = new Node<>("y");
    
        x.next = y; // x -> y
    
        Node<String> head = reverseList(x); // y -> x
          while (head != null) {
            System.out.println(head.val);
            head = head.next;            
        }
        // Printing solution
        // Node<String> head = Source.reverseList(x);


        
    }
  }