package teine.kodutöö.algoritmid.implementations;

/**
 * Created by Riuno on 14.10.2014.
 */
public class MagazineArray extends DynamicArray {

    /**
     * konstruktor
     * create()
     *
     */
    public MagazineArray() {
        super();
    }

    /**
     *
     * @param x
     */
    public void push(int x){
        super.add(x);
    }

    public int pop (){
        int n = 0;

        n = super.rem();

        return n;
    }
    public boolean isEmpty(){

        if ((super.len()-1) == 0){
            return true;
        }else return false;


    }
}
