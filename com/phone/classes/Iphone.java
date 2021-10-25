package com.phone.classes;
import com.phone.interfaces.*;
public class Iphone extends Phone implements Ringable {
    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	return getRingTone();
    }
    @Override
    public String unlock() {
    	return "facial recognition";
    }
    @Override
    public void displayInfo() {
        System.out.println("Iphone " + this.getVersionNumber() + "from " + this.getCarrier());
        System.out.println("Iphone " + this.getVersionNumber() + "says: " + this.getRingTone());
        System.out.println("Unlocking via " + this.unlock());         
    }
}