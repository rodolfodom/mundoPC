package com.gm.mundopc;

import java.util.Arrays;

public class Orden {
    private final int idOrden;
    private Computadora[] computadoras;
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int  MAX_COMPUTADORAS = 10;

    public Orden() {
        this.idOrden = Orden.contadorOrdenes++;
        computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS){
            this.computadoras[this.contadorComputadoras++] = computadora;
        }else{
            System.out.println("Ha alcanzado la cantidad maxima de computadoras para esta orden");
        }
    }

    public void mostrarOden(){

        System.out.println("idOrden = " + idOrden);
        for (Computadora computadora: computadoras) {
            if(computadora != null){
                System.out.println(computadora);
            }
        }

    }

    @Override
    public String toString() {
        return "Orden{" +
                "idOrden=" + idOrden +
                ", computadoras=" + Arrays.toString(computadoras) +
                ", contadorComputadoras=" + contadorComputadoras +
                '}';
    }
}
