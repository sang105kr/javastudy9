package com.kh.exam1;

public class DepositLimitException extends Exception{
  public DepositLimitException() {
    super();
  }

  public DepositLimitException(String message) {
    super(message);
  }

  public DepositLimitException(String message, Throwable cause) {
    super(message, cause);
  }

  public DepositLimitException(Throwable cause) {
    super(cause);
  }

  protected DepositLimitException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
