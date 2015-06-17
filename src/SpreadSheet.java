import java.util.ArrayList;
import java.util.Scanner;


public class SpreadSheet {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		ArrayList<String> results = new ArrayList<>(test);
		for(int i = 0; i < test; i++) {
			String word = in.next();
			if(word.matches("R[0-9]*C[0-9]*")) {
				String result = "";
				String[] vals = word.split("C");
				String row = vals[0].substring(1, vals[0].length());
				String col = vals[1];
				
			}
			else {
				int j = 0;
				for(; j < word.length(); j++) {
					if(Character.isDigit(word.charAt(j))) {
						break;
					}
				}
				String col = word.substring(0, j);
				String row = word.substring(j, word.length());
				String result = "";
				result += "R" + row + "C";
				int value = convertToInteger(col);
				result += value + "";
				System.out.println(result);
				results.add(result);
			}
		}
	}

	private static int convertToInteger(String col) {
		int val = 0;
		for(int i = 0; i < col.length(); i++) {
			val += Math.pow(26, col.length()-1-i) * (col.charAt(i) - 'A' + 1);
		}
		return val;
	}
}
