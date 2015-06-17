import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;


public class MikeFax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word = input.next();
		int count = input.nextInt();
		int i = 1;
		ArrayList<String> pals = new ArrayList<String>();
		int j = 0;
		while(j < word.length()) {
			for(; i < word.length(); i++) {
				if(word.charAt(j) == word.charAt(i)) {
					break;
				}
			}
			String firstPalCan = "";
			if(i == word.length()) {
				firstPalCan = word.substring(j, i);
			}
			else {
				firstPalCan = word.substring(j, ++i);
			}
			if(checkPals(firstPalCan)) {
				pals.add(firstPalCan);
			}
			j = i;
			i++;
		}
		HashMap<Integer, String> real = new HashMap<>();
		for(String w : pals) {
			real.put(w.length(), w);
		}
		if(pals.size() == count && real.size() == 1) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
	
	public static boolean checkPals(String firstPalCan) {
		Stack<Character> stack = new Stack<Character>();
		for(int j = 0; j < firstPalCan.length(); j++) {
			stack.add(firstPalCan.charAt(j));
		}
		int size = stack.size();
		String last = "";
		for(int j = 0; j < size; j++) {
			Character c = stack.pop();
			last += c;
		}
		if(last.equals(firstPalCan)) {
			return true;
		}
		return false;
	}
}

