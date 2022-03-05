package DataStructures.AppFindPalindromName;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		WordsQueue queue = new WordsQueue(999);

		WordsStack stack = new WordsStack(999);

		Scanner scan = new Scanner(System.in);
		System.out.println("Please,enter a name");
		String name = scan.next();

		char[] nameList = name.toCharArray();
		
		for (int i = 0; i < nameList.length; i++) {
			char inputChat = nameList[i];
			stack.push(inputChat);
			queue.enQueue(inputChat);
		}
		boolean isWordPalindrom = true;
		
		for (int i = 0; i < name.length() ; i++) {
			char char1 = stack.pull();
			char char2 = queue.deQueue();
			if(char1 != char2) {
				System.out.println(name +" -> Name isn't palindrom..!");
				isWordPalindrom = false;
				break;
			}
		}
		if(isWordPalindrom == true) {
			System.out.println(name +" -> Name is palindrom..!");
		}
	}
}
