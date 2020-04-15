package com.phone.phone;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	String str = String.format("Galaxy %s says %s", getVersionNumber(), getRingTone());
    	return str;
    }
    @Override
    public String unlock() {
    	return "Unlocking";
    }
    @Override
    public void displayInfo() {
    	System.out.println(String.format("Galaxy %s from %s", getVersionNumber(), getCarrier()));
    }
}

