package com.devspring.devspring.services.exception;

import javax.xml.crypto.Data;

public class DatabaseException extends RuntimeException {
    public DatabaseException(String msg) {
        super(msg);
    }
}
