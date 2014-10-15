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

    /**
     * lisame elemendi järjekorda
     * @param x
     */
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

        int n = 0, last = 0; //int-d, yks viimane teine esimene element

        n = minBinHeap.get(1); // v6tan esimese ja viimase elemendi m2llu
        last = minBinHeap.get(nextpos-1);
        minBinHeap.put(last,1);
        minBinHeap.rem();

        nextpos--;
        kontroll();
        organizeHeap();
        kontroll();
        return n;
    }

    public boolean isEmpty(){

        if ((super.len()-1) == 0){
            return true;
        }else return false;

    }

    private void organizeHeap(){
        int curPos = 1;

        while(true){
            int leftParent = 2*curPos,  rightParent = 2*curPos + 1, curValue = minBinHeap.get(1),
                    smallestPos = curPos;

            if (leftParent <(nextpos-1) && minBinHeap.get(leftParent) < minBinHeap.get(smallestPos)) {
                smallestPos = leftParent;
            }

            if (rightParent < (nextpos-1) && minBinHeap.get(rightParent) < minBinHeap.get(smallestPos)) {
                smallestPos = rightParent;
            }

            if (curPos != smallestPos){
                int smaller = minBinHeap.get(smallestPos);
                /// mille panen ja kuhu panen
                minBinHeap.put(minBinHeap.get(curPos),smallestPos);
                minBinHeap.put(smaller,curPos);
                curPos = smallestPos;
                kontroll();
            }else break;


        }

    }

    private void kontroll(){
        for (int i = 1; i < minBinHeap.len()-1;i++){
            System.out.print(minBinHeap.get(i) + " ");
        }

        System.out.println();
    }

}
