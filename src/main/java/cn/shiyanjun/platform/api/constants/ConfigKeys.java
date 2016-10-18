package cn.shiyanjun.platform.api.constants;

public interface ConfigKeys {

    // Common job configuration key constants

    String JOB_TIMEOUT_SECS = "ddc.job.timeout.secs";
    String TASK_TIMEOUT_SECS = "ddc.task.timeout.secs";
    String JOB_MAX_QUEUEING_COUNT = "ddc.job.max.queueing.count";

    // Common RPC configuration key constants

    String RPC_HOST = "ddc.network.rpc.host";
    String RPC_PORT = "ddc.network.rpc.port";
    String RPC_HEARTBEAT_INTERVAL = "ddc.network.rpc.heartbeat.interval";

}
