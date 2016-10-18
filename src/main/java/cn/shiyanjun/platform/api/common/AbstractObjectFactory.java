package cn.shiyanjun.platform.api.common;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import cn.shiyanjun.platform.api.Context;

public abstract class AbstractObjectFactory<T extends Typeable> implements ObjectFactory<T> {

	private final Map<String, T> clazzToObjectCache = new HashMap<>();
	private final Map<Integer, T> typeToObjectCache = new HashMap<>();
	private final Lock lock = new ReentrantLock();
	
	@Override
	public T getObject(int type) {
		return typeToObjectCache.get(type);
	}
	
	@Override
	public T getObject(String objectClazz) {
		return clazzToObjectCache.get(objectClazz);
	}
	
	@Override
	public void registerObject(Context context, int type, String objectClazz) {
		lock.lock();
		try {
			T value = createObject(context, objectClazz);
			// set type property
			value.setType(type);
			clazzToObjectCache.put(objectClazz, value);
			typeToObjectCache.put(type, value);
		} catch (Exception e) {
			throw new RuntimeException("Fail to create object for: " + objectClazz);
		} finally {
			lock.unlock();
		}
		
	}

	protected abstract T createObject(Context context, String objectClazz) throws Exception;
}
