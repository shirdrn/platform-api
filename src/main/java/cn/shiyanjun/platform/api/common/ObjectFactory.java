package cn.shiyanjun.platform.api.common;

import cn.shiyanjun.platform.api.Context;

/**
 * Used for managing object initialization, and created objects are cached
 * in the memory for reducing the time to create.
 * 
 * @author yanjun
 *
 * @param <T>
 */
public interface ObjectFactory<T> {

	void registerObject(Context context, int type, String objectClazz);
	
	T getObject(int type);
	
	T getObject(String objectClazz);
	
}
