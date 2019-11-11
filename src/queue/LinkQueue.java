package queue;

/**
 *
 * @author ASUS
 */
public class LinkQueue {
    private FirstLastList theList;

    public LinkQueue() {
        theList = new FirstLastList();
    }
    public boolean isEmpty(){
        return theList.isEmpty();
    }
    public void enqueue(long j){
        theList.insertLast(j);
    }
    public long dequeue(){
        return theList.deleteFirst();
    }
    public void displayQueue(){
        System.out.print("Queue head->tail: ");
        theList.displayList();
    }
}
