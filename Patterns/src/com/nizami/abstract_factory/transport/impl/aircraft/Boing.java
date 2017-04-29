package com.nizami.abstract_factory.transport.impl.aircraft;

import com.nizami.abstract_factory.transport.intefaces.Aircraft;

public class Boing implements Aircraft {
    @Override
    public void flight() {
        System.out.println("Boing flight");
    }
}
