package teine.kodutöö.algoritmid.implementations;

import com.sun.xml.internal.bind.v2.TODO;

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
        minBinHeap = new DynamicArray();
        minBinHeap.add(-11);
    }

    public void enqueue (int x){

        int positsion;  // int x-i positsiooni jaoks
        minBinHeap.add(x); // lisain xi alguses arraysse

        positsion = minBinHeap.len() - 1; //TODO: VIGAA!!!, võtab viimase positsiooni, loogikaviga
        // kuna x on viimane lisatu, v6tan ta postisiooni array viimase elemendi j2rgi
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
                System.out.println("Seis enne sisestamist");
                kontroll();
                minBinHeap.put(x, upParentPos);
                System.out.println("Seis peale x koha muutmist sisestamist ");
                kontroll();
                minBinHeap.put(parent, positsion);
                System.out.println("positsion = " + positsion);
                System.out.println("Seis peale parenti koha muutmist sisestamist ");
                kontroll();
            }

            positsion = upParentPos; // m22ran elemendi positsiooniks ylemelemendi positsiooni
        }
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
