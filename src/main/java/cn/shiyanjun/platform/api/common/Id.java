package cn.shiyanjun.platform.api.common;

public interface Id<T> {
	
	void setId(T id);
	T getId();
}
