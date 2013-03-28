import java.io.*;

public class LowPassFilter {
	public static void main (String[] arg) throws Exception {
		int a0,a1;
		int yn, ynm1=0;
		String line;
		LineNumberReader lr = new LineNumberReader(new FileReader(arg[0]));

		while (  (line = lr.readLine()) != null) {
			if (line.startsWith("#")) {
				continue;
			}

			String[] p = line.split ("\\s+");

			if (p.length != 2) {
				continue;
			}

			a0 = Integer.parseInt(p[0]);
			a1 = Integer.parseInt(p[1]);

			yn = (7*ynm1 + a1)/8;

			System.out.println (yn);

			ynm1 = yn;
		}

	}
}

