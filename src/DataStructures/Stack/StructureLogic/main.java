package DataStructures.Stack.StructureLogic;

public class main {

	public static void main(String[] args) {
		Stack stack = new Stack(4);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		//stack.push(50);
		System.out.println(stack.pull());
		System.out.println(stack.pull());
		System.out.println(stack.pull());
	}
}
