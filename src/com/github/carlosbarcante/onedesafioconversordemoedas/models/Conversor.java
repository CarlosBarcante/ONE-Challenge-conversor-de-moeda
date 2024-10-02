package com.github.carlosbarcante.onedesafioconversordemoedas.models;

public class Conversor {

    public Double ConverteMoeda(int opcao, double valor, TaxaDeConversao taxaDeConversao){
        double taxa = 0.0;
        double valorConvertido;

        switch (opcao){
            //real para dolar
            case 1:
                taxa = taxaDeConversao.getTaxa("USD");
                break;
            //real para yuan
            case 2:
                taxa = taxaDeConversao.getTaxa("CNY");
                break;
            //real para libra
            case 3:
                taxa = taxaDeConversao.getTaxa("GBP");
                break;
            //real para peso argentino
            case 4:
                taxa = taxaDeConversao.getTaxa("ARS");
                break;
            //real para iene
            case 5:
                taxa = taxaDeConversao.getTaxa("JPY");
                break;
            //real para won
            case 6:
                taxa = taxaDeConversao.getTaxa("KRW");
                break;
        }

        valorConvertido =  valor*taxa;

        return valorConvertido;
    }
}
