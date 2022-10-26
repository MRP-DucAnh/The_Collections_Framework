package thecollections;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("PHP");
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("Java");
        arrayList.add("C++");
        arrayList.add(null);
        arrayList.add(null);
        System.out.println("ArrayList's elements: ");
        System.out.print("\t" + arrayList + "\n"); //[PHP, Python, Java, Java, C++]
       // arrayList.remove();

        List<String> linkedList = new LinkedList<String>();
        linkedList.add("PHP");
        linkedList.add("Python");
        linkedList.add("Java");
        linkedList.add("Java");
        linkedList.add("C++");
        linkedList.add(null);
        linkedList.add(null);
        System.out.println("LinkedList's elements: ");
        System.out.print("\t" + linkedList + "\n"); //[PHP, Python, Java, Java, C++]

        // new TreeSet() sẽ sắp xếp các phần tử
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("PHP");
        hashSet.add("Python");
        hashSet.add("Java");
        hashSet.add("Java");
        hashSet.add("C++");
        hashSet.add(null);
        hashSet.add(null);
        System.out.println("Set's elements: ");
        System.out.print("\t" + hashSet + "\n"); //[Java, C++, PHP, Python]

        // new TreeMap() sẽ sắp xếp các phần tử dự vào key của chúng
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Windows", "2000");
        hashMap.put("Windows", "XP");
        hashMap.put("Language1", ".Net");
        hashMap.put("Language2", "Java");
        hashMap.put("Language3", "Java");
        hashMap.put(null, null);
        hashMap.put(null, "null changed");
        System.out.println("Map's elements: ");
        System.out.print("\t" + hashMap);

        // Tạo Queue sử dụng class LinkedList
        Queue<String> queue = new LinkedList<>();

        // Chèn phần tử chỉ định vào Queue bằng phương thức offer
        queue.offer("PHP");
        queue.offer("Python");
        queue.offer("Java");
        queue.offer("Java");
        queue.offer("C++");
        queue.offer(null);
        queue.offer(null);
        System.out.println();
        System.out.println("Queue's elements: ");
        System.out.print("\t" + queue + "\n");

        // Truy cập các phần tử trong Queue
        String accessedQueue = queue.peek();
        System.out.println("access elements of queue: " + accessedQueue);

        // Loại bỏ các phần tử tron Queue
        String removedQueueElement = queue.poll();
        System.out.println("remove an element: " + removedQueueElement);
        System.out.println("Update Queue: " + queue);


    }
}
