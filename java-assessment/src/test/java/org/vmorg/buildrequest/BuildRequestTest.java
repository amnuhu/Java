package org.vmorg.buildrequest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.vmorg.build.SystemBuildService;
import org.vmorg.vm.VirtualMachine;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BuildRequestTest {
    @Test
    public void testCreateNewRequest() {
        VirtualMachine mockMachine = mock(VirtualMachine.class);
        SystemBuildService mockCreateMachine = mock(SystemBuildService.class);
        when(mockCreateMachine.createNewMachine(mockMachine)).thenReturn("host20230328005");
        VirtualMachineRequestor mockMachineRequrstor  = mock(VirtualMachineRequestor.class);
        

    }

}
