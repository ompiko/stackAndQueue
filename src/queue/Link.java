package queue;

/**
 *
 * @author ASUS
 */
public class Link {
    long dData;
    Link next;
    
    Link(long d){
        dData = d;
    }
    void displayLink(){
        System.out.print(dData+" ");
    }
}
