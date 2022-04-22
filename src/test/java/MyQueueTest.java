import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

    private MyQueue<String> queue;

    private List<String> testList_newData;
    private List<String> testList_oldData;

    @BeforeEach
    void setUp() {
        queue = new MyQueue<>();

        testList_newData = new ArrayList<>();
        testList_oldData = new ArrayList<>();

        add_testList_newData_toArrayList();
        add_testList_oldData_toArrayList();
    }

    @Test
    void enqueue_whenObjectsAreAddedToTheQueue_returnsFalseTheQueueIsNotEmpty() {
        // GIVEN
        // WHEN
        testList_newData.forEach(queue::enqueue);

        // THEN
        assertFalse(queue.isEmpty());
    }

    @Test
    void peek_whenObjectsAreAddedToTheQueue_returnsTheFirstObjectAdded() {
        // GIVEN
        // WHEN
        testList_newData.forEach(queue::enqueue);
        String result = queue.peek();

        // THEN
        assertEquals("T'Challa", result,
                "Expected the first element that was originally added.");
        assertTrue(result.equals("T'Challa"),
                "Called peek again, expected not to be removed, should still be first element originally added.");
    }

    @Test
    void dequeue_givenAPopulatedQueue_returnsTheFirstElementOriginallyAddedToTheQueue() {
        // GIVEN
        testList_oldData.forEach(queue::enqueue);
        testList_newData.forEach(queue::enqueue);

        // WHEN
        String result = queue.dequeue();

        // THEN
        assertTrue(result.equals("Tony Stark"));
    }

    @Test
    void dequeue_givenAPopulatedQueue_returnsElementsFromTheQueueInTheirOriginalConsecutiveOrder() {
        // GIVEN
        testList_oldData.forEach(queue::enqueue);
        testList_newData.forEach(queue::enqueue);

        // WHEN
        List<String> result = placeElementsInsideLinkedList();
        List<String> resultCopy = copyOfLinkedList(result);

        // THEN
        assertEquals(result, resultCopy);
    }

    @Test
    void isEmpty_givenAnEmptyQueue_returnsTrue() {
        // GIVEN
        // WHEN
        boolean result = queue.isEmpty();

        // THEN
        assertTrue(result, "Expected an empty queue to return true.");
    }

    @Test
    void isEmpty_givenAnNonEmptyQueue_returnsFalse() {
        // GIVEN
        testList_oldData.forEach(queue::enqueue);
        testList_newData.forEach(queue::enqueue);

        // WHEN
        boolean result = queue.isEmpty();

        // THEN
        assertFalse(result, "Expected a non empty queue to return false.");
    }

    private void add_testList_newData_toArrayList() {
        String name1 = "T'Challa";
        String name2 = "Carol Danvers";
        String name3 = "Sam Wilson";
        String name4 = "Wanda Maximoff";
        String name5 = "Stephen Strange";
        String name6 = "Peter Parker";

        testList_newData.add(name1);
        testList_newData.add(name2);
        testList_newData.add(name3);
        testList_newData.add(name4);
        testList_newData.add(name5);
        testList_newData.add(name6);
    }

    private void add_testList_oldData_toArrayList() {
        String name1 = "Tony Stark";
        String name2 = "Thor Odinson";
        String name3 = "Clint Barton";
        String name4 = "Steve Rogers";
        String name5 = "Natasha Rominov";
        String name6 = "Bruce Banner";

        testList_oldData.add(name1);
        testList_oldData.add(name2);
        testList_oldData.add(name3);
        testList_oldData.add(name4);
        testList_oldData.add(name5);
        testList_oldData.add(name6);
    }

    private List<String> placeElementsInsideLinkedList() {

        List<String> linkedList = new LinkedList<>();

        while (!queue.isEmpty()) {
            linkedList.add(queue.dequeue());
        }
        return linkedList;
    }

    private List<String> copyOfLinkedList(List<String> og_List) {
        return og_List.stream()
                .collect(Collectors.toUnmodifiableList());
    }
}