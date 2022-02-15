package Stack.Stack;

public class main {
	public static void main(String[] args) {
		
		StackStructure structure = new StackStructure(4);
		
		structure.push(10);
		structure.push(20);
		structure.push(30);
		structure.writeTheList();
		
		System.out.println();
		structure.pull();
		
		System.out.println();
		structure.writeTheList();
	}

}
