package com.nizami.abstract_factory.transport.impl.aircraft;

import com.nizami.abstract_factory.transport.intefaces.Aircraft;

public class TU134 implements Aircraft {
    @Override
    public void flight() {
        System.out.println("TU-134 flight");
    }
}
