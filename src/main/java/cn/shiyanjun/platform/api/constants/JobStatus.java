package cn.shiyanjun.platform.api.constants;

public enum JobStatus {

	CREATED(0),
	SUBMITTED(1),
	QUEUEING(2),
	FETCHED(3),
	SCHEDULED(4),
	RUNNING(5),
	SUCCEEDED(6),
	FAILED(7);
	
	private int code;
	
	JobStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
}
