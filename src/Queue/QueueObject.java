package Queue;

/**
 * Created by Henri on 10/15/2014.
 */
public class QueueObject {
    QueueObject next;                   // A reference to the next object, null for last node
    int data;                           // The data being stored in the node

    public void QueueObject() {
        next = null;
    }
};