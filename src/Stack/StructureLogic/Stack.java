package Stack.StructureLogic;

public class Stack {
	int list[];
	int listSize;
	int indexNo;
	
	public Stack(int listSize) {
		this.listSize = listSize;
		this.list = new int[listSize];
		this.indexNo = -1;
	}
	
	void push(int data) {
		if(this.isListFull()) {
			System.out.println("List is already full, you can not to add new item to list..!");
		}else {
			indexNo++; 
			list[indexNo] = data;
			System.out.println("New Item : "+list[indexNo]);
		}
	}
	
	int pull() {
		if(this.isListEmpty()) {
			System.out.println("List is empty,there is no item to show");
			return -1;
		}else {
			System.out.print("This item is removed : ");
			return list[indexNo--];
		}
	}
	
	boolean isListFull() {
		return indexNo == (listSize-1);
	}
	
	boolean isListEmpty() {
		return indexNo == -1;
}
}
