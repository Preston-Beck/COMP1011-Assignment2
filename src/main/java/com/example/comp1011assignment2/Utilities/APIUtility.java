package com.example.comp1011assignment2.Utilities;

import com.example.comp1011assignment2.Model.NHLStatsApiResponse;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

//public class APIUtility {
//    public static ArrayList<NHLStatsApiResponse> getTeamsFromJSON(String searchText) {
//        Gson gson = new Gson();
//        ArrayList<NHLStatsApiResponse> result = new ArrayList<>();
//        try (FileReader fileReader = new FileReader("apiResponse.json");
//             JsonReader jsonReader = new JsonReader(fileReader)) {
//            result.addAll(gson.fromJson(jsonReader, NHLStatsApiResponse.class));
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//        return result;
//    }

public class APIUtility {
    public static NHLStatsApiResponse getTeamsFromJSON() {
        Gson gson = new Gson();
        NHLStatsApiResponse result = null;
        try (FileReader fileReader = new FileReader("apiResponse.json");
             JsonReader jsonReader = new JsonReader(fileReader)) {
            result = gson.fromJson(jsonReader, NHLStatsApiResponse.class);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

//    public static NHLStatsApiResponse getTeamsFromAPI(String searchText) throws IOException, InterruptedException {
//        NHLStatsApiResponse result = null;
//        searchText = searchText.replace(" ", "%20");
//
//        String uri = "https://statsapi.web.nhl.com/api/v1/teams=" + searchText;
//
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uri)).build();
//
//        HttpResponse<Path> response = client.send(request, HttpResponse
//                .BodyHandlers.ofFile(Paths.get("apiResponse.json")));
//
//        result = getTeamsFromJSON();
//        return result;
//    }
}
