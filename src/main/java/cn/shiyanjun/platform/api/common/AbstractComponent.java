package cn.shiyanjun.platform.api.common;

import cn.shiyanjun.platform.api.Context;

public abstract class AbstractComponent extends AbstractName {

	protected final Context context;

	public AbstractComponent(Context context) {
		super();
		this.context = context;
		this.name = this.getClass().getSimpleName();
	}

	public Context getContext() {
		return context;
	}
	
}
