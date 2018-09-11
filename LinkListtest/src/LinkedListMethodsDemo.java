//package collections;
import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Deque;

public class LinkedListMethodsDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("first");
        linkedList.add("second");
        linkedList.add("third");
        System.out.println(linkedList);

        linkedList.addFirst("addFirst");
        System.out.println(linkedList);

        linkedList.addLast("addLast");
        System.out.println(linkedList);

        linkedList.add(2, "addByIndex");
        System.out.println(linkedList);
        linkedList.remove();
        System.out.println("remove: " + linkedList);

        linkedList.remove("second");
        System.out.println("remove(Object): " + linkedList);

        linkedList.remove("six");
        System.out.println("remove(Object) not exist: " + linkedList);

        linkedList.remove(2);
        System.out.println("remove(index): " + linkedList);

        linkedList.removeFirst();
        System.out.println("removeFirst: " + linkedList);

        linkedList.removeLast();
        System.out.println("removeLast:" + linkedList);

        System.out.println("----------------------------------");
        linkedList.clear();

        linkedList.add("first");
        linkedList.add("second");
        linkedList.add("first");
        linkedList.add("third");
        linkedList.add("first");
        linkedList.add("five");
        System.out.println(linkedList);

        linkedList.removeFirstOccurrence("first");
        System.out.println("removeFirstOccurrence: " + linkedList);

        linkedList.removeLastOccurrence("first");
        System.out.println("removeLastOccurrence: " + linkedList);
        linkedList.add("first");
        linkedList.add("second");
        linkedList.add("second");
        linkedList.add("third");
        linkedList.add("four");
        linkedList.add("five");
        System.out.println(linkedList);

        linkedList.get(3);
        System.out.println("get(index): " + linkedList.get(3));

        linkedList.getFirst();
        System.out.println("getFirst: " + linkedList.getFirst());

        linkedList.getLast();
        System.out.println("getLast: " + linkedList.getLast());

        System.out.println(linkedList);
        linkedList.clear();
        System.out.println(linkedList);
        linkedList.push("first");
        linkedList.push("second");
        linkedList.push("second");
        linkedList.push("third");
        linkedList.push("four");
        linkedList.push("five");
        System.out.println("linkedList: " + linkedList);

        System.out.println("pop: " + linkedList.pop());
        System.out.println("after pop: " + linkedList);

        System.out.println("poll: " + linkedList.poll());
        System.out.println("after poll: " + linkedList);
        linkedList.clear();
        
        
        linkedList.push("first");
        linkedList.push("second");
        linkedList.push("second");
        linkedList.push("third");
        linkedList.push("four");
        linkedList.push("five");
        System.out.println("linkedList: " + linkedList);

        System.out.println("peek: " + linkedList.peek());
        System.out.println("peekFirst: " + linkedList.peekFirst());
        System.out.println("peekLast: " + linkedList.peekLast());

        System.out.println("linkedList: " + linkedList);
        
        }


    }
