```java
Stack s = new Stack (6);
Queue q = new Queue (5);
s.push (3);
s.push(12);
q.enqueue (5);
q.enqueue (8);
int x = s.pop();
s.push(2);
q.enqueue (x);
s.push(x);
```

s -> 3

s -> 3, 12

q -> 5

q -> 5, 8

x -> 12

s -> 3, 2


q -> 5, 8, 12

s -> 3, 2, 12

// Final state

q -> 5, 8, 12

s -> 3, 2, 12
