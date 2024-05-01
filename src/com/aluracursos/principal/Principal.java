package com.aluracursos.principal;

import com.aluracursos.modelos.ConsultaMoneda;
import com.aluracursos.modelos.Moneda;
import com.aluracursos.modelos.MonedasAPI;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        double valoraconvertir = 0.0 ;
        String currency = "";
        Moneda moneda;
        MonedasAPI modenasapi;
        double valorconvertido = 0.0;


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
                    System.out.println("Ingrese el valor a convertir a ARS");
                    valoraconvertir = teclado.nextDouble();
                    currency="ARS";
                    modenasapi = consulta.consultarAPI(currency);
                    moneda = new Moneda(currency,Double.valueOf(modenasapi.conversion_rates().get(currency)));
                    valorconvertido = moneda.ConvertirAOTRA( valoraconvertir, moneda.getValor());
                    moneda.messagetootra(valoraconvertir,currency,valorconvertido);

                    break;
                case 2:
                    System.out.println("Opcion 2");
                    System.out.println("Ingrese el valor a convertir a USD");
                    valoraconvertir = teclado.nextDouble();
                    currency="ARS";
                    modenasapi = consulta.consultarAPI(currency);
                    moneda = new Moneda(currency,Double.valueOf(modenasapi.conversion_rates().get(currency)));
                    System.out.println("Conversion a Dolares "+moneda.ConvertirAUSD(valoraconvertir,modenasapi.conversion_rates().get(currency)));
                    valorconvertido = moneda.ConvertirAUSD(valoraconvertir,modenasapi.conversion_rates().get(currency));
                    moneda.messagetousd(valoraconvertir,currency,valorconvertido);

                    break;
                case 3:
                    System.out.println("Opcion 3");
                    System.out.println("Ingrese el valor a convertir a BRL");
                    valoraconvertir = teclado.nextDouble();
                    currency="BRL";
                    modenasapi = consulta.consultarAPI(currency);
                    moneda = new Moneda(currency,Double.valueOf(modenasapi.conversion_rates().get(currency)));
                    valorconvertido = moneda.ConvertirAOTRA( valoraconvertir, moneda.getValor());
                    moneda.messagetootra(valoraconvertir,currency,valorconvertido);
                    break;
                case 4:
                    System.out.println("Opcion 4");
                    System.out.println("Ingrese el valor a convertir a USD");
                    valoraconvertir = teclado.nextDouble();
                    currency="BRL";
                    modenasapi = consulta.consultarAPI(currency);
                    moneda = new Moneda(currency,Double.valueOf(modenasapi.conversion_rates().get(currency)));
                    System.out.println("Conversion a Dolares "+moneda.ConvertirAUSD(valoraconvertir,modenasapi.conversion_rates().get(currency)));
                    valorconvertido = moneda.ConvertirAUSD(valoraconvertir,modenasapi.conversion_rates().get(currency));
                    moneda.messagetousd(valoraconvertir,currency,valorconvertido);
                    break;
                case 5:
                    System.out.println("Opcion 5");
                    System.out.println("Ingrese el valor a convertir a COP");
                    valoraconvertir = teclado.nextDouble();
                    currency="COP";
                    modenasapi = consulta.consultarAPI(currency);
                    moneda = new Moneda(currency,Double.valueOf(modenasapi.conversion_rates().get(currency)));
                    valorconvertido = moneda.ConvertirAOTRA( valoraconvertir, moneda.getValor());
                    moneda.messagetootra(valoraconvertir,currency,valorconvertido);
                    break;
                case 6:
                    System.out.println("Opcion 6");
                    System.out.println("Ingrese el valor a convertir a COP");
                    valoraconvertir = teclado.nextDouble();
                    currency="COP";
                    modenasapi = consulta.consultarAPI(currency);
                    moneda = new Moneda(currency,Double.valueOf(modenasapi.conversion_rates().get(currency)));
                    System.out.println("Conversion a Dolares "+moneda.ConvertirAUSD(valoraconvertir,modenasapi.conversion_rates().get(currency)));
                    valorconvertido = moneda.ConvertirAUSD(valoraconvertir,modenasapi.conversion_rates().get(currency));
                    moneda.messagetousd(valoraconvertir,currency,valorconvertido);
                    break;
                case 7:
                    System.out.println("Opcion 7");
                    break;
            }
        }

    }
}
