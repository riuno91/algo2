import teine.kodutöö.algoritmid.implementations.MagazineArray;

public class Main {

    public static void main(String[] args) {

        MagazineArray ma = new MagazineArray();

        ma.push(5);
        ma.push(2);
        ma.push(1);
        ma.push(10);
        ma.push(15);

        System.out.println(ma.pop());

        System.out.println(ma.len());
    }
}
