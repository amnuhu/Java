package org.vmorg.build;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.vmorg.auth.AuthorisingService;
import org.vmorg.vm.VirtualMachine;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestSystemBuildService {
    @Test
    public void testCreateBuild() {
        VirtualMachine mockMachine = mock(VirtualMachine.class);
        SystemBuildService mockCreateMachine = mock(SystemBuildService.class);
        when(mockCreateMachine.createNewMachine(mockMachine)).thenReturn("host20230328005");
        Assertions.assertEquals("host20230328005",mockCreateMachine.createNewMachine(mockMachine));
    }

    @Test
    public void testFailBuild() {
        VirtualMachine mockMachine = mock(VirtualMachine.class);
        SystemBuildService mockCreateMachine = mock(SystemBuildService.class);
        when(mockCreateMachine.createNewMachine(mockMachine)).thenReturn("");
        Assertions.assertEquals("",mockCreateMachine.createNewMachine(mockMachine));
    }

}
