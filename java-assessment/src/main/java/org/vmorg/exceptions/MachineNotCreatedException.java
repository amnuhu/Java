package org.vmorg.exceptions;

public class MachineNotCreatedException extends Exception {
    public MachineNotCreatedException() {
        super("Cannot created Machine");
    }
}
