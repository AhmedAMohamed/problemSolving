import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
		int location = sc.nextInt();
		int i = 0;
		int j = 1;
		int k = 5;
		while (i < location) {
			i += k;
			k += k;
			j++;
		}
		System.out.println(names[(int) ( Math.ceil(location
				- (i - k * 0.5) / (j * 0.5)) - 1)]);
	}
}
