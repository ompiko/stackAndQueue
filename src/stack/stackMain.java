package stack;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class stackMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      String str;
      Scanner in = new Scanner (System.in);
      System.out.print("Input string    : ");
      str = in.next();
      System.out.print("Reverse string  : "+stack.reverse(str));
    }
    
}
