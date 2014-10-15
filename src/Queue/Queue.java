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
            // viimane Node ei ole initsialiseeritud, siis järjekord on tühi:
            // paneme viimase ja esimese viite viitama loodud elemendile.
            last = nn;
            first = nn;
        } else {
            // viimane Node on initsialiseeritud, paneme selle viitama loodud Nodele
            // ja kerime edasi, nii et loodud Node oleks viimane.
            last.next = nn;
            last = last.next;
        }

        // nüüd on uus Node paigas, lisama sellele andmed
        last.data = x;
    }

    public int dequeue() {
        if (first != null) {
           int ret = first.data;

            QueueObject tmp = first;
            first = first.next;

            // kui nüüd esimene Node viitab tühjusele, siis
            // paneme viimase Node ka tühjusele viitama.
            //
            // kuna viimast Node kunagi ei allokeerita, siis
            //  pole ka midagi kustutada.
            if (first == null) {
                last = null;
            }

            return ret;
        }
        else {
            return 0;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }
}
