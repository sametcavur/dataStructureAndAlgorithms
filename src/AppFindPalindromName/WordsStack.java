package AppFindPalindromName;

public class WordsStack {
	
	int stackSize;
	Node topNode;
	int count;
	
	public WordsStack(int stackSize) {
		this.stackSize = stackSize;
		this.topNode = null;
		this.count = 0;
	}
	
	void push(char character) {
		Node newNode = new Node(character);
		if(this.isFull()) {
			System.out.println("Stack is full..!");
		}else {
			if(this.isEmpty()) {
				topNode = newNode;
			}else {
				newNode.nextNode = topNode;
				topNode = newNode;	
			}
			count++;
		}
	}
	
	char pull() {
		char character = '*';
		if(this.isEmpty()) {
			System.out.println("Stack is empty..!");
		}else {
			character = topNode.word;
			topNode = topNode.nextNode;
			count--;
		}
		return character;
	}
	
	boolean isFull() {
		return count == stackSize;
	}
	
	boolean isEmpty() {
		return count == 0;
	}

	
}
