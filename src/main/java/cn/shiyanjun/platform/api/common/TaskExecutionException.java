package cn.shiyanjun.platform.api.common;

public class TaskExecutionException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public TaskExecutionException() {
		super();
	}
	
	public TaskExecutionException(String message) {
        super(message);
    }
	
	public TaskExecutionException(String message, Throwable cause) {
        super(message, cause);
    }

}
