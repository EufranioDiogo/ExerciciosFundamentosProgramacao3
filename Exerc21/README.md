```java
public static void main(String args[]) {
    Queue q = new Queue(8);
    
    System.out.println(q.dequeue());
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.enqueue(4);
    q.enqueue(5);
    
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
    
    q.enqueue(6);
    q.enqueue(7);
    q.enqueue(8);
    q.enqueue(9);
    
    q.print();
}
```

(1) 8

(2) 5 -> 6 -> 7 -> 8 -> 9

(3) 0 1 2 3 4 