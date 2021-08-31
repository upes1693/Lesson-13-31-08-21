package com.interfaces;

public class MobilePhone implements Telephone {
    private int phoneNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void postMessage() {
        System.out.println("Posting msg from mobile");
    }

    @Override
    public void powerOn() {
        System.out.println("Turning on");
        isOn = true;

    }

    @Override
    public void powerOnDefault() {
        System.out.println("Default implementation has been overridden");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Dialing to number: " + phoneNumber);
        } else {
            System.out.println("Phone is off. Please tun on first.");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering phone call");
            isRinging = false;
        }
    }

    @Override
    public boolean call(int phoneNumber) {
        if (this.phoneNumber == phoneNumber && isOn) {
            isRinging = true;
            System.out.println("ringing!");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    @Override
    public void PlugCabelIn() {
        System.out.println("Plugged in mobile phone. Charging...");
    }
}
