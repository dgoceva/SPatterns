
public class IteratorPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  NamesCollection namesCollection = new NamesCollection();
		  System.out.println("Names: ");
	      for(Iterator iter = namesCollection.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println(name);
	      } 	
	}

}
