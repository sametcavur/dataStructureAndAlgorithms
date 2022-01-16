package LinkedList.OneWayCircularList;

public class main {

	public static void main(String[] args) {
		
		ListStructure list = new ListStructure();
		
		list.addNewNode(20);
		list.addNewNode(30);
		list.addNewNode(40);
		list.addNewNode(50);
		System.out.println();
		
		list.writeTheList();
	}
}
