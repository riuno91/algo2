package teine.kodutöö.algoritmid.implementations;

import com.sun.xml.internal.bind.v2.TODO;

/**
 * Created by Riuno on 14.10.2014.
 */
public class PriorityQueue extends  DynamicArray{
    DynamicArray minBinHeap;
    int nextpos;
    /**
     *
     */
    public PriorityQueue() {
        // lisame esimese elemendi, et alates yhest hakataks t2itma
        minBinHeap = new DynamicArray();
        minBinHeap.add(-11);
        nextpos = 1;
    }

    public void enqueue (int x){

        int positsion = nextpos; // int x-i positsioon, kuhu lisatakse
        minBinHeap.add(x); // lisain xi alguses arraysse

        while(true){

            int upParentPos, parent;  // int-d k6rval oleva elemendi jaoks

            //kontrollin ega element ei ole esimene
            if (positsion <= 1){
                break;
            }
            upParentPos = positsion/2;   // v6tan ylemelemendi positsiooni (bin kuhjal alati ylemine postisoon /2 v2iksem)
            parent = minBinHeap.get(upParentPos); //v6tan elemendi arvulise v22rtuse

            if(parent < x){//kui parent on v2iksem x-st(min kuhja reegel), siis l6petan
                break;
            }else{ // vastasel korral vahetan positsioonid
                minBinHeap.put(x, upParentPos);
                minBinHeap.put(parent, positsion);
            }

            positsion = upParentPos; // m22ran elemendi positsiooniks ylemelemendi positsiooni
        }

        nextpos++;
    }

    public int dequeue(){

       /* for (int i = 1; i < minBinHeap.len()-1;i++){
            System.out.print(minBinHeap.get(i) + " ");
        }
        System.out.println();*/


        int n = 0, last = 0; //int-d, yks viimane teine esimene element

        n = minBinHeap.get(1); // v6tan esimese ja viimase elemendi m2llu
        last = minBinHeap.get(minBinHeap.len()-1);

        // panen viimase elemendi esimeseks ja esimese viimasele kohale ning eemaldan viimase elemedi (see mis kunagi oli 1)
        minBinHeap.put(last, 1);
        minBinHeap.put(n, minBinHeap.len()-1);

        minBinHeap.rem();

        return n;
    }

    public boolean isEmpty(){

        if ((super.len()-1) == 0){
            return true;
        }else return false;

    }

    void kontroll(){
        for (int i = 1; i < minBinHeap.len()-1;i++){
            System.out.print(minBinHeap.get(i) + " ");
        }

        System.out.println();
    }

}
