package com.quintrix.springboot.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler(value = {IllegalArgumentException.class, IllegalStateException.class})
  protected ResponseEntity<Object> handleConflict(RuntimeException ex, WebRequest request) {
    Error error = new Error();
    error.setMessage("This came from IllegalArgumentException or IllegalStateException");
    error.setCustomMessage(ex.getMessage());
    error.setHttpStatusCode(HttpStatus.CONFLICT.value());
    return handleExceptionInternal(ex, error, new HttpHeaders(), HttpStatus.CONFLICT, request);
  }

  @ExceptionHandler(value = AgentNotFoundException.class)
  public ResponseEntity<Object> handleException2(Exception ex, WebRequest request) {
    if (ex instanceof AgentNotFoundException) {
      Error error = new Error();
      error.setMessage(((AgentNotFoundException) ex).displayMessage);
      error.setCustomMessage(((AgentNotFoundException) ex).detailedMessage);
      error.setHttpStatusCode(HttpStatus.NOT_FOUND.value());
      return handleExceptionInternal(ex, error, new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    } else {
      return null;
    }
  }

  @ExceptionHandler(value = StudentNotFoundException.class)
  public ResponseEntity<Object> handleException3(Exception ex, WebRequest request) {
    if (ex instanceof StudentNotFoundException) {
      Error error = new Error();
      error.setMessage(((StudentNotFoundException) ex).displayMessage);
      error.setCustomMessage(((StudentNotFoundException) ex).detailedMessage);
      error.setHttpStatusCode(HttpStatus.NOT_FOUND.value());
      return handleExceptionInternal(ex, error, new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    } else {
      return null;
    }
  }
}
