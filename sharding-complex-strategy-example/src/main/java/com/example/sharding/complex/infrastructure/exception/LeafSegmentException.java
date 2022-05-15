package com.example.sharding.complex.infrastructure.exception;

/**
 * @Author: likewater
 * @Description:
 * @Date: Create in 10:34 上午 2022/3/13
 */
public class LeafSegmentException extends RuntimeException {
    public LeafSegmentException() {
    }

    public LeafSegmentException(String message) {
        super(message);
    }

    public LeafSegmentException(String message, Throwable cause) {
        super(message, cause);
    }

    public LeafSegmentException(Throwable cause) {
        super(cause);
    }

    public LeafSegmentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
