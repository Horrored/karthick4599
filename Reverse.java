import java.util.ArrayList;
import java.util.Collections;

public class Reverse {  
    public class List {

	}

	public static void main(String[] args) {  
       ArrayList <String> l = new ArrayList<String>();  
        l.add("k");  
        l.add("L");  
        l.add("M");  
        l.add("N");  
        System.out.println("Before Reversing");  
        System.out.println(l.toString());  
          
        Collections.reverse(l);  
        System.out.println("After Reversing");  
        System.out.println(l);  
    }  
}  