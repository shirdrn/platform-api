package cn.shiyanjun.platform.api.utils;

import cn.shiyanjun.platform.api.LifecycleAware;

public class ComponentUtils {

	public static void startAll(LifecycleAware... components) {
		for(LifecycleAware c : components) {
			c.start();
		}
	}
	
	public static void stopAllQuietly(LifecycleAware... components) {
		if(components != null) {
			for(LifecycleAware c : components) {
				try {
					c.stop();
				} catch (Exception e) {
					// ignore it
				}
			}
		}
	}
}
