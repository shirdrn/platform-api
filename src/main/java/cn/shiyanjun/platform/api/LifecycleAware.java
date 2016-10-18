package cn.shiyanjun.platform.api;

/**
 * Used for component whose life cycle can be managed by invoking
 * the methods provided by this agreement.
 *
 * @author yanjun
 */
public interface LifecycleAware {

	/**
	 * Start the component.
	 */
	void start();

	/**
	 * Stop the component.
	 */
	void stop();
}
