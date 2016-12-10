package cn.shiyanjun.platform.api.constants;

public interface ConfigKeys {

    // Common job configuration key constants

    String JOB_TIMEOUT_SECS = "platform.job.timeout.secs";
    String TASK_TIMEOUT_SECS = "platform.task.timeout.secs";
    String JOB_MAX_QUEUEING_COUNT = "platform.job.max.queueing.count";

    // Common RPC configuration key constants

    String RPC_HOST = "platform.network.rpc.host";
    String RPC_PORT = "platform.network.rpc.port";
    String RPC_HEARTBEAT_INTERVAL = "platform.network.rpc.heartbeat.interval";

}
