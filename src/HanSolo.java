import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class HanSolo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int x0 = in.nextInt();
		int y0 = in.nextInt();
		HashSet<Double> list = new HashSet<>();
		for(int i = 0; i < count; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			double slope = 0.0;
			try{
				slope = (y-y0)/(x-x0);
			}catch(Exception ex) {
				slope = Double.POSITIVE_INFINITY;
			}
			list.add(slope);
		}
		System.out.println(list.size());
	}

}
