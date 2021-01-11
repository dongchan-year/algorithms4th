# Fundamentals 



## 1.3 Bags, Queues, and Stacks



### What is

**Bags**

A bag is a collection where removing items is not supported -- its purpose is to provide clients with the ability to collect items and then to iterate through the collected items.

```java
public class Bag<Item> implements Iterable<Item>{
  Bag();
  void add(Item item);
  boolean isEmpty();
  int size();
}
```



**Queue**

A FIFO queue(or just a queue) is a coolection that is based on the first-in-first-out(FIFO) policy. The policy of doing tasks in the same order that they arrive is one that we encounter frequently in everyday life.

```java
public class Queue<Item> implements Iterable<Item>{
  Queue();
  void enqueue(Item item);
  Item dequeue();
  boolean isEmpty();
  int size();
}
```



**Stack**

A pushdown stack(or just a stack) is a collection that is based on the last-in-first-out(LIFO) policy.

```java
public class Stack<Item> implements Iterable<Item>{
  Stack();
  void push(Item item);
  Item pop();
  boolean isEmpty();
  int size();
}
```



