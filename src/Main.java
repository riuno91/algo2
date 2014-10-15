import teine.kodutöö.algoritmid.implementations.MagazineArray;
import teine.kodutöö.algoritmid.implementations.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        /*MagazineArray ma = new MagazineArray();

        ma.push(5);
        ma.push(2);
        ma.push(1);
        ma.push(10);
        ma.push(15);


        System.out.println(ma.pop());

        System.out.println(ma.len());*/

        PriorityQueue pr = new PriorityQueue();

        pr.enqueue(10);
        pr.enqueue(20);
        pr.enqueue(9);
        pr.enqueue(18);
        pr.enqueue(12);
        pr.enqueue(6);
        pr.enqueue(5);
        pr.enqueue(3);
        pr.enqueue(9);
        pr.enqueue(8);


        System.out.println(pr.dequeue());


        /*

        Queue que = new Queue();

        que.enqueue(1);
        que.enqueue(2);
        que.enqueue(3);
        que.enqueue(4);


        que.enqueue(5);
        que.enqueue(6);
        que.enqueue(7);
        que.enqueue(8);
        que.enqueue(9);


        que.dequeue();
        que.dequeue();
        que.dequeue();

        System.out.println(que.first.data);
        System.out.println(que.last.data);

        */


    }
}
