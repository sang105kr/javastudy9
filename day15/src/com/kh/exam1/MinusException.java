package com.kh.exam1;

public class MinusException extends RuntimeException{
  public MinusException() {
    super();
  }

  public MinusException(String message) {
    super(message);
  }

  public MinusException(String message, Throwable cause) {
    super(message, cause);
  }

  public MinusException(Throwable cause) {
    super(cause);
  }

  protected MinusException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
