Estado Inicial

s -> 2, 3
q -> 1, 2, 4

a)
s.push(q.dequeue())
s -> 2, 3, 1
q -> 2, 4

b)
s.push(q.getFirst())
s -> 2, 3, 1, 2
q -> 2, 4

c) 
q.enqueue(q.dequeue())
s -> 2, 3, 1, 2
q -> 4, 2

d)
s.push(s.pop())
s -> 2, 3, 1, 2
q -> 4, 2

e)
q.enqueue(s.pop())
s -> 2, 3, 1
q -> 4, 2, 2
