package cn.shiyanjun.platform.api.constants;

import java.util.Optional;
import java.util.stream.Stream;

public enum TaskType {
	UNKNOWN(0),
	GREEN_PLUM(1),
	JAVA_APPLICATION(2),
	SPARK_APPLICATION(3),
	REST_CALLBACK(4),
	REST_POLLING(5);
	
	private int code;
	
	TaskType(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}

	public static Optional<TaskType> fromCode(int code) {
		return Stream.of(values()).filter((tasktype) -> {
			return tasktype.code == code;
		}).findAny();
	}
}
