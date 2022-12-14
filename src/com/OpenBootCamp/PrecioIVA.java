package com.OpenBootCamp;

public class PrecioIVA {

    public static void main(String[] args) {

        int valor1= 10;
        int valor2= 20;
        double valor3= 25.1;
        int valor4= 73;
        double precio1= calculoPrecio(valor1);
        double precio2= calculoPrecio(valor2);
        double precio3= calculoPrecio(valor3);
        double precio4= calculoPrecio(valor4);
        System.out.println("El precio final con IVA de " + valor1 + " es: " + precio1 + " euros");
        System.out.println("El precio final con IVA de " + valor2 + " es: " + precio2 + " euros");
        System.out.println("El precio final con IVA de " + valor3 + " es: " + precio3 + " euros");
        System.out.println("El precio final con IVA de " + valor4 + " es: " + precio4 + " euros");


    }

    public static double calculoPrecio(double precio){
        double preciofinal= precio* 1.21;
        return preciofinal;
    }
}
