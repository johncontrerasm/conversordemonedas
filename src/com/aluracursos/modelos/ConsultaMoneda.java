package com.aluracursos.modelos;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    public void consultarAPI (String currency) {

        String url = "https://v6.exchangerate-api.com/v6/0af90cd5928ad817c12c709e/latest/USD";
        URI direccion = URI.create(url);
        HttpClient client = HttpClient.newBuilder()
                .followRedirects(HttpClient.Redirect.ALWAYS)
                .build();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Código de estado: " + response.statusCode());
            System.out.println(response.body());
 //           return new Gson().fromJson(response.body(),Pelicula.class);

        } catch (Exception e) {
            throw new RuntimeException("No encontre esa Moneda");
        }



    }


}
