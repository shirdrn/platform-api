package cn.shiyanjun.platform.api.common;

public abstract class AbstractName implements Nameable {

	protected String name;
	
	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
	
}
