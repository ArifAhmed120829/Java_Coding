package beecrowd;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class sqrt_xx {
	static DecimalFormat df = new DecimalFormat("0.0");

	public static void main(String[] args) {
		int number = 8;
		ArrayList<Double> list = new ArrayList<Double>();
		// sqroot 8 = 2.8*2.8
		//ex: 4 = 2*2 ex: 100 = 10*10
		double n = 2000;
		double r = 0.1;
		for(double i = 0.0; i<n; i=i+r) {
			String i2 = df.format(i);
			double x = Double.parseDouble(i2);
			if(x*x<=n) {
				list.add(x);
			}
			else {
				break;
			}
		}
		Double max = Collections.max(list);
		System.out.println(max);

	}

}
