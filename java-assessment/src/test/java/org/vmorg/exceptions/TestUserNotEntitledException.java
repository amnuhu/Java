package org.vmorg.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.vmorg.build.SystemBuildService;
import org.vmorg.buildrequest.VirtualMachineRequestor;
import org.vmorg.vm.VirtualMachine;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.*;

public class TestUserNotEntitledException {
    @Test
    public void testDoesThrowException() {
        VirtualMachine mockMachine = mock(VirtualMachine.class);
        VirtualMachineRequestor mockMachineRequestor = mock(VirtualMachineRequestor.class);

    }
}
