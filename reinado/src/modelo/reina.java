/*

*/

package modelo;

import java.util.Scanner;

public class reina implements  Comparable<reina> {

        
    private String nombre;
    private String apodo;
    private int tamaño_barriga;
    private int numero_novios;
    private String intensidad_olor;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getTamaño_barriga() {
        return tamaño_barriga;
    }

    public void setTamaño_barriga(int tamaño_barriga) {
        this.tamaño_barriga = tamaño_barriga;
    }

    public int getNumero_novios() {
        return numero_novios;
    }

    public void setNumero_novios(int numero_novios) {
        this.numero_novios = numero_novios;
    }

    public String getIntensidad_olor() {
        return intensidad_olor;
    }

    public void setIntensidad_olor(String intensidad_olor) {
        this.intensidad_olor = intensidad_olor;
    }

    @Override
    public int compareTo(reina reinita) 
    {
        return this.getApodo().compareTo(reinita.getApodo());
        
    }
    
     public String toString()
     {
         return "\n apodo " + apodo +"\n nombre " + nombre;
     }

}

/* COMPLETAR LA INTERFAZ COMPARAR _ Y ADEMAS MOSTRAR APODOS POR LA PRIMERA LETRA _ N NOVIOS _ BARRIGA*/