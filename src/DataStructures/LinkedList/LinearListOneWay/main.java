package DataStructures.LinkedList.LinearListOneWay;

public class main {

	public static void main(String[] args) {

		ListStructure listStructure = new ListStructure();
		
		listStructure.addNewNodeToTopOfTheList(1);
		
		listStructure.addNewNodeToEndOfTheList(2); 
		
		listStructure.addNewNodeToTopOfTheList(3); 
		
		listStructure.addNewNodeToBetween(2, 6);
		
		listStructure.addNewNodeToBetween(0, 9);
		
		listStructure.addNewNodeToBetween(1, 7);
		
		listStructure.writeTheList();//9 7 3 1 6 2  
		
		System.out.println();
		System.out.println("---------------");
		
		listStructure.removeHeadNode();
		
		listStructure.writeTheList();// 7 3 1 6 2  
		
		System.out.println();
		System.out.println("---------------");
		
		listStructure.removeTailNode();
		
		listStructure.writeTheList();// 7 3 1 6 
		
		listStructure.addNewNodeToBetween(3, 5);
		
		listStructure.addNewNodeToTopOfTheList(4);
		
		listStructure.writeTheList();// 4 7 3 1 5 6 
		
		System.out.println();
		System.out.println("---------------");
		
		listStructure.removeNodeWithIndexNo(1);
		
		listStructure.removeNodeWithIndexNo(3);
		
		listStructure.writeTheList();// 4 3 1 6 
		
		System.out.println();
		System.out.println("---------------");
		
	}
}
