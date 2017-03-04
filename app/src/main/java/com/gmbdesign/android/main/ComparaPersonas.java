package com.gmbdesign.android.main;

import java.util.Comparator;

/**
 * Created by ggamboa on 4/3/17.
 */

public class ComparaPersonas implements Comparator<Personas> {
    @Override
    public int compare(Personas o1, Personas o2) {
        //DE MAYOR A MENOR
        //return o2.getEdad() - o1.getEdad();

        //DE MENOR A MAYOR
        return o1.getEdad() - o2.getEdad();
    }
}
