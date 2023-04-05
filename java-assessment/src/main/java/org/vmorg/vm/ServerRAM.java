package org.vmorg.vm;

public enum ServerRAM {
    RAMA(64), RAMB(128);
    private int numberCPUs;

    ServerRAM(int numberCPUs) {
        this.numberCPUs = numberCPUs;
    }

    public int getNumber() {
        return numberCPUs;
    }
}
