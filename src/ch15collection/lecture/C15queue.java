package ch15collection.lecture;

import java.util.LinkedList;
import java.util.Queue;

public class C15queue {
    public static void main(String[] args) {
        //queue : FIFO first in first out
        /*Commonly used methods
        * offer : adding item
        * poll : taking out item
        * */

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(100);
        queue.offer(300);
        queue.offer(500);

        System.out.println("queue.size() = " + queue.size());
        Integer item1 = queue.poll();
        System.out.println("queue.size() = " + queue.size());
        Integer item2 = queue.poll();
        System.out.println("queue.size() = " + queue.size());
        Integer item3 = queue.poll();
        System.out.println("queue.size() = " + queue.size());

        System.out.println("item1 = " + item1);
        System.out.println("item2 = " + item2);
        System.out.println("item3 = " + item3);
    }
}
