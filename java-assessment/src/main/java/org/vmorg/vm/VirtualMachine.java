package org.vmorg.vm;

import org.vmorg.buildrequest.VirtualMachineRequestor;

import java.util.Objects;

public class   VirtualMachine {

    private static final int maximumVM = 999;
    private String hostname;
    private String requestorName;
    private int sizeOfRAM;
    private int sizeOfHD;
    private int numberOfCPUs;



    public VirtualMachine(String hostname, String requestorName, int sizeOfRAM, int sizeOfHD, int numberOfCPUs) {
        this.requestorName = requestorName;
        this.sizeOfRAM = sizeOfRAM;
        this.sizeOfHD = sizeOfHD;
        this.hostname = hostname;
        this.numberOfCPUs = numberOfCPUs;
    }


    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getRequestorName() {
        return requestorName;
    }

    public void setRequestorName(String requestorName) {
        this.requestorName = requestorName;
    }

    public int getSizeOfRAM() {
        return sizeOfRAM;
    }

    public void setSizeOfRAM(int sizeOfRAM) {
        this.sizeOfRAM = sizeOfRAM;
    }

    public int getSizeOfHD() {
        return sizeOfHD;
    }

    public void setSizeOfHD(int sizeOfHD) {
        this.sizeOfHD = sizeOfHD;
    }

    public int getNumberOfCPUs() {
        return numberOfCPUs;
    }

    public void setNumberOfCPUs(int numberOfCPUs) {
        this.numberOfCPUs = numberOfCPUs;
    }


}
