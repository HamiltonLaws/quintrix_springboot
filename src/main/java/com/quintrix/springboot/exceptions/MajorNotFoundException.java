package com.quintrix.springboot.exceptions;

@SuppressWarnings("serial")
public class MajorNotFoundException extends RuntimeException {

  String displayMessage;

  String detailedMessage;

  public MajorNotFoundException(String displayMessage, String detailedMessage) {
    super();
    this.displayMessage = displayMessage;
    this.detailedMessage = detailedMessage;
  }

  public MajorNotFoundException() {
    super();
    // TODO Auto-generated constructor stub
  }

  public MajorNotFoundException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
    // TODO Auto-generated constructor stub
  }

  public MajorNotFoundException(String message, Throwable cause) {
    super(message, cause);
    // TODO Auto-generated constructor stub
  }

  public MajorNotFoundException(String message) {
    super(message);
    // TODO Auto-generated constructor stub
  }

  public MajorNotFoundException(Throwable cause) {
    super(cause);
    // TODO Auto-generated constructor stub
  }
}
