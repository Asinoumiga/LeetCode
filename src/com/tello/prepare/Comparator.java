package com.tello.prepare;

public interface Comparator {

    default int compare(){
        return 0;
    }
}
