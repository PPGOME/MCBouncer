package com.mcbouncer.exception;

public class ConfigurationException extends BouncerException {

    private static final long serialVersionUID = -2442886939908724203L;

    public ConfigurationException() {
        super();
    }

    public ConfigurationException(String msg) {
        super(msg);
    }
}