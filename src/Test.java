import teine.kodutöö.algoritmid.implementations.MagazineArray;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.WriteAbortedException;

/**
 * Created by Riuno on 19.10.2014.
 */
public class Test {

    private static void Writer(String fname, int k) {
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
            k = ma.get(0);
            ma.pop();

            if (k <= 20){
                ma.push(2*k);
                ma.push(2*k + 1);
            }
            Writer("stack.out", k);

        }

    }

}
