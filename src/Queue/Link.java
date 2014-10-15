package Queue;

/**
 * Created by Henri on 10/15/2014.
 */
class Link {
    public int data1;
    public Link nextLink;

    //Link constructor
    public Link(int d1) {
        data1 = d1;
    }

    //Print Link data
    public void printLink() {
        System.out.print("{" + data1 + "}");
    }
}
