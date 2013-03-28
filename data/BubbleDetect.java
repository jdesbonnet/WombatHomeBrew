import java.io.*;

public class BubbleDetect {
	public static void main (String[] arg) throws Exception {
		int a0,a1;
		int yn, ynm1=0;
		int n=0, bubbleStart=0;
		String line;
		LineNumberReader lr = new LineNumberReader(new FileReader(arg[0]));

		while (  (line = lr.readLine()) != null) {

			n++;

			if (line.startsWith("#")) {
				continue;
			}

			String[] p = line.split ("\\s+");

			if (p.length < 1) {
				continue;
			}

			a0 = Integer.parseInt(p[0]);
			a1 = Integer.parseInt(p[0]);

			if (bubbleStart > 0) {
				if (a1 > 960) {
					System.out.println (bubbleStart + " " + (n - bubbleStart));
					bubbleStart = 0;
				}
			} else {
				if (a1 < 900) {
					bubbleStart = n;
				}
			}


		}

	}
}

