package com.example.sharding.complex.infrastructure.exception;

/**
 * @Author: likewater
 * @Description:
 * @Date: Create in 10:34 上午 2022/3/13
 */
public class ShardingSliceNotSupportException extends RuntimeException {
    public ShardingSliceNotSupportException() {
    }

    public ShardingSliceNotSupportException(String message) {
        super(message);
    }

    public ShardingSliceNotSupportException(String message, Throwable cause) {
        super(message, cause);
    }

    public ShardingSliceNotSupportException(Throwable cause) {
        super(cause);
    }

    public ShardingSliceNotSupportException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
