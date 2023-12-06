import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new LinkedList();
		list.add(new Integer(5));
		list.add(new Float(13));
		list.add("Hello, Iterator Pattern!");
		
		ListIterator iterator = list.listIterator(list.size());
		while(iterator.hasPrevious()) {
			Object data = iterator.previous();
			System.out.println(data);
			if (data instanceof String) {
				iterator.remove();
			}
		}
		System.out.println("----------------");
		
//		iterator = list.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
