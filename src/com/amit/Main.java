package com.amit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.print("¿Hasta qué número quieres la lista de impares? ");
        numero = entrada.nextInt();
        System.out.println("Los números impares entre 0 y " + numero +" son:");
        for(int i = 1; i<=numero; i++){
            if(i % 2!=0){
                System.out.println(i);
            }
        }
    }
}
