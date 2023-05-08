package com.adapt;

import com.design.Pilotpen;

public class PenAdapter implements Pen{
    Pilotpen pp = new Pilotpen();

    @Override
    public void write(String str) {
        pp.mark(str);
    }
}
