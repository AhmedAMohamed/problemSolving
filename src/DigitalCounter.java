import java.util.Scanner;


public class DigitalCounter {

	public static void main(String[] args) {
		int[] list = {2,7,2,3,3,4,2,5,1,2};
		Scanner in = new Scanner(System.in);
		String val = in.next();
		int a = Integer.parseInt(val.substring(0, 1));
		int b = Integer.parseInt(val.substring(1, 2));
		System.out.println(list[a]*list[b]);
	}

}
