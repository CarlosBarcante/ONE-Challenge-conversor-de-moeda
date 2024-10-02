package com.github.carlosbarcante.onedesafioconversordemoedas.models;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscaTaxas {

    public TaxaDeConversaoERAPI BuscarTaxa(){
        String endereco = "https://v6.exchangerate-api.com/v6/073b390c53dca04d29864c99/latest/BRL";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), TaxaDeConversaoERAPI.class);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
