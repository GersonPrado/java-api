package br.utils;

import org.apache.logging.log4j.message.Message;

public class ResponseResult {
    public ResponseResult(String message) {
        Message = message;
    }

    public String Message;
}
