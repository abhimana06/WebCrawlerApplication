package com.abhi.WebCrawlerApp.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.server.ServerErrorException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@Slf4j
@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    public RestResponseEntityExceptionHandler() {
        super();
    }


    // 500
    @ExceptionHandler({ NullPointerException.class, IllegalArgumentException.class, IllegalStateException.class,InvalidKeyException.class, NoSuchAlgorithmException.class, NoSuchPaddingException.class, IllegalBlockSizeException.class, BadPaddingException.class, UnsupportedEncodingException.class, IOException.class, GeneralSecurityException.class,ServerErrorException.class })
    /*500*/public ResponseEntity<Object> handleInternal(final RuntimeException ex, final WebRequest request) {
        logger.error("500 Status Code", ex);
        return new ResponseEntity<>("Exception Occured",HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler({ AppException.class })
    protected ResponseEntity<Object> handleAppException(final RuntimeException ex, final WebRequest request) {
        log.error("Error : ",ex);
        AppException appEx = (AppException)ex;
        return new ResponseEntity<>(ex,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
