package queue;

/**
 *
 * @author omPiko
 */
public class LinkQueue{
    private final FirstLastList theList;
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
    public int peek(){
        return theList.peek();
    }
    public void size(){
        System.out.println("Size of queue:");
        theList.size();
    }
}
