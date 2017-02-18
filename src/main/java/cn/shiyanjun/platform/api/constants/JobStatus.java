package cn.shiyanjun.platform.api.constants;

import java.util.Optional;
import java.util.stream.Stream;

public enum JobStatus {

	CREATED(0),
	QUEUEING(1),
	SCHEDULED(2),
	SUBMITTED(3),
	RUNNING(4),
	SUCCEEDED(5),
	FAILED(6),
	CANCELLED(7),
	TIMEOUT(8),
	FETCHED(9),
	CANCELLING(10);
	
	private int code;
	
	JobStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static Optional<JobStatus> valueOf(int code) {
        return Stream.of(JobStatus.values())
        		.filter(jobStatus -> jobStatus.code == code)
        		.findAny();
    }
}
