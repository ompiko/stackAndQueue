package queue;

/**
 *
 * @author ASUS
 */
public class Link {
    public long dData;
    Link next;
    
    Link(long d){
        dData = d;
    }
    void displayLink(){
        System.out.print(dData+" ");
    }
}