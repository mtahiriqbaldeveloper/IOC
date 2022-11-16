package org.devexperts.ImmutableInteger;

import net.jcip.annotations.GuardedBy;

public class MutableInteger{

    @GuardedBy("this") private int value;

    public synchronized void setValue(int value){
        this.value = value;
    }
    public synchronized int getValue(){
        System.out.println(value);
        return value;
    }


}
