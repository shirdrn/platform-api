package cn.shiyanjun.platform.api.constants;

import java.util.Optional;
import java.util.stream.Stream;

public enum TaskStatus {

    CREATED(0),
    QUEUEING(1),
    SCHEDULED(2),
    SUBMITTED(3),
    RUNNING(4),
    SUCCEEDED(5),
    FAILED(6),
    CANCELLED(7),
    TIMEOUT(8);

    private int code;

    TaskStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static Optional<TaskStatus> valueOfCode(int code) {
        return Stream.of(TaskStatus.values()).filter(taskStatus -> taskStatus.code == code).findAny();
    }
}
