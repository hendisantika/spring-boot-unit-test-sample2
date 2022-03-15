package com.hendisantika.exception;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-unit-test-sample2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 16/03/22
 * Time: 06.43
 */
public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private final String message;

    public ResourceNotFoundException(String message) {
        this.message = message;
    }
}
