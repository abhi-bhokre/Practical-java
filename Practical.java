import javax.swing.JApplet;
import java.awt.Graphics;

class Practical{

public static void main(String args[]) {
 
        // Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");
        
        // Appending a String
        sb.append(" World");
        System.out.println("After appending: " + sb);
        
        // Inserting a String
        sb.insert(5, " Beautiful");
        System.out.println("After inserting: " + sb);
        
        // Setting the length of the String
        sb.setLength(12);
        System.out.println("After setting length: " + sb);
        
        // Modifying the nth character in the String
        sb.setCharAt(6, 'B');
        System.out.println("After modifying 7th character: " + sb);
}
    
}
    


