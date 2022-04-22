import java.util.Stack;

/**
 * Queue Implementation utilizing two Stack datastructures
 * One serves as an Inbox for new objects received
 * One serves as an Outbox for older items to be processed in the order they are received
 * Implements the following operations of a Queue using Stacks
 *      enqueue(T)      - Push element <T> to the back of the Queue
 *      dequeue()       - Removes the first element from the Queue
 *      peek()          - Get the front element, but does not return it
 *      isEmpty()       - Return whether the Queue is empty
 *      shiftStacks()   - Helper method that checks if the outbox is empty,
 *                          if so, will add inbox to outbox in order received.
 * @param <T> the Type of object that is received
 */
public class MyQueue<T> {

    private Stack<T> inbox;
    private Stack<T> outbox;

    /**
     * Constructor that initializes two new Stack datastructures.
     */
    public MyQueue() {
        this.inbox = new Stack<>();
        this.outbox = new Stack<>();
    }

    /**
     * Push an element from
     * @param value
     */
    public void enqueue(T value) {
        inbox.push(value);
    }

    public T peek() {
        shiftStacks();
        return outbox.peek();
    }

    private void shiftStacks() {
        if (!outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
    }

    public T dequeue() {
        shiftStacks();
        return outbox.pop();
    }

    public boolean isEmpty() {
        return inbox.isEmpty() && outbox.isEmpty();
    }


}
