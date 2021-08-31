package com.marker_interface;

public class Disposer {
    public void dispose(Object obj) {
        if (!(obj instanceof Disposable)) {
            System.out.println("Not allowed action");
        } else {
            System.out.println("Disposed successfully");
        }
    }
}
