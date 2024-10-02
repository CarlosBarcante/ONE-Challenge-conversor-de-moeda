package com.github.carlosbarcante.onedesafioconversordemoedas.models;

import java.util.Map;

public class TaxaDeConversao {
    private Map<String, Double> taxas;

    public TaxaDeConversao(TaxaDeConversaoERAPI taxaDeConversaoERAPI){
        this.taxas = taxaDeConversaoERAPI.conversion_rates();
    }

    public double getTaxa(String moeda){
        return this.taxas.get(moeda);
    }
}
