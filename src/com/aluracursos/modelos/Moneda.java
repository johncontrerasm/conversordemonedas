package com.aluracursos.modelos;

public class Moneda {

    String pais = "";
    Double valor = 0.0;

    public Moneda( String pais, Double valor) {
        this.valor = valor;
        this.pais = pais;
    }


    public String getPais() {
        return pais;
    }

    public Double getValor() {
        return valor;
    }


    public Double ConvertirAUSD (Double valoraconvertir, Double valordolar ){


        return valoraconvertir/valordolar;

    }

    public Double ConvertirAOTRA (double valoraconvertir, Double valordolar){

        return valoraconvertir*valordolar;

    }


    public void messagetousd(Double valoraconvertir, String currency, Double valorconvertido ){

        System.out.println("El valor de " + valoraconvertir +" [" +
                currency + "] " + "al Valor final de =>> "+
                valorconvertido +
                " [USD]");
    }

    public void messagetootra(Double valoraconvertir,String currency, Double valorconvertido){
        System.out.println("El valor de " + valoraconvertir +" [" +
                "USD] " + "al Valor final de =>> "+
                valorconvertido +
                " ["+currency+"]");
    }



}
