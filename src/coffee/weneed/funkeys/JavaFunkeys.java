package coffee.weneed.funkeys;

import java.io.IOException;
import java.util.Arrays;

public class JavaFunkeys {
	/** The password. */
	public static String password;
	
	
	public static void main(String[] args) throws IOException {
		while (true) {
			byte[] buf = new byte[8192];
			int bytes_read = 0;
			bytes_read = System.in.read(buf, 0, buf.length);
			if (bytes_read > 0) {
				String data = new String(Arrays.copyOfRange(buf, 0, bytes_read - 2));

				System.out.println(data);
				switch (data.toLowerCase().split(" ")[0]) {
					case "stop": {
						break;
					}
					case "start": {
						break;
					}
				}
			}
		}
	}
}
