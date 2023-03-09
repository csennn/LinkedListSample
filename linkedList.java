import java.util.LinkedList;
public class LinkedListExapmle {

	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<>();
		
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		
		linkedList.addFirst(100);
		linkedList.addLast(300);
		
		System.out.println(linkedList);
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		
	}

}