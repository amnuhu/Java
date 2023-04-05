package org.vmorg.vm;

public class Desktop  extends  VirtualMachine{

    private static final int sizeOfRAM = 16;
    private static final int sizeOfHD = 160;
    private int numberOfCPUs;
    private int msWindowsVersion;
    private String buildNumber;


    public Desktop(String hostname, String requestorName, int numberOfCPUs, int msWindowsVersion, String buildNumber) {
        super(hostname, requestorName, sizeOfRAM, sizeOfHD, numberOfCPUs);
        this.msWindowsVersion = msWindowsVersion;
        this.buildNumber = buildNumber;
    }
}
