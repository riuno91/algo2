package teine.kodutöö.algoritmid.implementations;

/**
 * Created by Riuno on 14.10.2014.
 */
public class PriorityQueue extends  DynamicArray{
    DynamicArray minBinHeap;
    /**
     *
     */
    public PriorityQueue() {
        // lisame esimese elemendi, et alates yhest hakataks t2itma
        minBinHeap.add(-1);
    }

    public void enqueue (int x){

    }

    public int dequeue(){
        int n = 0;

        return n;
    }

    public boolean isEmpty(){

        if ((super.len()-1) == 0){
            return true;
        }else return false;

    }
}
