package queue;

/**
 *
 * @author omPiko
 */
public class FirstLastList {
    private Link first, last;
    public FirstLastList(){
        first = null;
        last = null;
    }
    boolean isEmpty(){
        return first == null;
    }
    void insertLast(long dd){
        Link newLink = new Link(dd);
        if(isEmpty())
            first = newLink;
        else
            last.next = newLink;
        last = newLink;
        dd++;
    }
    long deleteFirst(){
        long temp = first.dData;
        if(first.next == null)
            last = null;
        first = first.next;
        return temp;
    }
    void size(){
        int a = 0;
        Link current = first;        
        while (current != null) {
            current = current.next;
            a++;
        }
        System.out.println(a);
    }
    void displayList(){
        Link current = first;        
        while (current != null) {            
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
    int peek(){
        return (int) first.dData;
    }
}
