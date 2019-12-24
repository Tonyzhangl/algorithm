package LeetCode.QueueNote;

import java.util.ArrayList;
import java.util.List;

public class MyCircularQueueTest {

    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        boolean param1 = myCircularQueue.enQueue(1);
        boolean param2 = myCircularQueue.enQueue(2);
        boolean param3 = myCircularQueue.enQueue(3);
        boolean param4 = myCircularQueue.enQueue(4);
        int param5 = myCircularQueue.Rear();
        boolean param6 = myCircularQueue.isFull();
        boolean param7 = myCircularQueue.deQueue();
        boolean param8 = myCircularQueue.enQueue(4);
        int param9 = myCircularQueue.Rear();
        List<Object> list = new ArrayList<>();
        list.add(param1);
        list.add(param2);
        list.add(param3);
        list.add(param4);
        list.add(param5);
        list.add(param6);
        list.add(param7);
        list.add(param8);
        list.add(param9);
        for (Object aList : list) {
            System.out.println(aList);
        }

    }
}
