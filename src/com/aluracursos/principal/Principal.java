package com.aluracursos.principal;

import com.aluracursos.modelos.ConsultaMoneda;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();


        System.out.println("**********************************************");
        System.out.println("Sea bienvenido/a al conversor de Moneda =] \n \n");


        while (opcion != 7){
            System.out.println("1) Dolar =>> Peso Argentino");
            System.out.println("2) Peso Argentino =>> Dolar");
            System.out.println("3) Dolar =>> Real brasileño");
            System.out.println("4) Real brasileño =>> Dolar");
            System.out.println("5) Dolar =>> Peso Colombiano");
            System.out.println("6) Peso Colombiano =>> Dolar");
            System.out.println("7) Salir");
            System.out.println("Elija una opcion valida");
            System.out.println("*******************************************");
            opcion = teclado.nextInt();


            switch(opcion){
                case 1:
                    System.out.println("Opcion 1");
                    consulta.consultarAPI("COP");
                    break;
                case 2:
                    System.out.println("Opcion 2");

                    break;
                case 3:
                    System.out.println("Opcion 3");
                    break;
                case 4:
                    System.out.println("Opcion 4");
                    break;
                case 5:
                    System.out.println("Opcion 5");
                    break;
                case 6:
                    System.out.println("Opcion 6");
                    break;
                case 7:
                    System.out.println("Opcion 7");
                    break;
            }
        }
    }
}
