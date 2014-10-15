package Queue;


/**
 * Created by Henri on 10/15/2014.
 */
public class Queue {
    private LinkList list;

    // Queue constructor
    public Queue()
    {
        // Create a new LinkedList.
        list = new LinkList();
    }


    public void enqueue(int item)
    // Post: An item is added to the back of the queue.
    {
        list.insert(item);
    }

    public Object dequeue()
    {
        Object item = list.getLastLink();
        list.delete();
        return item;
    }

    public boolean isEmpty()
    // Post: Returns true if the queue is empty. Otherwise, false.
    {
        return list.isEmpty();
    }
}
