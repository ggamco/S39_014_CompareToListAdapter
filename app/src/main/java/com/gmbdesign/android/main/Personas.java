package com.gmbdesign.android.main;


import android.support.annotation.NonNull;

/**
 * Created by ggamboa on 4/3/17.
 */

public class Personas implements Comparable<Personas> {

    private String nombre;
    private int edad;

    public Personas(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(@NonNull Personas o) {
        //devuelve un entero comparados 2 objetos
        //aqui estamos usando el compareTo de String
        //ORDEN NATURAL
        return this.getNombre().compareTo(o.getNombre());
    }

    @Override
    public String toString() {
        //sobreescribimos el metodo para usar el arrayAdapter con el arraylist
        //de no hacer esto tenemos que crear un layout con dos textview para poner nombre y edad
        return this.getNombre() + " " + this.getEdad();
    }
}
