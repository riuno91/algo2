package Queue;

/**
 * Created by Henri on 10/15/2014.
 */

public class Queue {

    QueueObject first;
    QueueObject last;

    public void Queue() {
        first = null;
        last = null;
    }

    public void enqueue(int x) {

        QueueObject nn = new QueueObject();

        if (last == null) {

            last = nn;

            first = nn;
        } else {

            last.next = nn;

            last = last.next;
        }
        last.data = x;
    }

    public int dequeue() {
        if (first != null) {

            int ret = first.data;

            QueueObject tmp = first;

            first = first.next;

            if (first == null) {

                last = null;

            }
            return ret;

        }
        else
        {
            return 0;
        }
    }

    public boolean isEmpty() {

        return first == null;

    }

}
