import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Twins {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int[] list = new int[num];
		int total = 0;
		for(int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
			total += list[i];
		}
		Arrays.sort(list);
		int my = 0;
		int index = 0;
		int count = 0;
		int other = total;
		while(my <= total/2) {
			count++;
			my += list[num - count];
			other = total - my;
		//	System.out.println("iteration number : " +  count + " my = " + my + " other = " + other);
		}
		System.out.println(count);

	}
}

