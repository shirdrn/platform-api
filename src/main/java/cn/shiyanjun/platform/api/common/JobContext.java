package cn.shiyanjun.platform.api.common;

import java.util.UUID;

/**
 * A in-memory object container, which can hold any key-value
 * pairs between multiple components. 
 * 
 * @author yanjun
 */
public final class JobContext extends AbstractContext {
	
	private final String name;

	public JobContext() {
        this(UUID.randomUUID().toString());
    }
	
    public JobContext(String name) {
        this.name = name;
    }

	public String getName() {
		return name;
	}

}
