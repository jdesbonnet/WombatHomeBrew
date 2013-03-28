import java.io.*;

public class BubbleRate {
	public static void main (String[] arg) throws Exception {
		int t,d, tlast=0, dt;
		int n=0;
		String line;
		LineNumberReader lr = new LineNumberReader(new FileReader(arg[0]));

		int[] count = new int[300];

		while (  (line = lr.readLine()) != null) {

			

			if (line.startsWith("#")) {
				continue;
			}

			String[] p = line.split ("\\s+");

			if (p.length != 2) {
				continue;
			}


			t = Integer.parseInt(p[0]);
			d = Integer.parseInt(p[1]);


			dt = t - tlast;

			if (dt > 30000) {
				System.out.println (tlast + " "  + ((double)n * 100.0 / (long)dt) );
				tlast = t; n=0;
			} else {
				n++;
			}

		}


	}
}

