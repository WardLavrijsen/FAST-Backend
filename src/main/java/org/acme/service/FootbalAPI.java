package org.acme.service;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

import javax.json.Json;
import java.net.*;
import java.io.*;

public class FootbalAPI {

    public static HttpResponse<JsonNode> test() throws Exception {
            // URL url = new URL("https://jsonplaceholder.typicode.com/todos/1");
            // URLConnection yc = url.openConnection();
            // BufferedReader in = new BufferedReader(
            //                     new InputStreamReader(
            //                     yc.getInputStream()));
            // String inputLine;

            // while ((inputLine = in.readLine()) != null) 
            //     System.out.println(inputLine);
            // in.close();
            HttpResponse<JsonNode> response = Unirest.get("https://v3.football.api-sports.io/leagues")
            .header("x-rapidapi-key", "46592bcaa6678eb4c63c300054402f18")
            .header("x-rapidapi-host", "v3.football.api-sports.io")
            .asJson();
            return response;
        }
}