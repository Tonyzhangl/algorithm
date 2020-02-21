package CodingInterview.StackNote;

public class CQueueTest {

    public static void main(String[] args) {

        CQueue cQueue = new CQueue();
        cQueue.deleteHead();
        cQueue.appendTail(12);
        cQueue.deleteHead();
        cQueue.appendTail(10);
        cQueue.appendTail(9);
        cQueue.deleteHead();
        cQueue.deleteHead();
        cQueue.deleteHead();
        cQueue.appendTail(20);
    }

}
