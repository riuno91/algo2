package Queue;

/**
 * 1.4 Järjekord (2 punkti)
 *(queue - FIFO). Järjekord tuleb implementeerida [...] lingitud listina.
 * Created by Henri on 10/15/2014.
 */

public class Queue {

    QueueObject first;  //points to first object of list; null for empty list
    QueueObject last;

    /**
     *  Loob järjekorra O(1)
     */
    public void Queue() {
        first = null;
        last = null;
    }

    /**
     * Lisab arvu x järjekorda O(1)
     */
    public void enqueue(int x) {

        QueueObject newobject = new QueueObject();
        // viimane Object ei ole initsialiseeritud, siis järjekord on tühi,
        // paneme viimase ja esimese viite viitama loodud elemendile.
        if (last == null) {

            last = newobject;

            first = newobject;
            // viimane Object on initsialiseeritud, paneme selle viitama loodud Objectile
            // ja kerime edasi, nii et loodud Obeject oleks viimane.
        } else {

            last.next = newobject;

            last = last.next;
        }
        //uus obeject on paigas, väärtustame andmed
        last.data = x;
    }


    /**
     *Väljastab ja eemaldab kõige varem sisestatud elemendi O(1)
      */

    public int dequeue() {
        if (first != null) {

            int returneddata = first.data;

            QueueObject tmp = first;

            first = first.next;           //paneme first viitama järgmisele elemendile

            if (first == null) {

                last = null;

            }
            return returneddata;

        }
        else
        {
            return 0;
        }
    }

    /**
     * Väjastab true, kui järjekord on tühi O(1)
     */
    public boolean isEmpty() {

        return first == null;

    }

}
