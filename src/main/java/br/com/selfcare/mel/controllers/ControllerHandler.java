package br.com.selfcare.mel.controllers;

import br.com.selfcare.mel.domain.LoginFailedException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.sql.SQLIntegrityConstraintViolationException;

@ControllerAdvice
public class ControllerHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {SQLIntegrityConstraintViolationException.class})
    protected ResponseEntity<Object> handleDuplicatedEmail(RuntimeException ex, WebRequest req) {
        return handleExceptionInternal(ex, "Email already used", new HttpHeaders(), HttpStatus.BAD_REQUEST, req);
    }

    @ExceptionHandler(value = {LoginFailedException.class})
    protected ResponseEntity<Object> handleLoginFailed(RuntimeException ex, WebRequest req) {
        return handleExceptionInternal(ex, "Login failed, please try again", new HttpHeaders(), HttpStatus.BAD_REQUEST, req);
    }
}
