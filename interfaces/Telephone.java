package com.interfaces;

public interface Telephone extends ElectronicDevice, CommunicationDevice {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean call(int phoneNumber);
    boolean isRinging();

    static void powerOnStatic(){
        System.out.println("Static method invoked");
    }

    default void powerOnDefault(){
        System.out.println("Default method invoked");
    }
}
