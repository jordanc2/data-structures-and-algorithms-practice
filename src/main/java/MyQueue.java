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
     * Push an element onto the top of the Inbox stack
     * @param value object to be added to the back of the queue
     */
    public void enqueue(T value) {
        inbox.push(value);
    }

    /**
     * Looks at the first element of the Outbox stack, without removing it
     * @return the first object in the queue, without removing the object
     */
    public T peek() {
        shiftStacks();
        return outbox.peek();
    }

    /**
     * Helper method that first makes a check if the outbound processing stack is empty,
     *      if so, while the inbound queue is not empty it will add all inbound elements
     *      to the outbound stack, retaining the same ordering they were received
     */
    private void shiftStacks() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
    }

    /**
     * Removes and returns the element at the top of the outbound stack.
     * @return the first object in the queue
     */
    public T dequeue() {
        shiftStacks();
        return outbox.pop();
    }

    /**
     * Check for whether the queue is empty
     * @return boolean value
     */
    public boolean isEmpty() {
        return inbox.isEmpty() && outbox.isEmpty();
    }


}
