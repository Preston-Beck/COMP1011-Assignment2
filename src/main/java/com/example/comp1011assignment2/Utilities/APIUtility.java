package com.example.comp1011assignment2.Utilities;

import com.example.comp1011assignment2.Model.NHLStatsApiResponse;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;

public class APIUtility {
    /**
     * Reads the JSON file apiResponse.json and returns an array of Team objects.
     * @return
     */
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
}
