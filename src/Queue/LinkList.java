package Queue;

/**
 * Created by Henri on 10/15/2014.
 */
class LinkList {
    private Link first;

    //LinkList constructor
    public LinkList() {
        first = null;
    }

    //Returns true if list is empty
    public boolean isEmpty() {
        return first == null;
    }

    //Inserts a new Link at the first of the list
    public void insert(int d1) {
        Link link = new Link(d1);
        link.nextLink = first;
        first = link;
    }

    //Deletes the link at the first of the list
    public Link delete() {
        Link temp = first;
        first = first.nextLink;
        return temp;
    }

    public Object getLastLink(){
        Link currentLink = first;
        Link last = null;
        while(currentLink != null) {
            currentLink.printLink();
            currentLink = currentLink.nextLink;
            last = currentLink;
        }
        return last;
    }

    //Prints list data
    public void printList() {
        Link currentLink = first;
        System.out.print("List: ");
        while(currentLink != null) {
            currentLink.printLink();
            currentLink = currentLink.nextLink;
        }
        System.out.println("");
    }
}

class LinkListTest {
    public static void main(String[] args) {
        LinkList list = new LinkList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        Link deleteditem = list.delete();
        deleteditem.printLink();

        list.insert(5);
        list.insert(6);
        list.delete();
        list.printList();

    }
}
