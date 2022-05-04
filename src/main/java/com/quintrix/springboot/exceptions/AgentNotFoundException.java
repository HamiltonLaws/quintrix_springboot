package com.quintrix.springboot.exceptions;

@SuppressWarnings("serial")
public class AgentNotFoundException extends RuntimeException {

  String displayMessage;

  String detailedMessage;

  public AgentNotFoundException() {
    super();
    // TODO Auto-generated constructor stub
  }

  public AgentNotFoundException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
    // TODO Auto-generated constructor stub
  }

  public AgentNotFoundException(String message, Throwable cause) {
    super(message, cause);
    // TODO Auto-generated constructor stub
  }

  public AgentNotFoundException(String message) {
    super(message);
    // TODO Auto-generated constructor stub
  }

  public AgentNotFoundException(Throwable cause) {
    super(cause);
    // TODO Auto-generated constructor stub
  }

  public AgentNotFoundException(String displayMessage, String detailedMessage) {
    super();
    this.displayMessage = displayMessage;
    this.detailedMessage = detailedMessage;
  }
}
