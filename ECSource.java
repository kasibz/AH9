import java.util.HashSet;
import java.util.Set;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class ECSource {
  public static <T> boolean isUnivalueList(Node<T> head) {
    // todo
    // the set keeps track of repeats 
    Set<T> set = new HashSet<>();
    Node<T> current = head;
      while (current != null) {
        set.add(current.val);
        current = current.next;
      }

      return set.size() == 1;
  }

  public static void main(String[] args) {
        Node<String> z = new Node<>("z");
        // z

        // Printing solution
        System.out.println((ECSource.isUnivalueList(z))); // true

        Node<Integer> u = new Node<>(2);
        Node<Integer> v = new Node<>(2);
        Node<Integer> w = new Node<>(2);
        Node<Integer> x = new Node<>(2);
        Node<Integer> y = new Node<>(2);
        
        u.next = v;
        v.next = w;
        w.next = x;
        x.next = y;
        System.out.println(isUnivalueList(u)); // true
        // 2 -> 2 -> 2 -> 2 -> 2
        Node<Integer> a = new Node<>(2);
        Node<Integer> b = new Node<>(2);
        Node<Integer> c = new Node<>(3);
        Node<Integer> d = new Node<>(3);
        Node<Integer> e = new Node<>(2);
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        
        System.out.println(isUnivalueList(a)); // false
    }
}
