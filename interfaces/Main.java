package com.interfaces;
//Interface is like a contract, each class that implement an inteface must implement all
//it's methods. The interface is all abstract, meaning we define only signatures of methods
//but not implement them in it.

//We are using interfaces to provide a common behavior
// to number of classes that implement the same interface

//interfaces help us to have fewer problems in the code since it's like a commitment
//think of a large application, you have a class defined that is commonly used in different parts
//of the app. In one part of the app you would need to change the signature of one of its methods.
//This might cause problems in other places there this class is used.
//If this class had implemented it would have been harder to change the method since the signature wouldn't
//match the interface. You will still be able to change a method but it will take more effort,
//and you will avoid some problems

//So like we said an interface is like a commitment or contract for methods that their signature
//will be constant and would not change and of course the same for variables defined in interfaces

public class Main {
    public static void main(String[] args) {
//        Telephone telephone = new DesktopPhone(654321);
//        telephone.powerOn();
//        telephone.dial(654321);
//        telephone.answer();
//
//        Telephone telephone2 = new DesktopPhone(123456);
//        telephone2.dial(123456);
//        if (telephone2.call(123456))
//            System.out.println("able to call");

        Telephone mobilePhone=new MobilePhone(789);
        Telephone.powerOnStatic();
        mobilePhone.powerOnDefault();
        mobilePhone.PlugCabelIn();
        mobilePhone.postMessage();
    }
}
