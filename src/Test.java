import Queue.Queue;
import teine.kodutöö.algoritmid.implementations.MagazineArray;
import teine.kodutöö.algoritmid.implementations.PriorityQueue;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.WriteAbortedException;

/**
 * Created by Rauno-Sten Reile 104468IAPB && Henri Liiv on 19.10.2014.
 */
public class Test {

    private static void writer(String fname, int k) {
        System.out.println(k);
        long result; // long, mis väärustatakse listis oleva fibonaccy arvuga.
        try {// try catch faili kirjutamiseks
            FileWriter writer = new FileWriter(fname, true);

            writer.write(k + "\n");

            writer.close(); //suletakse dokument peale kirjutamist.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testStack (){

        int k;
        MagazineArray ma = new MagazineArray();
        ma.push(1);

        while (!ma.isEmpty()){
            k = ma.pop();

            if (k <= 20){
                writer("stack.out", k);
                ma.push(2*k + 1);
                ma.push(2 * k);
            }else break;

        }

    }

    public void testPriorityQueue (){
        int k = 1;
        PriorityQueue minHeap = new PriorityQueue();
        minHeap.enqueue(k);

        while (!minHeap.isEmpty()){
            k = minHeap.dequeue();

            if (k <= 20){
                writer("priority_queue.out",k);
                minHeap.enqueue(2*k + 1);
                minHeap.enqueue(2*k);
            }else break;
        }

    }


    public void testQueue (){
        int k = 1;
        Queue queue = new Queue();
        queue.enqueue(k);

        while (!queue.isEmpty()){
            k = queue.dequeue();

            if (k <= 20){
                writer("queue.out",k);
                queue.enqueue(2*k + 1);
                queue.enqueue(2*k);
            }else break;
        }
    }
}
