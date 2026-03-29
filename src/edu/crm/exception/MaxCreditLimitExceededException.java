package edu.crm.exception;

public class MaxCreditLimitExceededException extends RuntimeException {
    public MaxCreditLimitExceededException(String msg) {
        super(msg);
    }
}