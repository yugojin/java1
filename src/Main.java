import java.util.ArrayList;

public class Main {
	
	 public static void main(String[] args) {
	        Main<Integer> list = new ArrayList<>();
	 
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        
	        for(Iterator it = list.iterator(); it.hasNext();) {
	            System.out.println(it.next());
	        }
	    }

}
