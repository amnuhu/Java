package org.vmorg.exceptions;

public class UserNotEntitledException extends Exception{
    public UserNotEntitledException() {
        super("User not entitled to receive a machine");
    }
}
