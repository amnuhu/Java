package org.vmorg.vm;

public class Server extends VirtualMachine{
    private static final int sizeOfHD = 500;

    private int sizeOfRAM;
    private int numberOfCPUs;

    private String distroName;
    private int distroNumber;
    private String kernelVersion;
    private String adminTeam;


    public Server(String hostname, String requestorName, int sizeOfRAM, int numberOfCPUs, String distroName, int distroNumber, String kernelVersion, String adminTeam) {
        super(hostname, requestorName, sizeOfRAM, sizeOfHD, numberOfCPUs);
        this.distroName = distroName;
        this.kernelVersion = kernelVersion;
        this.distroNumber = distroNumber;
        this.adminTeam = adminTeam;
    }
}
