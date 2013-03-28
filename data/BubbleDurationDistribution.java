import java.io.*;

public class BubbleDurationDistribution {
	public static void main (String[] arg) throws Exception {
		int t,d, tlast=0, dt;
		int n=0;
		String line;
		LineNumberReader lr = new LineNumberReader(new FileReader(arg[0]));

		int[] count = new int[100];

		while (  (line = lr.readLine()) != null) {

			n++;

			if (line.startsWith("#")) {
				continue;
			}

			String[] p = line.split ("\\s+");

			if (p.length != 2) {
				continue;
			}

			t = Integer.parseInt(p[0]);
			d = Integer.parseInt(p[1]);

			if (d > 1 && d < count.length) {
				count[d]++;
			}

		}

		for (int i = 0; i < count.length; i++) {
			System.out.println (i + " " + count[i]);
		}

	}
}

