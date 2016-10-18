package cn.shiyanjun.platform.api.utils;

import java.io.Closeable;
import java.io.IOException;

public class IoUtils {

	public static void closeQuietly(Closeable... streams) {
		if(streams != null) {
			for(Closeable stream : streams) {
				try {
					stream.close();
				} catch (IOException e) {}
			}
		}
	}
}
